import re
import json

pat = '(\d+)\s(\S+)'
pat_num = '(\d+)'
pat_str = '(\S+)'

def open_json_config(conf_path):
    with open(conf_path, "r") as read_file:
        data = json.load(read_file)
        print('settings:\n{}'.format(data))
    return data

def collect_from_important(filename):
    ids_list = []
    names_list = []
    with open(filename, 'r') as f:
        for line in f:
            res = re.search(pat, line)
            if res:
                ids_list.append(res.group(1))
                names_list.append(res.group(2))
    return ids_list, names_list

def collect_from_file(filename):
    str_list = []
    num_list = []
    with open(filename, 'r') as f:
        for line in f:
            res_str = re.search(pat_str, line)
            res_num = re.search(pat_num, line)
            if res_str:
                str_list.append(res_str.group(1))
            if res_num:
                num_list.append(res_num.group(1))
    return num_list, str_list

def save_items_to_file(it_list):
    with open('not_in_list.txt', 'w') as f:
        for i in it_list:
            f.write(i+'\n')

if __name__ == "__main__":
    data = open_json_config('conf.json')
    ids_list, names_list = collect_from_important(data['path'])
    num_list, str_list = collect_from_file('items_to_check.txt')
    print(num_list)
    print(str_list)
    if num_list != []:
        nums = set(num_list)
        nums -= set(ids_list)
        str_list = []
        save_items_to_file(nums)
    if str_list != []:
        strs = set(str_list) 
        strs -= set(names_list)
        save_items_to_file(strs)
