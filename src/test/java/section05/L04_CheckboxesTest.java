package section05;

import org.config.BaseTest;
import org.pages.DropdownCheckboxRadioPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class L04_CheckboxesTest extends BaseTest {

    DropdownCheckboxRadioPage dropdownCheckboxRadioPage;

    @BeforeMethod
    private void beforeMethod() {
        setUpWithChrome();
        dropdownCheckboxRadioPage = new DropdownCheckboxRadioPage(driver);
        driver.get(dropdownCheckboxRadioPage.baseUrl);
    }

    @Test(description = "click box verification")
    void clickGreenCheckBoxTest() throws InterruptedException {
        clickToSelectElement(dropdownCheckboxRadioPage.greenCheckBoxInput);
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(dropdownCheckboxRadioPage.greenCheckBox).isSelected());
    }

    @AfterMethod
    private void tearDown() {
        driver.quit();
    }
}
