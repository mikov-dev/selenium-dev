package section05;

import org.config.BaseTest;
import org.pages.DropdownCheckboxRadioPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class L06_DropdownMenu extends BaseTest {

    DropdownCheckboxRadioPage dropdownCheckboxRadioPage;

    @BeforeMethod
    private void beforeMethod() {
        setUp();
        dropdownCheckboxRadioPage = new DropdownCheckboxRadioPage(driver);
        driver.get(dropdownCheckboxRadioPage.baseUrl);
    }

    @Test(description = "drop down menu verification")
    void selectFromDropdownMenuTest() throws InterruptedException {
        dropdownCheckboxRadioPage.selectOptionFromCarsDropdown(1);
        Thread.sleep(2000);

    }



/*    @AfterMethod
    private void tearDown() {
        driver.quit();
    }*/
}
