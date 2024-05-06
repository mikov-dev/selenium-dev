package pagetests;

import org.config.BaseTest;
import org.openqa.selenium.WebElement;
import org.pages.ContactFormPage;
import org.testng.Assert;
import org.testng.annotations.*;

public class ContactFormTest extends BaseTest {

    ContactFormPage contactForm;

    @BeforeTest
    private void beforeTest() {
        setUp();
        contactForm = new ContactFormPage(driver);
        driver.get(contactForm.baseUrl);
    }

    @Test(description = "submit data")
    void fillInTheContactFormTestAndSubmit() throws InterruptedException {
        contactForm.enterFirstName("Petar");
        contactForm.enterLastName("Mikov");
        contactForm.enterEmail("pmikov@yahoo.com");
        contactForm.enterMessage("Hello Dudes!");
        contactForm.clickSubmitButton();
        Thread.sleep(2000);
        WebElement thankYouMessage = driver.findElement(contactForm.thankYouMessage);
        String message = thankYouMessage.getText();
        Assert.assertEquals(message, "Thank you for your mail!", "Messages do not match!");
    }

    @Test(description = "reset data")
    void fillInTheContactFormTestAndReset() throws InterruptedException {
        contactForm.enterFirstName("Petar");
        contactForm.enterLastName("Mikov");
        contactForm.enterEmail("pmikov@yahoo.com");
        contactForm.enterMessage("Hello Dudes!");
        contactForm.clickResetButton();
        Thread.sleep(2000);
        Assert.assertEquals(driver.findElement(contactForm.firstNameField).getAttribute("placeholder"), "First Name");
    }

    @AfterTest
    private void tearDown() {
        driver.quit();
    }

}
