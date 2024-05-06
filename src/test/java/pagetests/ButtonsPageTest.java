package pagetests;

import org.config.BaseTest;
import org.pages.BrowserTabsPage;
import org.pages.ButtonsPage;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ButtonsPageTest extends BaseTest {

    ButtonsPage buttonsPage;

    @BeforeTest
    private void beforeTest() {
        setUp();
        buttonsPage = new ButtonsPage(driver);
        driver.get(buttonsPage.baseUrl);
    }

    @Test(description = "Verify the functionality of the first button.")
    void verifyTheFirstButtonFunctionality() throws InterruptedException {
        clickButton(buttonsPage.buttonOne);
        Thread.sleep(1000);
        var text = driver.switchTo().alert().getText();
        assert text.equals("You clicked the first button!");
    }

    @Test(description = "Verify the functionality of the second button.")
    void verifyTheSecondButtonFunctionality() throws InterruptedException {
        moveToAndClick(buttonsPage.buttonTwo);
        Thread.sleep(1000);
        var text = driver.switchTo().alert().getText();
        assert text.equals("You clicked the second button!");
    }

    @Test(description = "Verify the functionality of the third button.")
    void verifyTheThirdButtonFunctionality() throws InterruptedException {
        clickUsingJavaScript(buttonsPage.buttonThree);
        Thread.sleep(1000);
        var text = driver.switchTo().alert().getText();
        assert text.equals("You clicked the third button!");
    }

    @Test(description = "Verify the functionality of the fourth button.")
    void verifyTheFourthButtonFunctionality() throws InterruptedException {
        enableElement(buttonsPage.buttonFour);
        clickButton(buttonsPage.buttonFour);
        Thread.sleep(1000);
        var text = driver.switchTo().alert().getText();
        assert text.equals("You clicked the fourth button!");
    }


    @AfterTest
    private void tearDown() {
        driver.quit();
    }
}
