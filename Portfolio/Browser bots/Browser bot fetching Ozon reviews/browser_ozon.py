from selenium import webdriver
from selenium.webdriver.common.by import By

import modules.files as files

path_to_driver = files.get_path('chrome_driver')
browser = webdriver.Chrome(path_to_driver)
browser.implicitly_wait(10)
browser.get(f'https://www.ozon.ru/product/300684532/reviews')
result = browser.find_element(By.XPATH, "//div[@version='0'][1]")

print(result.find_element(By.XPATH))
browser.close()

