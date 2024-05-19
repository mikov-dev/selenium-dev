package section05;

import org.config.BaseTest;
import org.pages.AlertsAndPopUpsPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class L11_PopupsTest extends BaseTest {

    AlertsAndPopUpsPage alertsAndPopUpsPage;
    String mainWindow;
    Set<String> handles;
    Iterator<String> iterate;

    @BeforeMethod
    private void beforeMethod() {
        setUpWithChrome();
        alertsAndPopUpsPage = new AlertsAndPopUpsPage(driver);
        driver.get(alertsAndPopUpsPage.baseUrl);
    }

    @Test(description = "pop up handling verification")
    void handlePopUpTest() throws InterruptedException {
        alertsAndPopUpsPage.clickTriggerPopupButton();
        mainWindow = driver.getWindowHandle();
        handles = driver.getWindowHandles();
        iterate = handles.iterator();
        while (iterate.hasNext()) {
            String child = iterate.next();
            if (!mainWindow.equalsIgnoreCase(child)) {
                Thread.sleep(2000);
                driver.switchTo().window(child);
                driver.close();
            }
        }
        driver.switchTo().window(mainWindow);
        Thread.sleep(2000);
        alertsAndPopUpsPage.acceptAlert();
    }


    @AfterMethod
    private void tearDown() {
        driver.quit();
    }

}
