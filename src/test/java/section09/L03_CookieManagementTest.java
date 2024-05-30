package section09;

import org.config.BaseTest;
import org.pages.webstore.TestStoreMainPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utils.ScreenshotHelper;

import java.io.IOException;
import java.util.List;

public class L03_CookieManagementTest extends BaseTest {


    TestStoreMainPage mainPage;

    @BeforeMethod
    void beforeMethod() {
        setUpWithChromeOptions(List.of("--start-maximized"));
        mainPage = new TestStoreMainPage(driver);
        driver.get(mainPage.baseUrl);
    }

    @Test
    public void testLogin() throws IOException, InterruptedException {
        mainPage.clickSignInLink();
        mainPage.enterEmail("pnmikov@gmail.com");
        mainPage.enterPassword("Fury@2024");
        mainPage.submitForm();
        verify.textContains(driver.findElement(mainPage.accountName), "Peter Mikov");
        deleteAllCookies();
        reloadPage();
        verify.textDoesNotContain(driver.findElement(mainPage.headerSignInLink), "Peter Mikov");
        ScreenshotHelper.takeScreenShot(driver);
    }

    @AfterMethod
    void afterMethod() {
        driver.quit();
    }

}
