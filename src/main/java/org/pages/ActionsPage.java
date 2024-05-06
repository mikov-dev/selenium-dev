package org.pages;

import org.config.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActionsPage extends BasePage {

    // Constructor
    public ActionsPage(WebDriver driver) {
        this.driver = driver;
        baseUrl = "https://www.automationtesting.co.uk/actions.html";
    }

    // Page elements defined using By
    public By firstDropBox = By.cssSelector("#main [class] [ondrop='drop\\(event\\)']:nth-child(2)");
    public By secondDropBox = By.cssSelector("#main [class] [ondrop='drop\\(event\\)']:nth-child(3)");
    public By clickAndHoldBox = By.id("click-box");
    public By doubleClickBox = By.cssSelector("[ondblclick]");
    public By shiftAndClickBox = By.cssSelector("[onmousedown] #doubleClickArea");

}
