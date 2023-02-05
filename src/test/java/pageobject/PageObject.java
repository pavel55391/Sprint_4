package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObject {
    //нажимаем на на закрытие всплывающего окна
    private static final By CLICK_ON_BUTTON = By.className("App_CookieButton__3cvqF");
    //элемент выпадающего списка (1)
    private static final By CLICK_ON_ELEMENT_LIST = By.xpath("//*[@id=\"accordion__heading-0\"]");
    //содержимое элемента 1
    private static final By ELEMENT_CONTENT = By.xpath("//*[@id=\"accordion__panel-0\"]/p");
    // для 2 и 3 теста  ----------------------------------------------------------------------
    //Нажать кнопку 'заказать' вверху
    private static final By ORDER_BUTTON = By.xpath("//*[@id=\"root\"]//div[2]/button['Заказать']");
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
    //Ввод даты когда привезти самокат
    private static final By DATE = By.xpath("//*[@id=\"root\"]//div[1]/div/input");
    //Срок аренды
    private static final By RENTAL_PERIOD = By.xpath("//div/div[2]/div[2]/div[2]");

    public WebDriver driver;

    public PageObject(WebDriver driver) {
        this.driver = driver;
        driver.get("https://qa-scooter.praktikum-services.ru/");
    }

    public String clickOnListElement() {
        driver.findElement(CLICK_ON_BUTTON).click();
        driver.findElement(CLICK_ON_ELEMENT_LIST).click(); //нажимаем на элемент выпадающего списка
        return driver.findElement(ELEMENT_CONTENT).getText();
    }

    public String orderSamokatForFirstUser() {
        driver.findElement(CLICK_ON_BUTTON).click();
        driver.findElement(ORDER_BUTTON).click();
        prepareFirstUser();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/button")).click();
        driver.findElement(DATE).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div//div[2]/div[6]")).click(); //выбо даты
        driver.findElement(RENTAL_PERIOD).click();
        driver.findElement(By.cssSelector("div > div.Dropdown-menu > div:nth-child(1)")).click(); //сутки
        driver.findElement(By.xpath("//*[@id=\"root\"]/div//div[3]/label[1]")).click();//черный жемчуг
        driver.findElement(By.cssSelector(" div >div.Order_Buttons__1xGrp > button:nth-child(2)")).click();//нажимаем на кнопку заказать
        driver.findElement(By.cssSelector(" div > div.Order_Modal__YZ-d3 > div.Order_Buttons__1xGrp > button:nth-child(2)")).click();// нажимаем кнопку ДА
        String content = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[5]/div[1]")).getText();
        return content.split("\n")[0];
    }

    public String orderSamokatForSecondUser() {
        driver.findElement(CLICK_ON_BUTTON).click();
        driver.findElement(ORDER_BUTTON).click();
        prepareSecondUser();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/button")).click();
        driver.findElement(DATE).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div//div[2]/div[6]")).click(); //выбо даты
        driver.findElement(RENTAL_PERIOD).click();
        driver.findElement(By.cssSelector("div > div.Dropdown-menu > div:nth-child(1)")).click(); //сутки
        driver.findElement(By.xpath("//*[@id=\"root\"]/div//div[3]/label[1]")).click();//черный жемчуг
        driver.findElement(By.cssSelector(" div >div.Order_Buttons__1xGrp > button:nth-child(2)")).click();//нажимаем на кнопку заказать
        driver.findElement(By.cssSelector(" div > div.Order_Modal__YZ-d3 > div.Order_Buttons__1xGrp > button:nth-child(2)")).click();// нажимаем кнопку ДА
        String content = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[5]/div[1]")).getText();

        return content.split("\n")[0];
    }

    private void prepareFirstUser() {
        driver.findElement(NAME).sendKeys("Никита");
        driver.findElement(SURNAME).sendKeys("Митин");
        driver.findElement(ADDRESS).sendKeys("Смольная 27");
        driver.findElement(METRO_STATION).sendKeys("Сокол");
        driver.findElement(By.xpath("//div[text()='Сокол']")).click();
        driver.findElement(PHONE_NUMBER).sendKeys("+9850418739");
    }

    private void prepareSecondUser() {
        driver.findElement(NAME).sendKeys("Антон");
        driver.findElement(SURNAME).sendKeys("Михеев");
        driver.findElement(ADDRESS).sendKeys("Кутузовская 66");
        driver.findElement(METRO_STATION).sendKeys("Черкизовская");
        driver.findElement(By.xpath("//div[text()='Черкизовская']")).click();
        driver.findElement(PHONE_NUMBER).sendKeys("+9857495063");
    }
}
