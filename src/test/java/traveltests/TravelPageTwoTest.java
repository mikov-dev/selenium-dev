package traveltests;

import org.config.BaseTest;
import org.openqa.selenium.WebElement;
import org.pages.easyjet.TravelPage;
import org.testng.annotations.BeforeMethod;

import java.util.List;

public class TravelPageTwoTest extends BaseTest {

    TravelPage travelPageOne;

    @BeforeMethod
    private void beforeMethod() {
        setUpWithFirefox();
        travelPageOne = new TravelPage(driver);
        driver.get(travelPageOne.baseUrl);
        travelPageOne.acceptCookies();
    }

    List<WebElement> originsFrom;
    List<WebElement> originsTo;



}
