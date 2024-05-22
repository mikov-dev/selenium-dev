package section08;

import org.config.BaseTest;
import org.pages.BrowserTabsPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class L07_BrowserTabsTest extends BaseTest {

    BrowserTabsPage browserTabsPage;

    List<String> browserTabs;

    @BeforeMethod
    private void beforeMethod() {
        setUpWithChrome();
        browserTabsPage = new BrowserTabsPage(driver);
        driver.get(browserTabsPage.baseUrl);
    }

    @Test
    void testBrowserTabPage() throws InterruptedException {
        for (int i = 0; i < 3; i++) {
            browserTabsPage.clickNewTabButton();
        }
        browserTabs = new ArrayList<>(driver.getWindowHandles());
        System.out.println(browserTabs.get(1));

        for(String tab : browserTabs) {
            System.out.println(tab);
            Thread.sleep(2000);
            driver.switchTo().window(tab);
        }
        driver.switchTo().window(browserTabs.get(0));
        Assert.assertEquals(4, browserTabs.size(), "Wrong number of browser tabs");
    }


    @AfterMethod
    private void tearDown() {
        driver.quit();
    }

}
