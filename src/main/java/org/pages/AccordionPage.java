package org.pages;

import org.config.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccordionPage extends BasePage {

    // Constructor
    public AccordionPage(WebDriver driver) {
        this.driver = driver;
        baseUrl = "https://www.automationtesting.co.uk/accordion.html";
    }

    // Page elements defined using By
    public By platformPortability = By.cssSelector(".accordion > div:nth-of-type(1)");
    public By platformPortabilityText = By.cssSelector(".accordion .accordion-content:nth-of-type(2)");
    public By languageSupport = By.cssSelector(".accordion .accordion-header:nth-of-type(3)");
    public By languageSupportText = By.cssSelector(".accordion .accordion-content:nth-of-type(4)");
    public By seleniumGrid = By.cssSelector(".accordion .accordion-header:nth-of-type(5)");
    public By seleniumGridText = By.cssSelector(".accordion .accordion-content:nth-of-type(6)");

    // Methods to interact with page elements

    public void clickPlatformPortability() {
        driver.findElement(platformPortability).click();
    }

    public void clickLanguageSupport() {
        driver.findElement(languageSupport).click();
    }

    public void clickSeleniumGrid() {
        driver.findElement(seleniumGrid).click();
    }

}
