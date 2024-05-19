package org.pages.easyjet;

import org.config.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TravelPage extends BasePage {

    public TravelPage(WebDriver driver) {
        this.driver = driver;
        baseUrl = "https://www.easyjet.com/en/";
    }

    private By cookiesAcceptButton = By.id("ensCloseBanner");
    public By destinationFromInput = By.name("origin");

    public void acceptCookies() {
        driver.findElement(cookiesAcceptButton).click();
    }

    public void inputDestinationFrom(String destination) {
        driver.findElement(destinationFromInput).clear();
        driver.findElement(destinationFromInput).sendKeys(destination);
    }

}
