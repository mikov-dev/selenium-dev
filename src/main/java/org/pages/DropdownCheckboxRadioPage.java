package org.pages;

import org.config.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownCheckboxRadioPage extends BasePage {

    Select cars;

    // Constructor
    public DropdownCheckboxRadioPage(WebDriver driver) {
        this.driver = driver;
        baseUrl = "https://www.automationtesting.co.uk/dropdown.html";
    }

    // Page elements defined using By

    public By radioButtonOne = By.id("demo-priority-low");
    public By radioButtonOneClick = By.cssSelector("[for='demo-priority-low']");
    public By radioButtonTwo = By.id("demo-priority-normal");
    public By radioButtonTwoClick = By.cssSelector("[for='demo-priority-normal']");
    public By radioButtonThree = By.id("demo-priority-high");
    public By radioButtonThreeClick = By.cssSelector("[for='demo-priority-high']");

    public By redCheckBox = By.id("cb_red");
    public By redCheckBoxInput = By.cssSelector("[for='cb_red']");
    public By greenCheckBox = By.id("cb_green");
    public By greenCheckBoxInput = By.cssSelector("[for='cb_green']");
    public By blueCheckBox = By.id("cb_blue");
    public By blueCheckBoxInput = By.cssSelector("[for='cb_blue']");

    public By homeLink = By.linkText("Home");
    public By animalsLink = By.linkText("Animals");
    public By sportsLink = By.linkText("Sports");

    public By mouseLink = By.linkText("Mouse");
    public By catLink = By.linkText("Cat");
    public By fishLink = By.linkText("Fish");
    public By dogLink = By.linkText("Dog");
    public By dogLinkGermanShepard = By.linkText("German Shepard");
    public By dogLinkGermanLabrador = By.linkText("Labrador");
    public By dogLinkNorwegianRidgeBack = By.linkText("Norwegian Ridgeback");

    public By footballLink = By.linkText("Football");
    public By tennisLink = By.linkText("Tennis");
    public By rugbyLink = By.linkText("Rugby");

    public By carsSelection = By.id("cars");

    // Methods to interact with page elements
    public void selectOptionByOrderFromCarsDropdown(int option) {
        cars = new Select(driver.findElement(carsSelection));
        cars.selectByIndex(option);
    }

    public void selectOptionByTextFromCarsDropdown(String option) {
        cars = new Select(driver.findElement(carsSelection));
        cars.selectByVisibleText(option);
    }

    public void selectOptionByValueFromCarsDropdown(String option) {
        cars = new Select(driver.findElement(carsSelection));
        cars.selectByValue(option);
    }


    public void clickRadioButton(By by) {
        driver.findElement(by).click();
    }

}
