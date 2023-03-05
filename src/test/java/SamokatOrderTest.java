import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.practikum.yandex.pageobject.SamokatPageObject;
import ru.practikum.yandex.pageobject.UserData;

public class SamokatOrderTest {
    private WebDriver driver;
    private SamokatPageObject samokatPageObject;

    @Before
    public void setUp() {
        //driver = new ChromeDriver();
        driver = new FirefoxDriver();
        samokatPageObject = new SamokatPageObject(driver);
    }

    @Test
    public void checkSamokatOrderForFirstScenarioTest() {
        UserData firstUser = new UserData("Никита", "Митин", "Смольная 27", "Сокол", "+9850418739");
        String displayContent = samokatPageObject.orderSamokatForFirstScenario(firstUser);
        String elementOrder = "Заказ оформлен";
        Assert.assertEquals(elementOrder, displayContent);
    }

    @Test
    public void checkSamokatOrderForSecondScenarioTest() {
        UserData secondUser = new UserData("Антон", "Михеев", "Кутузовская 66", "Черкизовская", "+9857495063");
        String displayContent = samokatPageObject.orderSamokatForSecondScenario(secondUser);
        String elementOrder = "Заказ оформлен";
        Assert.assertEquals(elementOrder, displayContent);
    }

    @After
    public void cleanUP() {
        if (driver != null) {
            driver.quit();
        }
    }
}

