import time

from selenium import webdriver
import logging

from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By

logger = logging.getLogger('simple_example')
logger.setLevel(logging.INFO)
ch = logging.StreamHandler()
ch.setLevel(logging.DEBUG)
formatter = logging.Formatter('%(asctime)s - %(name)s - %(levelname)s - %(message)s')
ch.setFormatter(formatter)
logger.addHandler(ch)

driver = webdriver.Chrome(service=Service('/usr/local/bin/chromedriver'))

logger.info('Przechodzę na stronę www.trojmasto.pl')
driver.get('http://www.trojmiasto.pl')
logger.info('Akceptuje ciasteczka')
driver.find_element(By.XPATH, "//*[@id='onetrust-accept-btn-handler']").click()
time.sleep(2)
driver.find_element(By.XPATH, "//*[@id='navi-main']/ul/li[2]/a").click()
time.sleep(2)
driver.find_element(By.XPATH, "//*[@id='navi-main']/ul/li[4]/a").click()
driver.find_element(By.ID, 'ogl_search').click()
driver.find_element(By.ID, 'ogl_search').click()
driver.find_element(By.ID, 'ogl_search').send_keys("praca")
time.sleep(2)
driver.find_element(By.XPATH, "//form[@id='top-searchbox-form']/div/div[2]/button[2]").click()
time.sleep(4)
driver.find_element(By.XPATH, "//ul[@id='breadcrumbs']/li/span/a/span").click()
time.sleep(10)
driver.close()