package pagetests;

import org.config.BaseTest;
import org.pages.ActionsPage;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActionsPageTest extends BaseTest {

    ActionsPage actionsPage;

    @BeforeTest
    private void beforeTest() {
        setUp();
        actionsPage = new ActionsPage(driver);
        driver.get(actionsPage.baseUrl);
    }

    @Test(description = "verify the drag and drop action")
    public void verifyDragAndDropTheTextTest() throws InterruptedException {
        var secondDropBox = driver.findElement(actionsPage.secondDropBox);
        var firstDropBox = driver.findElement(actionsPage.firstDropBox);
        dragAndDrop(driver, actionsPage.firstDropBox, actionsPage.secondDropBox);
        Thread.sleep(1000);
        Assert.assertTrue(secondDropBox.getText().contains("Drag me!"));
        Assert.assertTrue(firstDropBox.getText().isEmpty());
    }

    @Test(description = "verify the click and hold action")
    public void verifyClickAndHoldTest() throws InterruptedException {
        var clickAndHoldBox = driver.findElement(actionsPage.clickAndHoldBox);
        clickAndHold(driver, actionsPage.clickAndHoldBox);
        Thread.sleep(1000);
        Assert.assertTrue(clickAndHoldBox.getText().contains("Keep holding down!"));
    }

    @Test(description = "verify the double click action")
    public void verifyDoubleClickTest() throws InterruptedException {
        var doubleClickBox = driver.findElement(actionsPage.doubleClickBox);
        doubleClick(driver, actionsPage.doubleClickBox);
        Thread.sleep(1000);
        Assert.assertTrue(doubleClickBox.getText().contains("Well Done!"));
    }

    @Test(description = "verify the shift and click action")
    public void verifyShiftAndClickTest() throws InterruptedException {
        holdShiftAndClick(driver, actionsPage.shiftAndClickBox);
        Thread.sleep(1000);
        var text = driver.switchTo().alert().getText();
        Assert.assertEquals(text, "The SHIFT key was pressed!");
    }

    @AfterTest
    private void tearDown() {
        driver.quit();
    }

}
