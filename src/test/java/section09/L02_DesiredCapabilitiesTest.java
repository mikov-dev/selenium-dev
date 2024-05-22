package section09;

import org.config.BaseTest;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.pages.SslExpiredPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class L02_DesiredCapabilitiesTest extends BaseTest {

    SslExpiredPage sslExpiredPage;

    @BeforeMethod
    public void beforeMethod() {
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        setUpWithChromeOptionsAndDesiredCapabilities(List.of("--start-maximized", "--incognito"), capabilities);
        sslExpiredPage = new SslExpiredPage(driver);
        driver.get(sslExpiredPage.baseUrl);
    }

    @Test(description = "visit page")
    void visitPageTest() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue(driver.findElement(sslExpiredPage.heading).isDisplayed(), "Heading is not displayed");
    }

    @AfterMethod
    private void tearDown() {
        driver.quit();
    }
}
