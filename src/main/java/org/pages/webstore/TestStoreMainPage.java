package org.pages.webstore;

import org.config.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestStoreMainPage extends BasePage {


    // Constructor
    public TestStoreMainPage(WebDriver driver) {
        this.driver = driver;
        baseUrl = "https://teststore.automationtesting.co.uk/index.php";
    }

    // Page elements defined using By
    public By signInLink = By.cssSelector(".user-info span");
    public By emailLoginField = By.id("field-email");
    public By passwordLoginField = By.id("field-password");
    public By hidePasswordButton = By.cssSelector("[data-text-hide='Hide']");
    public By forgotPasswordLink = By.cssSelector(".forgot-password a");
    public By submitButton = By.id("submit-login");
    public By accountName = By.cssSelector(".account span");

    // Methods to interact with page elements

    public void clickSignInLink() {
        driver.findElement(signInLink).click();
    }

    public void enterEmail(String email) {
        driver.findElement(emailLoginField).clear();
        driver.findElement(emailLoginField).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordLoginField).clear();
        driver.findElement(passwordLoginField).sendKeys(password);
    }

    public void showPassword() {
        driver.findElement(hidePasswordButton).click();
    }

    public void clickForgotPasswordLink() {
        driver.findElement(forgotPasswordLink).click();
    }

    public void submitForm() {
        driver.findElement(submitButton).click();
    }

}
