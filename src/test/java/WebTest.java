import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageobject.PageObject;

public class WebTest {

    private WebDriver driver;
    private PageObject pageObject;

    @Before
    public void setUp() {
        //driver = new ChromeDriver();
        driver = new FirefoxDriver();
        pageObject = new PageObject(driver);
    }

    @Test
    public void checkTextInPopupWindowTest() {
        String displayContent = pageObject.clickOnListElement();
        String element = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        Assert.assertEquals(displayContent, element);
    }


    @Test
    public void checkSamokatOrderForFirstUserTest() {
        String displayContent = pageObject.orderSamokatForFirstUser();
        String elementOrder = "Заказ оформлен";
        Assert.assertEquals(displayContent, elementOrder);
    }

    @Test
    public void checkSamokatOrderForSecondUserTest() {
        String displayContent = pageObject.orderSamokatForSecondUser();
        String elementOrder = "Заказ оформлен";
        Assert.assertEquals(displayContent, elementOrder);
    }

    @After
    public void cleanUP() {
        if (driver != null) {
            driver.quit();
        }
    }
}
