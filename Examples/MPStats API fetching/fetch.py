from datetime import date, timedelta, datetime
from copy import deepcopy
import modules.async_requests as async_requests
import modules.session_requests as session_requests
import modules.single_requests as single_requests
import modules.google_work as google_work
import modules.wildberries.info as wb_info
import modules.info as info
import json, re

_mpstats_info = dict()
_mpstats_categories_info = dict()
_mpstats_positions = dict()


def _mpstats_positions_by_supplier(headers, supplier, start_date):
    nm_list = [item['id'] for item in _mpstats_info_by_supplier(headers, supplier)]
    return _mpstats_positions_by_nm_list(headers, nm_list, start_date)


def _mpstats_positions_by_suppliers_list(headers, suppliers_list, start_date):
    suppliers_info_dict = _mpstats_info_by_suppliers_list(headers, suppliers_list)
    suppliers_positions_dict = dict()
    for supplier, items in suppliers_info_dict.items():
        nm_list = [item['id'] for item in items]
        suppliers_positions_dict[supplier] = _mpstats_positions_by_nm_list(headers, nm_list, start_date)
    return suppliers_positions_dict


def _mpstats_positions_by_nm_list(headers, nm_list, start_date):
    result = _mpstats_positions.get(tuple(nm_list))
    if result is None:
        urls_list = [f'https://mpstats.io/api/wb/get/item/{nm}/by_category' for nm in nm_list]
        params = {'d1': str(start_date), 'd2': str(date.today())}
        result = async_requests.fetch('GET', nm_list, urls_list=urls_list, params=params,
                                      headers=headers, content_type='json')
        _mpstats_positions[tuple(nm_list)] = result
    return deepcopy(result)


def mpstats_positions(supplier=None, suppliers_list=None, nm_list=None, nm=None,
                      start_date=str(date.today()-timedelta(days=7))):
    headers = {'X-Mpstats-TOKEN': info.mpstats_token(),
               'Content-Type': 'application/json'}
    if supplier is None \
        and suppliers_list is None \
        and nm_list is None \
        and nm is None: raise AttributeError("No input data to fetch positions.")
    elif supplier is not None: return _mpstats_positions_by_supplier(headers, supplier, start_date)
    elif suppliers_list is not None: return _mpstats_positions_by_suppliers_list(headers, suppliers_list, start_date)
    elif nm is not None: return _mpstats_positions_by_nm_list(headers, [nm], start_date)
    elif nm_list is not None: return _mpstats_positions_by_nm_list(headers, nm_list, start_date)


def _mpstats_info_by_supplier(headers, supplier):
    result = _mpstats_info.get(supplier)
    if result is None:
        url = 'https://mpstats.io/api/wb/get/seller'
        body = {"startRow": 0, "endRow": 5000}
        result = list()
        for identifier in wb_info.seller_identifiers(supplier):
            params = {'path': identifier}
            result += single_requests.fetch('POST', content_type='json', url=url,
                                            body=body, params=params, headers=headers)['data']
        _mpstats_info[supplier] = result
    return deepcopy(result)


def _mpstats_info_by_suppliers_list(headers, suppliers_list):
    return {supplier: _mpstats_info_by_supplier(headers, supplier) for supplier in suppliers_list}


def _mpstats_info_by_nm_list(headers, nm_list):
    suppliers_info_dict = _mpstats_info_by_suppliers_list(headers, wb_info.all_suppliers())
    info_dict = {supplier: [] for supplier in suppliers_info_dict.keys()}
    for supplier, items in suppliers_info_dict.items():
        for item in items:
            if item['id'] in nm_list: info_dict[supplier].append(item)
    return info_dict


def mpstats_info(supplier=None, suppliers_list=None, nm_list=None, nm=None):
    headers = {'X-Mpstats-TOKEN': info.mpstats_token(),
               'Content-Type': 'application/json'}
    if supplier is None \
        and suppliers_list is None \
        and nm_list is None \
        and nm is None: raise AttributeError("No input data to fetch info.")
    elif supplier is not None: return _mpstats_info_by_supplier(headers, supplier)
    elif suppliers_list is not None: return _mpstats_info_by_suppliers_list(headers, suppliers_list)
    elif nm is not None: return _mpstats_info_by_nm_list(headers, [nm])
    elif nm_list is not None: return _mpstats_info_by_nm_list(headers, nm_list)


def mpstats_categories_info(categories_list, start_date=str(date.today()-timedelta(days=7)),
                            end_date=str(date.today()-timedelta(days=1))):
    result = _mpstats_categories_info.get(tuple([tuple(categories_list), start_date, end_date]))
    if result is None:
        headers = {'X-Mpstats-TOKEN': info.mpstats_token(),
                   'Content-Type': 'application/json'}
        url = 'https://mpstats.io/api/wb/get/category/by_date'
        params_list = [{'path': category.strip(), 'groupBy': 'day',
                       'd1': str(start_date), 'd2': str(end_date)}
                       for category in categories_list]
        result_dict = async_requests.fetch("GET", categories_list, content_type='json', url=url,
                                           params_list=params_list, headers=headers)
        result = {category: {item['period']: item for item in day_values}
                  for category, day_values in result_dict.items()}
        _mpstats_categories_info[tuple([tuple(categories_list), start_date, end_date])] = result
    return deepcopy(result)


