package org.pages;

import org.config.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {

    // Constructor
    public MainPage(WebDriver driver) {
        this.driver = driver;
        baseUrl = "https://www.automationtesting.co.uk";
    }

    // Page elements defined using By
    public By accordion = By.linkText("ACCORDION");
    public By actions = By.linkText("ACTIONS");
    public By browserTabs = By.linkText("BROWSER TABS");
    public By buttons = By.linkText("BUTTONS");
    public By calculatorJs = By.linkText("CALCULATOR (JS)");
    public By contactUsForm = By.linkText("CONTACT US FORM TEST");
    public By datePicker = By.linkText("DATE PICKER");
    public By dropdownCheckboxRadio = By.linkText("DROPDOWN CHECKBOX RADIO");
    public By fileUpload = By.linkText("FILE UPLOAD");
    public By hiddenElements = By.linkText("HIDDEN ELEMENTS");
    public By iframes = By.linkText("IFRAMES");
    public By loader = By.linkText("LOADER");
    public By loaderTwo = By.linkText("LOADER TWO");
    public By loginPortalTest = By.linkText("LOGIN PORTAL TEST");
    public By mouseMovement = By.linkText("MOUSE MOVEMENT");
    public By popupsAndAlerts = By.linkText("POP UPS & ALERTS");
    public By predictiveSearch = By.linkText("PREDICTIVE SEARCH");
    public By tables = By.linkText("TABLES");
    public By testStore = By.linkText("TEST STORE");
    public By aboutMe = By.linkText("ABOUT ME");
    public By cookiesForm = By.cssSelector(".close-cookie-warning > span");

    // Methods to interact with page elements

    public void acceptCookies() {
        driver.findElement(cookiesForm).click();
    }

    public void clickAccordion() {
        driver.findElement(accordion).click();
    }

    public void clickActions() {
        driver.findElement(actions).click();
    }

    public void clickBrowserTabs() {
        driver.findElement(browserTabs).click();
    }

    public void clickButtons() {
        driver.findElement(buttons).click();
    }

    public void clickCalculatorJs() {
        driver.findElement(calculatorJs).click();
    }

    public void clickContactUsForm() {
        driver.findElement(contactUsForm).click();
    }

    public void clickDatePicker() {
        driver.findElement(datePicker).click();
    }

    public void clickDropdownCheckboxRadio() {
        driver.findElement(dropdownCheckboxRadio).click();
    }

    public void clickFileUpload() {
        driver.findElement(fileUpload).click();
    }

    public void clickHiddenElements() {
        driver.findElement(hiddenElements).click();
    }

    public void clickIframes() {
        driver.findElement(iframes).click();
    }

    public void clickLoader() {
        driver.findElement(loader).click();
    }

    public void clickLoaderTwo() {
        driver.findElement(loaderTwo).click();
    }

    public void clickLoginPortalTest() {
        driver.findElement(loginPortalTest).click();
    }

    public void clickMouseMovement() {
        driver.findElement(mouseMovement).click();
    }

    public void clickPopupsAndAlerts() {
        driver.findElement(popupsAndAlerts).click();
    }

    public void clickPredictiveSearch() {
        driver.findElement(predictiveSearch).click();
    }

    public void clickTables() {
        driver.findElement(tables).click();
    }

    public void clickTestStore() {
        driver.findElement(testStore).click();
    }

    public void clickAboutMe() {
        driver.findElement(aboutMe).click();
    }
}
