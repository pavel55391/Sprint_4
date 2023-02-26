package ru.practikum.yandex.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PopupPageObject {
       //URL адрес страницы ЯндексСамокат
       private static final String ORDER_URL = "https://qa-scooter.praktikum-services.ru/";
        //нажимаем на на закрытие всплывающего окна
        private static final By CLICK_ON_BUTTON = By.className("App_CookieButton__3cvqF");
        //элемент выпадающего списка (1)
        private static final By CLICK_ON_ELEMENT_LIST_1 = By.xpath("//*[@id=\"accordion__heading-0\"]");
        //содержимое элемента 1
        private static final By ELEMENT_CONTENT_1 = By.xpath("//*[@id=\"accordion__panel-0\"]/p");
        //элемент выпадающего списка (2)
        private static final By CLICK_ON_ELEMENT_LIST_2 = By.xpath("//*[@id=\"accordion__heading-1\"]");
        //содержимое элемента 2
        private static final By ELEMENT_CONTENT_2 = By.xpath("//*[@id=\"accordion__panel-1\"]");
        //элемент выпадающего списка (3)
        private static final By CLICK_ON_ELEMENT_LIST_3 = By.xpath("//*[@id=\"accordion__heading-2\"]");
        //содержимое элемента 3
        private static final By ELEMENT_CONTENT_3 = By.xpath("//*[@id=\"accordion__panel-2\"]");
        //элемент выпадающего списка (4)
        private static final By CLICK_ON_ELEMENT_LIST_4 = By.xpath("//*[@id=\"accordion__heading-3\"]");
        //содержимое элемента 4
        private static final By ELEMENT_CONTENT_4 = By.xpath("//*[@id=\"accordion__panel-3\"]");
        //элемент выпадающего списка (5)
        private static final By CLICK_ON_ELEMENT_LIST_5 = By.xpath("//*[@id=\"accordion__heading-4\"]");
        //содержимое элемента 5
        private static final By ELEMENT_CONTENT_5 = By.xpath("//*[@id=\"accordion__panel-4\"]");
        //элемент выпадающего списка (6)
        private static final By CLICK_ON_ELEMENT_LIST_6 = By.xpath("//*[@id=\"accordion__heading-5\"]");
        //содержимое элемента 6
        private static final By ELEMENT_CONTENT_6 = By.xpath("//*[@id=\"accordion__panel-5\"]");
        //элемент выпадающего списка (7)
        private static final By CLICK_ON_ELEMENT_LIST_7 = By.xpath("//*[@id=\"accordion__heading-6\"]");
        //содержимое элемента 7
        private static final By ELEMENT_CONTENT_7 = By.xpath("//*[@id=\"accordion__panel-6\"]");
        //элемент выпадающего списка (8)
        private static final By CLICK_ON_ELEMENT_LIST_8 = By.xpath("//*[@id=\"accordion__heading-7\"]");
        //содержимое элемента 8
        private static final By ELEMENT_CONTENT_8 = By.xpath("//*[@id=\"accordion__panel-7\"]");


        public WebDriver driver;

        public PopupPageObject(WebDriver driver) {
            this.driver = driver;
            driver.get(ORDER_URL);
        }

        public String clickOnListElement_1() {
            driver.findElement(CLICK_ON_BUTTON).click();
            driver.findElement(CLICK_ON_ELEMENT_LIST_1).click();
            return driver.findElement(ELEMENT_CONTENT_1).getText();
        }
        public String clickOnListElement_2() {
            driver.findElement(CLICK_ON_BUTTON).click();
            driver.findElement(CLICK_ON_ELEMENT_LIST_2).click();
            return driver.findElement(ELEMENT_CONTENT_2).getText();
        }
        public String clickOnListElement_3() {
            driver.findElement(CLICK_ON_BUTTON).click();
            driver.findElement(CLICK_ON_ELEMENT_LIST_3).click();
            return driver.findElement(ELEMENT_CONTENT_3).getText();
        }
        public String clickOnListElement_4() {
            driver.findElement(CLICK_ON_BUTTON).click();
            driver.findElement(CLICK_ON_ELEMENT_LIST_4).click();
            return driver.findElement(ELEMENT_CONTENT_4).getText();
        }
        public String clickOnListElement_5() {
            driver.findElement(CLICK_ON_BUTTON).click();
            driver.findElement(CLICK_ON_ELEMENT_LIST_5).click();
            return driver.findElement(ELEMENT_CONTENT_5).getText();
        }
        public String clickOnListElement_6() {
            driver.findElement(CLICK_ON_BUTTON).click();
            driver.findElement(CLICK_ON_ELEMENT_LIST_6).click();
            return driver.findElement((ELEMENT_CONTENT_6)).getText();
        }
        public String clickOnListElement_7() {
            driver.findElement(CLICK_ON_BUTTON).click();
            driver.findElement(CLICK_ON_ELEMENT_LIST_7).click();
            return driver.findElement((ELEMENT_CONTENT_7)).getText();
        }
        public String clickOnListElement_8() {
            driver.findElement(CLICK_ON_BUTTON).click();
            driver.findElement(CLICK_ON_ELEMENT_LIST_8).click();
            return driver.findElement((ELEMENT_CONTENT_8)).getText();
        }
}
