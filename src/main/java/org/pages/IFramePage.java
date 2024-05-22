package org.pages;

import org.config.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IFramePage extends BasePage {

    // Constructor
    public IFramePage(WebDriver driver) {
        this.driver = driver;
        baseUrl = "https://www.automationtesting.co.uk/iframes.html";
    }

    // Page elements defined using By
    public By firstIframe = By.cssSelector("iframe[src='index.html']");
    public By secondIframe = By.cssSelector("iframe[src='https://www.youtube.com/embed/jNQXAC9IVRw']");
    public By iFrameBurgerMenu = By.cssSelector("a[href='#sidebar']");
    public By iFrameMenuHeading = By.cssSelector("#menu h2");
    public By youTubeButton = By.className("ytp-large-play-button");

    // Methods to interact with page elements

    public void clickBurgerMenu() {
        driver.findElement(iFrameBurgerMenu).click();
    }

    public void playVideo() {
        driver.findElement(youTubeButton).click();
    }


}
