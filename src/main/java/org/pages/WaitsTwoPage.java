package org.pages;

import org.config.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.function.Function;

public class WaitsTwoPage extends BasePage {

    // Constructor
    public WaitsTwoPage(WebDriver driver) {
        this.driver = driver;
        baseUrl = "https://www.automationtesting.co.uk/loadertwo.html";
    }

    // Page elements defined using By
    public By appearingParagraph = By.id("appears");

    // Methods to interact with page elements

    public WebElement fluentlyWait(WebDriver driver, int seconds, int millis, By by) {
        return new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(seconds))
                .pollingEvery(Duration.ofMillis(millis))
                .ignoring(NoSuchElementException.class)
                .until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public void fluentlyWaitForAnElement(WebDriver driver, By by) {
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NoSuchElementException.class);
        wait.until(driver1 -> driver1.findElement(by));
    }

}
