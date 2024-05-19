package org.pages;

import org.config.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HiddenElementsPage extends BasePage {

    // Constructor
    public HiddenElementsPage(WebDriver driver) {
        this.driver = driver;
        baseUrl = "https://www.automationtesting.co.uk/hiddenElements.html";
    }

    // Page elements defined using By
    public By hiddenElement = By.cssSelector("#main [class] p:nth-child(3)");
    public By toggleHiddenTextButton = By.cssSelector(".row button");
    public By hiddenText = By.id("myDIV");


    // Methods to interact with page elements


}
