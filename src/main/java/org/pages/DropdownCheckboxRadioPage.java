package org.pages;

import org.config.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropdownCheckboxRadioPage extends BasePage {

    // Constructor
    public DropdownCheckboxRadioPage(WebDriver driver) {
        this.driver = driver;
        baseUrl = "https://www.automationtesting.co.uk/dropdown.html";
    }

    // Page elements defined using By
    public By radioButtonOne = By.id("demo-priority-low");
    public By radioButtonTwo = By.id("demo-priority-normal");
    public By radioButtonThree = By.id("demo-priority-high");
    public By redCheckBox = By.id("cb_red");
    public By greenCheckBox = By.id("cb_green");
    public By blueCheckBox = By.id("cb_blue");

    // Methods to interact with page elements
    public void selectOptionFromDropdown(String option) {
    }
}
