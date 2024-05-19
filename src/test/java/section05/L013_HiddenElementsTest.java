package section05;

import org.config.BaseTest;
import org.pages.HiddenElementsPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class L013_HiddenElementsTest extends BaseTest {

    HiddenElementsPage hiddenElementsPage;

    @BeforeMethod
    private void beforeMethod() {
        setUpWithChrome();
        hiddenElementsPage = new HiddenElementsPage(driver);
        driver.get(hiddenElementsPage.baseUrl);
    }

    @Test(description = "radio buttons verification")
    void selectFromDropdownMenuTest() throws InterruptedException {
        driver.findElement(hiddenElementsPage.hiddenElement).isDisplayed();
        Thread.sleep(2000);
    }

    @AfterMethod
    private void tearDown() {
        driver.quit();
    }


}
