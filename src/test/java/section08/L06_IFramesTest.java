package section08;

import org.config.BaseTest;
import org.pages.IFramePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class L06_IFramesTest extends BaseTest {

   IFramePage iFramePage;

    @BeforeMethod
    private void beforeMethod() {
        setUpWithChrome();
        iFramePage = new IFramePage(driver);
        driver.get(iFramePage.baseUrl);
    }

    @Test
    void testFirstIframe() {
        var firstFrame = driver.findElement(iFramePage.firstIframe);
        driver.switchTo().frame(firstFrame);
        iFramePage.clickBurgerMenu();
        waitForElement(iFramePage.iFrameMenuHeading, 2000);
        Assert.assertTrue(driver.findElement(iFramePage.iFrameMenuHeading).isDisplayed(), "Iframe menu heading element is not displayed");
        Assert.assertTrue(driver.findElement(iFramePage.iFrameMenuHeading).getText().contains("Menu"), "Iframe menu heading is not 'Menu' ");
    }

    @Test
    void testSecondIframe() throws InterruptedException {
        driver.switchTo().frame(1);
        iFramePage.playVideo();
        Thread.sleep(20000);
    }


    @AfterMethod
    private void tearDown() {
        driver.quit();
    }
}
