package org.pages;

import org.config.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ButtonsPage extends BasePage {

    // Constructor
    public ButtonsPage(WebDriver driver) {
        this.driver = driver;
        baseUrl = "https://www.automationtesting.co.uk/buttons.html";
    }

    // Page elements defined using By
    public By buttonOne = By.xpath("//button[@id='btn_one']");
    public By buttonTwo = By.cssSelector("button#btn_two");
    public By buttonThree = By.id("btn_three");
    public By buttonFour = By.id("btn_four");

}
