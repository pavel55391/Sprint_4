import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.practikum.yandex.pageobject.PopupPageObject;

@RunWith(Parameterized.class)
public class PopupWindowTest {

    private String actual;
    private String expected;

    public PopupWindowTest(String actual, String expected) {
        this.actual = actual;
        this.expected = expected;
    }

    @Test //1
    public void checkTextInPopupWindowFirstTest() {
        Assert.assertEquals(expected, actual);
    }
    @Test //2
    public void checkTextInPopupWindowSecondTest() {
        Assert.assertEquals(expected, actual);
    }
    @Test //3
    public void checkTextInPopupWindowThirdTest() {
        Assert.assertEquals(expected, actual);
    }
    @Test //4
    public void checkTextInPopupWindowFourthTest() {
        Assert.assertEquals(expected, actual);
    }
    @Test //5
    public void checkTextInPopupWindowFifthTest() {
        Assert.assertEquals(expected, actual);
    }
    @Test //6
    public void checkTextInPopupWindowSixthTest() {
        Assert.assertEquals(expected, actual);
    }
    @Test //7
    public void checkTextInPopupWindowSeventhTest() {
        Assert.assertEquals(expected, actual);
    }
    @Test //8
    public void checkTextInPopupWindowEighthTest() {
        Assert.assertEquals(expected, actual);;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        WebDriver driver = new FirefoxDriver();
        PopupPageObject popup = new PopupPageObject(driver);
        Object[][] testData = new Object[][]{
                {popup.clickOnListElementPriceList(), "Сутки — 400 рублей. Оплата курьеру — наличными или картой."},
                {popup.clickOnListElementSeveralSamocat(), "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."},
                {popup.clickOnListElementRentalTime(), "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."},
                {popup.clickOnListElementOrderSamokatToday(), "Только начиная с завтрашнего дня. Но скоро станем расторопнее."},
                {popup.clickOnListElementExtendLeaseSamokat(), "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."},
                {popup.clickOnListElementChargingSamocat(), "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."},
                {popup.clickOnListElementCancelOrder(), "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."},
                {popup.clickOnListElementDeliverySamocat(), "Да, обязательно. Всем самокатов! И Москве, и Московской области."},
        };
        driver.quit();
        return testData;
    }
}

