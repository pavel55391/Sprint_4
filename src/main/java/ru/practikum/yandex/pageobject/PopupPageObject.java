package ru.practikum.yandex.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PopupPageObject {
       //URL адрес страницы ЯндексСамокат
       private static final String ORDER_URL = "https://qa-scooter.praktikum-services.ru/";
        //нажимаем на на закрытие всплывающего окна
        private static final By CLOSE_POPUP_WINDOW = By.className("App_CookieButton__3cvqF");
        //элемент выпадающего списка (1)
        private static final By QUESTION_PRICE_LIST = By.xpath("//*[@id=\"accordion__heading-0\"]");
        //содержимое элемента 1
        private static final By ANSWER_PRICE_LIST = By.xpath("//*[@id=\"accordion__panel-0\"]/p");
        //элемент выпадающего списка (2)
        private static final By QUESTION_ORDER_SEVERAL_SAMOCAT = By.xpath("//*[@id=\"accordion__heading-1\"]");
        //содержимое элемента 2
        private static final By ANSWER_ORDER_SEVERAL_SAMOCAT = By.xpath("//*[@id=\"accordion__panel-1\"]");
        //элемент выпадающего списка (3)
        private static final By QUESTION_RENTAL_TIME = By.xpath("//*[@id=\"accordion__heading-2\"]");
        //содержимое элемента 3
        private static final By ANSWER_RENTAL_TIME = By.xpath("//*[@id=\"accordion__panel-2\"]");
        //элемент выпадающего списка (4)
        private static final By QUESTION_ORDER_SAMOCAT_TODAY = By.xpath("//*[@id=\"accordion__heading-3\"]");
        //содержимое элемента 4
        private static final By ANSWER_ORDER_SAMOCAT_TODAY = By.xpath("//*[@id=\"accordion__panel-3\"]");
        //элемент выпадающего списка (5)
        private static final By QUESTION_EXTEND_LEASE_SAMOCAT = By.xpath("//*[@id=\"accordion__heading-4\"]");
        //содержимое элемента 5
        private static final By ANSWER_EXTEND_LEASE_SAMOCAT = By.xpath("//*[@id=\"accordion__panel-4\"]");
        //элемент выпадающего списка (6)
        private static final By QUESTION_CHARGING_TOGETHER_WITH_SAMOCAT = By.xpath("//*[@id=\"accordion__heading-5\"]");
        //содержимое элемента 6
        private static final By ANSWER_CHARGING_TOGETHER_WITH_SAMOCAT = By.xpath("//*[@id=\"accordion__panel-5\"]");
        //элемент выпадающего списка (7)
        private static final By QUESTION_CANCEL_ORDER = By.xpath("//*[@id=\"accordion__heading-6\"]");
        //содержимое элемента 7
        private static final By ANSWER_CANCEL_ORDER = By.xpath("//*[@id=\"accordion__panel-6\"]");
        //элемент выпадающего списка (8)
        private static final By QUESTION_DELIVERY_SAMOCAT = By.xpath("//*[@id=\"accordion__heading-7\"]");
        //содержимое элемента 8
        private static final By ANSWER_DELIVERY_SAMOCAT = By.xpath("//*[@id=\"accordion__panel-7\"]");


        private WebDriver driver;

        public PopupPageObject(WebDriver driver) {
            this.driver = driver;
            driver.get(ORDER_URL);
            driver.findElement(CLOSE_POPUP_WINDOW).click();
        }

        public String clickOnListElementPriceList() {
            driver.findElement(QUESTION_PRICE_LIST).click();
            return driver.findElement(ANSWER_PRICE_LIST).getText();
        }
        public String clickOnListElementSeveralSamocat() {
            //driver.findElement(CLOSE_POPUP_WINDOW).click();
            driver.findElement(QUESTION_ORDER_SEVERAL_SAMOCAT).click();
            return driver.findElement(ANSWER_ORDER_SEVERAL_SAMOCAT).getText();
        }
        public String clickOnListElementRentalTime() {
            driver.findElement(QUESTION_RENTAL_TIME).click();
            return driver.findElement(ANSWER_RENTAL_TIME).getText();
        }
        public String clickOnListElementOrderSamokatToday() {
            driver.findElement(QUESTION_ORDER_SAMOCAT_TODAY).click();
            return driver.findElement(ANSWER_ORDER_SAMOCAT_TODAY).getText();
        }
        public String clickOnListElementExtendLeaseSamokat() {
            driver.findElement(QUESTION_EXTEND_LEASE_SAMOCAT).click();
            return driver.findElement(ANSWER_EXTEND_LEASE_SAMOCAT).getText();
        }
        public String clickOnListElementChargingSamocat() {
            driver.findElement(QUESTION_CHARGING_TOGETHER_WITH_SAMOCAT).click();
            return driver.findElement((ANSWER_CHARGING_TOGETHER_WITH_SAMOCAT)).getText();
        }
        public String clickOnListElementCancelOrder() {
            driver.findElement(QUESTION_CANCEL_ORDER).click();
            return driver.findElement((ANSWER_CANCEL_ORDER)).getText();
        }
        public String clickOnListElementDeliverySamocat() {
            driver.findElement(QUESTION_DELIVERY_SAMOCAT).click();
            return driver.findElement((ANSWER_DELIVERY_SAMOCAT)).getText();
        }
}
