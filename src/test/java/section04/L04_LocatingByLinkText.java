package section04;

import org.config.BaseTest;
import org.pages.MainPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class L04_LocatingByLinkText extends BaseTest {

    MainPage mainPage;
    @BeforeMethod
    private void beforeMethod() {
        setUp();
        driver.get("https://www.automationtesting.co.uk");
        mainPage = new MainPage(driver);
    }

    @Test(description = "click the button")
    void verifyTheActionsLinkTest() throws InterruptedException {
        driver.findElement(mainPage.actions).click();
        assert driver.getCurrentUrl().equals("https://www.automationtesting.co.uk/actions.html");
        Thread.sleep(3000);
    }

    @AfterMethod
    private void tearDown() {
        driver.quit();
    }
}
