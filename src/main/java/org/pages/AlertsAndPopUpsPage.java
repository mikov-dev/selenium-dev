package org.pages;

import org.config.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsAndPopUpsPage extends BasePage {

    // Constructor
    public AlertsAndPopUpsPage(WebDriver driver) {
        this.driver = driver;
        baseUrl = "https://www.automationtesting.co.uk/popups.html";
    }

    // Page elements defined using By
    public By triggerPopupButton = By.cssSelector("button[onclick='popup()']");
    public By triggerAlertButton = By.cssSelector("button[onclick='alertTrigger()']");

    // Methods to interact with page elements
    public void clickTriggerAlertButton() {
        driver.findElement(triggerAlertButton).click();
    }
    public void clickTriggerPopupButton() {
        driver.findElement(triggerPopupButton).click();
    }
    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }

}
