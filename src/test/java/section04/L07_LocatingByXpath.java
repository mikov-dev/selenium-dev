package section04;

import org.config.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class L07_LocatingByXpath extends BaseTest {

    By buttonOne = By.xpath("//button[@id='btn_one']");

    @BeforeMethod
    private void beforeMethod() {
        setUp();
        driver.get("https://www.automationtesting.co.uk/buttons.html");
    }

    @Test(description = "click the button")
    void clickTheFirstButton() throws InterruptedException {
        driver.findElement(buttonOne).click();
        var text = driver.switchTo().alert().getText();
        Thread.sleep(2000);
        assert text.equals("You clicked the first button!");
    }

    @AfterMethod
    private void tearDown() {
        driver.quit();
    }
}
