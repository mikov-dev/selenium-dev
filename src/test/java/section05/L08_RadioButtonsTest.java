package section05;

import org.config.BaseTest;
import org.pages.DropdownCheckboxRadioPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class L08_RadioButtonsTest extends BaseTest {

    DropdownCheckboxRadioPage dropdownCheckboxRadioPage;

    @BeforeMethod
    private void beforeMethod() {
        setUpWithChrome();
        dropdownCheckboxRadioPage = new DropdownCheckboxRadioPage(driver);
        driver.get(dropdownCheckboxRadioPage.baseUrl);
    }

    @Test(description = "radio buttons verification")
    void selectFromDropdownMenuTest() throws InterruptedException {
        dropdownCheckboxRadioPage.clickRadioButton(dropdownCheckboxRadioPage.radioButtonOneClick);
        Assert.assertTrue(driver.findElement(dropdownCheckboxRadioPage.radioButtonOne).isSelected());
        Thread.sleep(2000);
        dropdownCheckboxRadioPage.clickRadioButton(dropdownCheckboxRadioPage.radioButtonTwoClick);
        Assert.assertTrue(driver.findElement(dropdownCheckboxRadioPage.radioButtonTwo).isSelected());
        Thread.sleep(2000);
        dropdownCheckboxRadioPage.clickRadioButton(dropdownCheckboxRadioPage.radioButtonThreeClick);
        Assert.assertTrue(driver.findElement(dropdownCheckboxRadioPage.radioButtonThree).isSelected());
        Thread.sleep(2000);
    }


    @AfterMethod
    private void tearDown() {
        driver.quit();
    }

}
