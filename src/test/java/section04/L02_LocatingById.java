package section04;

import org.config.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class L02_LocatingById extends BaseTest {

    @BeforeMethod
    private void beforeMethod() {
        setUp();
        driver.get("https://www.automationtesting.co.uk/buttons.html");
    }

    @Test(description = "click the button")
    void clickButtonOneTest() throws InterruptedException {
        driver.findElement(By.id("btn_one")).click();
        var text = driver.switchTo().alert().getText();
        Thread.sleep(5000);
        assert text.equals("You clicked the first button!");
    }

    @AfterMethod
    private void tearDown() {
        driver.quit();
    }
}
