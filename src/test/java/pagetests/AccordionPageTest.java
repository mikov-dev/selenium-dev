package pagetests;

import org.config.BaseTest;
import org.openqa.selenium.WebElement;
import org.pages.AccordionPage;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AccordionPageTest extends BaseTest {

    AccordionPage accordionPage;

    @BeforeClass
    private void BeforeClass() {
        setUpChoosingDriverFromProperties();
        accordionPage = new AccordionPage(driver);
        driver.get(accordionPage.baseUrl);
    }

    @Test(description = "Verify that the platform portability accordion element is functional.")
    void verifyThePlatformPortabilityFunctionality() throws InterruptedException {
        scrollIntoView(driver, accordionPage.platformPortability);
        accordionPage.clickPlatformPortability();
        WebElement platformPortabilityText = driver.findElement(accordionPage.platformPortabilityText);
        Thread.sleep(1000);
        verify.elementIsDisplayed(platformPortabilityText);
        verify.elementContainsText(platformPortabilityText, "Testing is a repetitive process.");
    }

    @Test(description = "Verify that the language support accordion element is functional.")
    void verifyTheLanguageSupportFunctionality() throws InterruptedException {
        scrollIntoView(driver, accordionPage.languageSupport);
        accordionPage.clickLanguageSupport();
        WebElement languageSupportText = driver.findElement(accordionPage.languageSupportText);
        Thread.sleep(1000);
        Assert.assertTrue(languageSupportText.isDisplayed());
        Assert.assertTrue(languageSupportText.getText().contains("Software is written in a number of languages."));
    }

    @Test(description = "Verify that the selenium grid accordion element is functional.")
    void verifyTheSeleniumGridFunctionality() throws InterruptedException {
        scrollIntoView(driver, accordionPage.seleniumGrid);
        accordionPage.clickSeleniumGrid();
        WebElement seleniumGridText = driver.findElement(accordionPage.seleniumGridText);
        Thread.sleep(1000);
        Assert.assertTrue(seleniumGridText.isDisplayed());
        Assert.assertTrue(seleniumGridText.getText().contains("The remote control server of Selenium"));
    }

    @AfterClass
    private void AfterClass() {
        driver.quit();
    }
}
