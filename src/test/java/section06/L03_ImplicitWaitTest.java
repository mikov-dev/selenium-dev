package section06;

import org.config.BaseTest;
import org.pages.WaitsPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class L03_ImplicitWaitTest extends BaseTest {

    WaitsPage waitsPage;

    @BeforeMethod
    private void beforeMethod() {
        setUpWithChrome();
        waitsPage = new WaitsPage(driver);
        driver.get(waitsPage.baseUrl);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    void testImplicitWait() {
        driver.findElement(waitsPage.loaderButton).click();
        Assert.assertTrue(driver.findElement(waitsPage.hiddenText).isDisplayed());
        Assert.assertTrue(driver.findElement(waitsPage.hiddenText).getText().contains("And you have clicked the button!"));
    }

    @AfterMethod
    private void tearDown() {
        driver.quit();
    }

}
