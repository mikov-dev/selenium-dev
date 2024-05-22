package org.pages;

import org.config.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SslExpiredPage extends BasePage {

    // Constructor
    public SslExpiredPage(WebDriver driver) {
        this.driver = driver;
        baseUrl = "https://expired.badssl.com/";
    }

    // Page elements defined using By
    public By heading = By.tagName("h1");


}
