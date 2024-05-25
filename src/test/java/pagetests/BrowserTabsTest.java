package pagetests;

import org.config.BaseTest;
import org.pages.BrowserTabsPage;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BrowserTabsTest extends BaseTest {

    BrowserTabsPage browserTabsPage;

    @BeforeClass
    private void BeforeClass() {
        setUpWithChrome();
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

    @AfterClass
    private void tearDown() {
        driver.quit();
    }

}
