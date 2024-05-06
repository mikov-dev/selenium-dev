package org.pages;

import org.config.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BrowserTabsPage extends BasePage {

    // Constructor
    public BrowserTabsPage(WebDriver driver) {
        this.driver = driver;
        baseUrl = "https://www.automationtesting.co.uk/browserTabs.html";
    }

    // Page elements defined using By
    public By newTabButton = By.cssSelector("input[value='Open Tab']");

    public void clickNewTabButton() {
        driver.findElement(newTabButton).click();
    }
}
