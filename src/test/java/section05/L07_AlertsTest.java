package section05;

import org.config.BaseTest;
import org.openqa.selenium.Alert;
import org.pages.AlertsAndPopUpsPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class L07_AlertsTest extends BaseTest {

    AlertsAndPopUpsPage alertsAndPopUpsPage;
    Alert alert;

    @BeforeMethod
    private void beforeMethod() {
        setUpWithChrome();
        alertsAndPopUpsPage = new AlertsAndPopUpsPage(driver);
        driver.get(alertsAndPopUpsPage.baseUrl);
    }

    @Test(description = "click box verification")
    void triggerAlertTest() throws InterruptedException {
        alertsAndPopUpsPage.clickTriggerAlertButton();
        Assert.assertEquals(driver.switchTo().alert().getText(), "You have triggered the alert!");
        Thread.sleep(2000);
        alertsAndPopUpsPage.acceptAlert();
    }


    @AfterMethod
    private void tearDown() {
        driver.quit();
    }

}
