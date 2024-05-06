package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

public class SafariDemo {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new SafariDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com/");
        Thread.sleep(5000);
        driver.quit();
    }
}
