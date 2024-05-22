package section08;

import org.config.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.pages.ContactFormPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class L012_JavaScriptExecutorTest extends BaseTest {

    ContactFormPage contactFormPage;
    WebElement submitBtn;
    WebElement resetBtn;
    JavascriptExecutor js;

    @BeforeMethod
    private void beforeMethod() {
        setUpWithChrome();
        contactFormPage = new ContactFormPage(driver);
        driver.get(contactFormPage.baseUrl);
    }

    @Test
    void testBrowserTabPage() throws InterruptedException {
       submitBtn = driver.findElement(contactFormPage.submitButton);
       resetBtn = driver.findElement(contactFormPage.resetButton);
       js = (JavascriptExecutor) driver;
       contactFormPage.enterFirstName("kafhjgs");
       contactFormPage.enterLastName("kafhjgs");
       contactFormPage.enterEmail("kafhjgs@gmail.com");
       contactFormPage.enterMessage("kafhjgs");
       //js.executeScript("arguments[0].scrollIntoView(true);", submitBtn);
       clickTwoElementsUsingJavascript(driver, resetBtn, submitBtn);
       Thread.sleep(2000);
    }


    @AfterMethod
    private void tearDown() {
        driver.quit();
    }


}
