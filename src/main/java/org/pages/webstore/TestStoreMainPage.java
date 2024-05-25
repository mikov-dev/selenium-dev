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
    public By headerSignInLink = By.cssSelector("a span.hidden-sm-down");

    public By clothesMainLink = By.id("category-3");
    public By firstProduct = By.cssSelector("a img[alt='Hummingbird printed t-shirt']");
    public By firstProductHeadline = By.cssSelector("h1.h1");
    public By cartProductsCount = By.cssSelector(".cart-products-count");
    public By addToCartButton = By.cssSelector("button.add-to-cart");
    public By continueShoppingButton = By.cssSelector(".cart-content-btn .btn-secondary");


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

    public void signIn(String email, String password) {
        clickSignInLink();
        enterEmail(email);
        enterPassword(password);
        submitForm();
    }

}
