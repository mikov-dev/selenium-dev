package org.pages;

import org.config.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsPage extends BasePage {

    // Constructor
    public WaitsPage(WebDriver driver) {
        this.driver = driver;
        baseUrl = "https://www.automationtesting.co.uk/loader.html";
    }

    // Page elements defined using By
    public By loaderButton = By.id("loaderBtn");
    public By hiddenText = By.id("p_wording");

    // Methods to interact with page elements
    public WebElement waitForElement(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

}
