package teststoretests;

import org.config.BaseTest;
import org.pages.webstore.TestStoreMainPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class LoginTest extends BaseTest {

    TestStoreMainPage mainPage;

    @BeforeMethod
    void beforeMethod() {
        setUpWithChromeOptions(List.of("--start-maximized"));
        mainPage = new TestStoreMainPage(driver);
        driver.get(mainPage.baseUrl);
    }

    @Test
    public void testLogin() {
        mainPage.clickSignInLink();
        mainPage.enterEmail("pnmikov@gmail.com");
        mainPage.enterPassword("Fury@2024");
        mainPage.submitForm();
        Assert.assertTrue(driver.findElement(mainPage.accountName).getText().contains("Peter Mikov"));
    }

    @AfterMethod
    void afterMethod() {
        driver.quit();
    }

}
