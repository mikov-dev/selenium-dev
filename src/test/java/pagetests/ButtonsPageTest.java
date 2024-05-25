package pagetests;

import org.config.BaseTest;
import org.pages.ButtonsPage;
import org.testng.annotations.*;

import java.util.List;

public class ButtonsPageTest extends BaseTest {

    ButtonsPage buttonsPage;

    @BeforeMethod
    private void BeforeClass() {
        setUpWithChromeOptions(List.of("--start-maximized"));
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
        var text = driver.switchTo().alert();
        verifyAlertTextEquals(text, "You clicked the second button!");
        //assert text.equals("You clicked the second button!");
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


    @AfterMethod
    private void tearDown() {
        driver.quit();
    }
}
