package org.config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;

@Getter
@Setter
public class BaseTest {

    public WebDriver driver;
    Actions actions;
    JavascriptExecutor js;
    WebElement element;

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/webdrivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void scrollIntoView(WebDriver driver, By by) {
        js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(by));
    }

    public void dragAndDrop(WebDriver driver, By from, By to) {
        actions = new Actions(driver);
        actions.dragAndDrop(driver.findElement(from), driver.findElement(to)).build().perform();
    }

    public void clickAndHold(WebDriver driver, By by) {
        actions = new Actions(driver);
        actions.clickAndHold(driver.findElement(by)).build().perform();
    }

    public void pressAndHoldShift(WebDriver driver, By by) {
        actions = new Actions(driver);
        actions.keyDown(driver.findElement(by), Keys.SHIFT).build().perform();
    }

    public void holdShiftAndClick(WebDriver driver, By by) {
        actions = new Actions(driver);
        actions.keyDown(Keys.SHIFT).click(driver.findElement(by)).keyUp(Keys.SHIFT).build().perform();
    }

    public void releaseClick(WebDriver driver, By by) {
        actions = new Actions(driver);
        actions.release(driver.findElement(by)).build().perform();
    }

    public void doubleClick(WebDriver driver, By by) {
        actions = new Actions(driver);
        actions.doubleClick(driver.findElement(by)).build().perform();
    }

    public void switchToTab(int tabNumber) {
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabNumber));
    }

    public void closeCurrentTab() {
        driver.close();
    }

    public void hoverElement(WebDriver driver, By by) {
        actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).build().perform();
    }

    public void clickButton(By by) {
        driver.findElement(by).click();
    }

    public void moveToAndClick(By button) {
        actions = new Actions(driver);
        actions.moveToElement(driver.findElement(button)).click().perform();
    }

    public void clickUsingJavaScript(By button) {
        js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", driver.findElement(button));
    }

    public void enableElement(By button) {
        element = driver.findElement(button);
        js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].removeAttribute('disabled')", element);
    }
}
