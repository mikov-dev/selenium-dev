package teststoretests;

import org.config.BaseTest;
import org.pages.webstore.TestStoreMainPage;
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
    public void testLogin() throws InterruptedException {
        mainPage.clickSignInLink();
        mainPage.enterEmail("pnmikov@gmail.com");
        mainPage.enterPassword("Fury@2024");
        mainPage.submitForm();
        verifyTextContains(driver.findElement(mainPage.accountName), "Peter Mikov");
        deleteAllCookies();
        reloadPage();
        verifyTextDoesNotContain(driver.findElement(mainPage.headerSignInLink), "Peter Mikov");
        Thread.sleep(3000);
    }

    @Test
    public void clickFirstProductInClothes() throws InterruptedException {
        mainPage.signIn("pnmikov@gmail.com", "Fury@2024");
        driver.findElement(mainPage.clothesMainLink).click();
        Thread.sleep(2000);
        driver.findElement(mainPage.firstProduct).click();
        verifyTextEquals(driver.findElement(mainPage.firstProductHeadline), "HUMMINGBIRD PRINTED T-SHIRT");
        deleteAllCookies();
        reloadPage();
        Thread.sleep(3000);
    }

    @AfterMethod
    void afterMethod() {
        driver.quit();
    }

}
