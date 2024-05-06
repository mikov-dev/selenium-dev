package section05;

import org.config.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class L02_ClickingButtons extends BaseTest {

    By buttonThree = By.id("btn_three");

    @BeforeMethod
    private void beforeMethod() {
        setUp();
        driver.get("https://www.automationtesting.co.uk/buttons.html");
    }

    @Test(description = "click the button")
    void clickButtonThreeTest() throws InterruptedException {
        driver.findElement(buttonThree).click();
        var text = driver.switchTo().alert().getText();
        Thread.sleep(2000);
        assert text.equals("You clicked the third button!");
    }

    @AfterMethod
    private void tearDown() {
        driver.quit();
    }
}
