package org.pages;

import org.config.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactFormPage extends BasePage {

    // Constructor
    public ContactFormPage(WebDriver driver) {
        this.driver = driver;
        baseUrl = "https://www.automationtesting.co.uk/contactForm.html";
    }

    // Page elements defined using By
    public By firstNameField = By.name("first_name");
    public By lastNameField = By.name("last_name");
    public By emailField = By.name("email");
    public By messageField = By.name("message");
    public By submitButton = By.cssSelector("#form_buttons [type='submit']");
    public By resetButton = By.cssSelector("#form_buttons [type='reset']");
    public By thankYouMessage = By.tagName("h3");

    // Methods to interact with page elements

    public void enterFirstName(String firstName) {
        WebElement firstNameInput = driver.findElement(firstNameField);
        firstNameInput.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        WebElement lastNameInput = driver.findElement(lastNameField);
        lastNameInput.sendKeys(lastName);
    }

    public void enterEmail(String email) {
        WebElement emailInput = driver.findElement(emailField);
        emailInput.sendKeys(email);
    }

    public void enterMessage(String message) {
        WebElement messageInput = driver.findElement(messageField);
        messageInput.sendKeys(message);
    }

    public void clickSubmitButton() {
        WebElement submitBtn = driver.findElement(submitButton);
        submitBtn.click();
    }

    public void clickResetButton() {
        WebElement resetBtn = driver.findElement(resetButton);
        resetBtn.click();
    }
}
