import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.practikum.yandex.pageobject.PopupPageObject;
import ru.practikum.yandex.pageobject.SamokatPageObject;

public class PopupWindowTest {
    private WebDriver driver;
    private PopupPageObject popupPageObject;

    @Before
    public void setUp() {
        //driver = new ChromeDriver();
        driver = new FirefoxDriver();
        popupPageObject = new PopupPageObject(driver);
    }

    @Test //1
    public void checkTextInPopupWindowFirstTest() {

        String displayContent = popupPageObject.clickOnListElement_1();
        String element = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        Assert.assertEquals(element, displayContent);
    }
    @Test //2
    public void checkTextInPopupWindowSecondTest() {

        String displayContent = popupPageObject.clickOnListElement_2();
        String element = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        Assert.assertEquals(element, displayContent);
    }
    @Test //3
    public void checkTextInPopupWindowThirdTest() {

        String displayContent = popupPageObject.clickOnListElement_3();
        String element = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        Assert.assertEquals(element, displayContent);
    }
    @Test //4
    public void checkTextInPopupWindowFourthTest() {

        String displayContent = popupPageObject.clickOnListElement_4();
        String element = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        Assert.assertEquals(element, displayContent);
    }
    @Test //5
    public void checkTextInPopupWindowFifthTest() {

        String displayContent = popupPageObject.clickOnListElement_5();
        String element = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        Assert.assertEquals(element, displayContent);
    }
    @Test //6
    public void checkTextInPopupWindowSixthTest() {

        String displayContent = popupPageObject.clickOnListElement_6();
        String element = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        Assert.assertEquals(element, displayContent);
    }
    @Test //7
    public void checkTextInPopupWindowSeventhTest() {

        String displayContent = popupPageObject.clickOnListElement_7();
        String element = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        Assert.assertEquals(element, displayContent);
    }
    @Test //8
    public void checkTextInPopupWindowEighthTest() {

        String displayContent = popupPageObject.clickOnListElement_8();
        String element = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        Assert.assertEquals(element, displayContent);
    }



    @After
    public void cleanUP() {
        if (driver != null) {
            driver.quit();
        }
    }
}

