import logging

from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By

logger = logging.getLogger('simple_example')
logger.setLevel(logging.INFO)
ch = logging.StreamHandler()
ch.setLevel(logging.DEBUG)
formatter = logging.Formatter('%(asctime)s - %(name)s - %(levelname)s - %(message)s')
ch.setFormatter(formatter)
logger.addHandler(ch)

driver = webdriver.Firefox(service=Service('/usr/local/bin/geckodriver'))

logger.info('Przechodzę na stronę www.wp.pl')
driver.get("https://www.wp.pl/")
#driver.find_element(By.CSS_SELECTOR,'button.cfibjq5:nth-child(2)')
driver.find.element(By.XPATH, "//html/body/div[2]/div/div[2]/div[3]/div/button[2]").click()
#driver.find.element(By.XPATH,"//a[@id='6835968125212289-202']/div[2]/div")
driver.get("https://sportowefakty.wp.pl/pilka-nozna/1031734/haniebny-gest-fifa-przyjela-pieniadze-skapane-w-ukrainskiej-krwi")
driver.find.element(By.XPATH,"//img[@alt='WP']").click()
driver.get("https://www.wp.pl/?src01=20804&refabtest=adtech%7CPA-11%7CA%3Badtech%7CPRG-3468%7CA%3Badtech%7CPRG-3344%7CB%3Badtech%7CFAPO-700%7CA%3Badtech%7CPRG-3701%7CC%3Bapplication%7CPSFLIA-441%7CA")
driver.get("https://www.wp.pl/?src01=20804")
driver.find.element(By.LINK_TEXT,'Poczta').click()
driver.get("https://profil.wp.pl/login/login.html")
driver.find.element(By.ID, "login").click()
driver.find.element(By.ID, "login").clear()
driver.find.element(By.ID, "login").send_keys("kasia@wp.pl")
driver.find.element(By.XPATH,"//div[@id='stgMain']/div/div/div/form/div[2]/label").click()
driver.find.element(By.ID,'password').clear()
driver.find.element(By.ID, 'password').send_keys("mlyska")
driver.find.element(By.XPATH,"//button[@type='submit']").click()


driver.find.element(By.CSS_SELECTOR, ".js-rodo-accept").click()
driver.find.element(By.XPATH,"//i").click()
driver.find.element(By.LINK_TEXT,"bestsellery").click()
driver.get("https://drogeriapigment.pl/153-bestsellery")
driver.find.element(By.LINK_TEXT,"Do koszyka").click()
driver.find.element(By.XPATH,"//div[@id='layer_cart']/div/div[2]/div[2]/a").click()
driver.get("https://drogeriapigment.pl/szybkie-zakupy")
driver.find.element(By.XPATH,"//a[@id='16795_0_0_0']/i").click()
driver.find.element(By.XPATH,"//img[@alt='Drogeria Pigment']").click()

driver.close()