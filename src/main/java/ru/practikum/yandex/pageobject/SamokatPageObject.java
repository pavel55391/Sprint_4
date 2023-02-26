package ru.practikum.yandex.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

// TODO Разбить класс на 2. 1 - для тестирования попапов, 2 - для тестирования заказа самоката
public class SamokatPageObject {
    //URL адрес страницы ЯндексСамокат
    private static final String ORDER_URL = "https://qa-scooter.praktikum-services.ru/";
    //нажимаем на на закрытие всплывающего окна
    private static final By CLICK_ON_BUTTON = By.className("App_CookieButton__3cvqF");
    //Нажать кнопку 'заказать' вверху
    private static final By ORDER_BUTTON = By.xpath("//*[@id=\"root\"]//div[2]/button['Заказать']");
    //Нажать кнопку заказать внизу
    private static final By ORDER_BUTTON_LOWER = By.xpath("//*[@id=\"root\"]//div[5]/button['Заказать']");
    //Ввести имя
    private static final By NAME = By.xpath("//div[2]/div[1]/input");
    //Ввести фамилию
    private static final By SURNAME = By.xpath("//div[2]/input");
    //Ввести адрес заказа
    private static final By ADDRESS = By.xpath("//*[@id=\"root\"]//div[3]/input");
    //Станция метро
    private static final By METRO_STATION = By.xpath("//*[@id=\"root\"]//div[4]/div/div/input");
    //Ввод телефона
    private static final By PHONE_NUMBER = By.xpath("//*[@id=\"root\"]//div[5]/input");
    //Нажать кнопку "Далее"
    private static final By FURTHER_BUTTON= By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/button");
    //Ввод даты когда привезти самокат
    private static final By DATE = By.xpath("//*[@id=\"root\"]//div[1]/div/input");
    //Выбор даты из выподающего списка
    private static final By DATE_SELECT = By.xpath("//*[@id=\"root\"]/div//div[2]/div[6]");
    //Выбор срока аренды "Сутки"
    private static final By RENTAL_PERIOD_PER_DAY = By.cssSelector("div > div.Dropdown-menu > div:nth-child(1)");
    //Выбор цвета
    private static final By SELECT_COLOR = By.xpath("//*[@id=\"root\"]/div//div[3]/label[1]");
    //Нажать кнопку "Заказать"
    private static final By ORDER_BUTTON_CLICK = By.cssSelector("div > div.Order_Buttons__1xGrp > button:nth-child(2)");
    //Нажать кнопку "ДА"
    private static final By YES_BUTTON_CLICK = By.cssSelector("div > div.Order_Modal__YZ-d3 > div.Order_Buttons__1xGrp > button:nth-child(2)");



    //Срок аренды
    private static final By RENTAL_PERIOD = By.xpath("//div/div[2]/div[2]/div[2]");



    public WebDriver driver;

    public SamokatPageObject(WebDriver driver) {
        this.driver = driver;
        driver.get(ORDER_URL);
    }



    public String orderSamokatForFirstUser(UserData userData) {
        driver.findElement(CLICK_ON_BUTTON).click();
        driver.findElement(ORDER_BUTTON).click();
        prepareUser(userData);
        driver.findElement(FURTHER_BUTTON).click();
        driver.findElement(DATE).click();
        driver.findElement(DATE_SELECT).click(); //выбо даты
        driver.findElement(RENTAL_PERIOD).click();
        driver.findElement(RENTAL_PERIOD_PER_DAY).click(); //сутки
        driver.findElement(SELECT_COLOR).click();//черный жемчуг
        driver.findElement(ORDER_BUTTON_CLICK).click();//нажимаем на кнопку заказать
        driver.findElement(YES_BUTTON_CLICK).click();// нажимаем кнопку ДА
        String content = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[5]/div[1]")).getText();
        return content.split("\n")[0];
    }

    public String orderSamokatForSecondUser(UserData userData) {
        driver.findElement(CLICK_ON_BUTTON).click();
        driver.findElement(ORDER_BUTTON_LOWER).click();
        prepareUser(userData);
        driver.findElement(FURTHER_BUTTON).click();
        driver.findElement(DATE).click();
        driver.findElement(DATE_SELECT).click(); //выбо даты
        driver.findElement(RENTAL_PERIOD).click();
        driver.findElement(RENTAL_PERIOD_PER_DAY).click(); //сутки
        driver.findElement(SELECT_COLOR).click();//черный жемчуг
        driver.findElement(ORDER_BUTTON_CLICK).click();//нажимаем на кнопку заказать
        driver.findElement(YES_BUTTON_CLICK).click();// нажимаем кнопку ДА
        String content = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[5]/div[1]")).getText();

        return content.split("\n")[0];
    }

    private void prepareUser(UserData userData) {
        driver.findElement(NAME).sendKeys(userData.getName());
        driver.findElement(SURNAME).sendKeys(userData.getSurname());
        driver.findElement(ADDRESS).sendKeys(userData.getAddress());
        driver.findElement(METRO_STATION).sendKeys(userData.getMetroStation());
        driver.findElement(By.xpath("//div[text()='" + userData.getMetroStation() + "']")).click();
        driver.findElement(PHONE_NUMBER).sendKeys(userData.getPhoneNumber());
    }
}
