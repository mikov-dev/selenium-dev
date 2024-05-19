package section06;

import org.config.BaseTest;
import org.pages.WaitsPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class L04_ExplicitWaitTest extends BaseTest {

    WaitsPage waitsPage;

    @BeforeMethod
    private void beforeMethod() {
        setUpWithChrome();
        waitsPage = new WaitsPage(driver);
        driver.get(waitsPage.baseUrl);
    }

    @Test
    void testExplicitWait() {
        var waitButton = waitsPage.waitForElement(waitsPage.loaderButton, 7);
        waitButton.click();
        Assert.assertTrue(driver.findElement(waitsPage.hiddenText).isDisplayed());
    }

    @AfterMethod
    private void tearDown() {
        driver.quit();
    }

}
