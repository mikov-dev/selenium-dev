package teststoretests;

import org.config.BaseTest;
import org.pages.webstore.TestStoreMainPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class SignInWithDependencies extends BaseTest {

    TestStoreMainPage mainPage;
    @BeforeClass
    void setUp() {
        setUpWithChromeOptions(List.of("--start-maximized"));
        mainPage = new TestStoreMainPage(driver);
        driver.get(mainPage.baseUrl);
        driver.findElement(mainPage.signInLink).click();
    }

    @Test
    public void enterEmail() throws InterruptedException {
        driver.findElement(mainPage.emailLoginField).sendKeys("pmikov@yahoo.com");
        Thread.sleep(3000);
    }

    @Test
    public void enterPassword() throws InterruptedException {
        driver.findElement(mainPage.passwordLoginField).sendKeys("Fury@2025");
        Thread.sleep(3000);
    }

    @Test(dependsOnMethods = {"enterPassword"})
    public void clickLoginButton() throws InterruptedException {
        driver.findElement(mainPage.submitButton).click();
        Thread.sleep(3000);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
