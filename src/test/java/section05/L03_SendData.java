package section05;

import org.config.BaseTest;
import org.pages.ContactFormPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class L03_SendData extends BaseTest {

    ContactFormPage contactForm;

    @BeforeMethod
    private void beforeMethod() {
        setUp();
        contactForm = new ContactFormPage(driver);
        driver.get(contactForm.baseUrl);
    }

    @Test(description = "fill in data")
    void clickButtonThreeTest() throws InterruptedException {
       contactForm.enterFirstName("John");
       contactForm.enterLastName("Smith");
       contactForm.enterEmail("john.smith@test.com");
       contactForm.enterMessage("This is a test");
       Thread.sleep(2000);
    }

    @AfterMethod
    private void tearDown() {
        driver.quit();
    }
}
