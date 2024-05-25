package pagetests;

import org.config.BaseTest;
import org.pages.DropdownCheckboxRadioPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class DropdownCheckboxRadioPageTest extends BaseTest {

    DropdownCheckboxRadioPage dropdownCheckboxRadioPage;

    @BeforeClass
    private void BeforeClass() {
        setUpWithChrome();
        dropdownCheckboxRadioPage = new DropdownCheckboxRadioPage(driver);
        driver.get(dropdownCheckboxRadioPage.baseUrl);
    }


    @AfterClass
    private void tearDown() {
        driver.quit();
    }
}
