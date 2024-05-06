package pagetests;

import org.config.BaseTest;
import org.pages.BrowserTabsPage;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BrowserTabsTest extends BaseTest {

    BrowserTabsPage browserTabsPage;

    @BeforeTest
    private void beforeTest() {
        setUp();
        browserTabsPage = new BrowserTabsPage(driver);
        driver.get(browserTabsPage.baseUrl);
    }

    @Test(description = "verify the functionality of the 'open new tab' button")
    public void verifyOpenNewTabTest() throws InterruptedException {
        browserTabsPage.clickNewTabButton();
        switchToTab(1);
        Thread.sleep(1000);
        Assert.assertTrue(driver.getCurrentUrl().contains("www.google.com"));
    }

    @AfterTest
    private void tearDown() {
        driver.quit();
    }

}
