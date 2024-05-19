package section05;

import org.config.BaseTest;
import org.pages.ButtonsPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class L05_IsEnabledTest extends BaseTest {

    ButtonsPage buttonsPage;

    @BeforeMethod
    private void beforeMethod() {
        setUpWithChrome();
        buttonsPage = new ButtonsPage(driver);
        driver.get(buttonsPage.baseUrl);
    }

    @Test(description = "click box verification")
    void enableButtonTest() throws InterruptedException {
        enableElement(buttonsPage.buttonFour);
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(buttonsPage.buttonFour).isEnabled());
    }



    @AfterMethod
    private void tearDown() {
        driver.quit();
    }

}
