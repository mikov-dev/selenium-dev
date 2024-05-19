package section05;

import org.config.BaseTest;
import org.pages.DropdownCheckboxRadioPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class L06_DropdownMenuTest extends BaseTest {

    DropdownCheckboxRadioPage dropdownCheckboxRadioPage;

    @BeforeMethod
    private void beforeMethod() {
        setUpWithChrome();
        dropdownCheckboxRadioPage = new DropdownCheckboxRadioPage(driver);
        driver.get(dropdownCheckboxRadioPage.baseUrl);
    }

    @Test(description = "drop down menu verification")
    void selectFromDropdownMenuTest() throws InterruptedException {
        dropdownCheckboxRadioPage.selectOptionByOrderFromCarsDropdown(1);
        Thread.sleep(2000);
        dropdownCheckboxRadioPage.selectOptionByTextFromCarsDropdown("Honda");
        Thread.sleep(2000);
        dropdownCheckboxRadioPage.selectOptionByValueFromCarsDropdown("jeep");
        Thread.sleep(2000);
    }


    @AfterMethod
    private void tearDown() {
        driver.quit();
    }
}
