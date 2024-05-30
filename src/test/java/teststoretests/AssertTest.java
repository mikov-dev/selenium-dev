package teststoretests;

import org.config.BaseTest;
import org.pages.webstore.TestStoreMainPage;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.utils.Listener;

import java.util.List;
@Listeners(Listener.class)
public class AssertTest extends BaseTest {

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
        Assert.fail();
        driver.findElement(mainPage.emailLoginField).sendKeys("pmikov@yahoo.com");
        Thread.sleep(3000);
    }

    @Test
    public void enterPassword() throws InterruptedException {
        driver.findElement(mainPage.passwordLoginField).sendKeys("Fury@2025");
        Thread.sleep(3000);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
