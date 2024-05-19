package traveltests;

import org.config.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pages.easyjet.TravelPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TravelPageOneTest extends BaseTest {

    TravelPage travelPageOne;

    @BeforeMethod
    private void beforeMethod() {
        setUpWithFirefox();
        travelPageOne = new TravelPage(driver);
        driver.get(travelPageOne.baseUrl);
        travelPageOne.acceptCookies();
    }

    List<WebElement> origins;

    @Test
    void travelPageOnePrintTest() {
        travelPageOne.inputDestinationFrom("london");
        origins = driver.findElements(By.cssSelector("#ui-id-1 li>a>span:nth-child(1)"));
        for (WebElement origin : origins) {
            System.out.println(origin.getText());
        }
        Assert.assertTrue(origins.get(3).getText().contains("Southend"));
    }

    @Test
    void travelPageOneSearchTest() {
        travelPageOne.inputDestinationFrom("london");
        origins = new WebDriverWait(driver, 20)
                .until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("#ui-id-1 li>a>span:nth-child(1)")));
        for (WebElement origin : origins) {
            if (origin.getText().contains("Southend")) {
                origin.click();
            }
        }
    }

    @AfterMethod
    private void afterMethod() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

}
