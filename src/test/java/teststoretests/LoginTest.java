package teststoretests;

import org.config.BaseTest;
import org.pages.webstore.TestStoreMainPage;
import org.testng.annotations.*;
import org.utils.ScreenshotHelper;

import java.util.*;

public class LoginTest extends BaseTest {

    TestStoreMainPage mainPage;

    @DataProvider
    public Object[][] loginDataProvider() {
        mainPage = new TestStoreMainPage(driver);
        String[][] data = new String[3][2];

        data[0][0] = mainPage.properties.getProperty("firstEmail");
        data[0][1] = mainPage.properties.getProperty("firstPassword");

        data[1][0] = mainPage.properties.getProperty("secondEmail");
        data[1][1] = mainPage.properties.getProperty("secondPassword");

        data[2][0] = mainPage.properties.getProperty("thirdEmail");
        data[2][1] = mainPage.properties.getProperty("thirdPassword");

        return data;
    }

    @BeforeMethod
    void beforeMethod() {
        setUpWithChromeOptions(List.of("--start-maximized"));
        mainPage = new TestStoreMainPage(driver);
        driver.get(mainPage.baseUrl);
    }

    @Test(dataProvider = "loginDataProvider")
    public void clickFirstProductInClothesUsingDataProvider(String email, String password) throws InterruptedException {
        mainPage.signIn(email, password);
        ScreenshotHelper.takeScreenShot(driver);
        Thread.sleep(2000);
        mainPage.signOut();
    }

    @Parameters({"email", "password"})
    @Test
    public void testLogin(String email, String password) throws InterruptedException {
        mainPage.clickSignInLink();
        mainPage.enterEmail(email);
        mainPage.enterPassword(password);
        mainPage.submitForm();
        verify.textContains(driver.findElement(mainPage.accountName), "Peter Mikov");
        deleteAllCookies();
        reloadPage();
        verify.textDoesNotContain(driver.findElement(mainPage.headerSignInLink), "Peter Mikov");
        Thread.sleep(2000);
    }

    @Parameters({"email", "password"})
    @Test
    public void clickFirstProductInClothes(String email, String password) throws InterruptedException {
        mainPage.signIn(email, password);
        driver.findElement(mainPage.clothesMainLink).click();
        Thread.sleep(2000);
        driver.findElement(mainPage.firstProduct).click();
        verify.textEquals(driver.findElement(mainPage.firstProductHeadline), "HUMMINGBIRD PRINTED T-SHIRT");
        deleteAllCookies();
        reloadPage();
        Thread.sleep(2000);
        verify.textEquals(driver.findElement(mainPage.firstProductHeadline), "HUMMINGBIRD PRINTED T-SHIRT");
    }

    @AfterMethod
    void afterMethod() {
        driver.quit();
    }

}
