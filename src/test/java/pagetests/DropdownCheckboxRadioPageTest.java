package pagetests;

import org.config.BaseTest;
import org.pages.ButtonsPage;
import org.pages.DropdownCheckboxRadioPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class DropdownCheckboxRadioPageTest extends BaseTest {

    DropdownCheckboxRadioPage dropdownCheckboxRadioPage;

    @BeforeTest
    private void beforeTest() {
        setUp();
        dropdownCheckboxRadioPage = new DropdownCheckboxRadioPage(driver);
        driver.get(dropdownCheckboxRadioPage.baseUrl);
    }




    @AfterTest
    private void tearDown() {
        driver.quit();
    }
}
