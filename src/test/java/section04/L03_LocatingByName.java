package section04;

import org.config.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class L03_LocatingByName extends BaseTest {

    @BeforeMethod
    private void beforeMethod() {
        setUp();
        driver.get("https://www.automationtesting.co.uk/contactForm.html");
    }

    @Test(description = "click the button")
    void fillInTheNameInputField() throws InterruptedException {
        driver.findElement(By.name("first_name")).sendKeys("abc");
        Thread.sleep(5000);
    }

    @AfterMethod
    private void tearDown() {
        driver.quit();
    }

}
