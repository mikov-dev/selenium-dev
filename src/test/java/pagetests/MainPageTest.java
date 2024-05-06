package pagetests;

import org.config.BaseTest;
import org.pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MainPageTest extends BaseTest {

    MainPage mainPage;

    @BeforeTest
    private void beforeTest() {
        setUp();
        mainPage = new MainPage(driver);
        driver.get(mainPage.baseUrl);
        mainPage.acceptCookies();
    }

    @Test(description = "Verify that the accordion link navigates to accordion page.")
    void verifyTheAccordionLinkFunctionality() throws InterruptedException {
        mainPage.clickAccordion();
        Thread.sleep(2000);
        Assert.assertTrue(driver.getCurrentUrl().contains("accordion"));
    }

    @Test(description = "Verify that the accordion link navigates to actions page")
    void verifyTheActionsLinkFunctionality() throws InterruptedException {
        mainPage.clickActions();
        Thread.sleep(2000);
        Assert.assertTrue(driver.getCurrentUrl().contains("actions"));
    }

    @Test(description = "Verify that the browser tabs link navigates to browser tabs page.")
    void verifyTheBrowserTabsLinkFunctionality() throws InterruptedException {
        mainPage.clickBrowserTabs();
        Thread.sleep(2000);
        Assert.assertTrue(driver.getCurrentUrl().contains("browserTabs"));
    }

    @Test(description = "Verify that the buttons link navigates to buttons page.")
    void verifyTheButtonsLinkFunctionality() throws InterruptedException {
        mainPage.clickButtons();
        Thread.sleep(2000);
        Assert.assertTrue(driver.getCurrentUrl().contains("buttons"));
    }

    @Test(description = "Verify that the calculator link navigates to calculator page.")
    void verifyTheCalculatorLinkFunctionality() throws InterruptedException {
        mainPage.clickCalculatorJs();
        Thread.sleep(2000);
        Assert.assertTrue(driver.getCurrentUrl().contains("calculator"));
    }

    @Test(description = "Verify that the date picker link navigates to date picker page.")
    void verifyTheDatePickerLinkFunctionality() throws InterruptedException {
        mainPage.clickDatePicker();
        Thread.sleep(2000);
        Assert.assertTrue(driver.getCurrentUrl().contains("datepicker"));
    }

    @Test(description = "Verify that the contact us form link navigates to contact us form page.")
    void verifyTheContactUsFormLinkFunctionality() throws InterruptedException {
        mainPage.clickContactUsForm();
        Thread.sleep(2000);
        Assert.assertTrue(driver.getCurrentUrl().contains("contactForm"));
    }

    @Test(description = "Verify that the dropdown checkbox radio link navigates to dropdown checkbox radio page.")
    void verifyTheDropdownCheckboxRadioLinkFunctionality() throws InterruptedException {
        scrollIntoView(driver, mainPage.dropdownCheckboxRadio);
        mainPage.clickDropdownCheckboxRadio();
        Thread.sleep(2000);
        Assert.assertTrue(driver.getCurrentUrl().contains("dropdown"));
    }

    @Test(description = "Verify that the file upload link navigates to file upload page.")
    void verifyTheFileUploadLinkFunctionality() throws InterruptedException {
        scrollIntoView(driver, mainPage.fileUpload);
        mainPage.clickFileUpload();
        Thread.sleep(2000);
        Assert.assertTrue(driver.getCurrentUrl().contains("fileupload"));
    }

    @Test(description = "Verify that the hidden elements link navigates to hidden elements page.")
    void verifyTheHiddenElementsLinkFunctionality() throws InterruptedException {
        mainPage.clickHiddenElements();
        Thread.sleep(2000);
        Assert.assertTrue(driver.getCurrentUrl().contains("hiddenElements"));
    }

    @Test(description = "Verify that the iframes link navigates to iframes page.")
    void verifyTheIframesLinkFunctionality() throws InterruptedException {
        scrollIntoView(driver, mainPage.iframes);
        mainPage.clickIframes();
        Thread.sleep(2000);
        Assert.assertTrue(driver.getCurrentUrl().contains("iframes"));
    }

    @Test(description = "Verify that the loader link navigates to loader page.")
    void verifyTheLoaderLinkFunctionality() throws InterruptedException {
        scrollIntoView(driver, mainPage.loader);
        mainPage.clickLoader();
        Thread.sleep(2000);
        Assert.assertTrue(driver.getCurrentUrl().contains("loader"));
    }

    @Test(description = "Verify that the loader two link navigates to loader two page.")
    void verifyTheLoaderTwoLinkFunctionality() throws InterruptedException {
        scrollIntoView(driver, mainPage.loaderTwo);
        mainPage.clickLoaderTwo();
        Thread.sleep(2000);
        Assert.assertTrue(driver.getCurrentUrl().contains("loadertwo"));
    }

    @Test(description = "Verify that the login portal link navigates to login portal page.")
    void verifyTheLoginPortalLinkFunctionality() throws InterruptedException {
        scrollIntoView(driver, mainPage.loginPortalTest);
        mainPage.clickLoginPortalTest();
        Thread.sleep(2000);
        Assert.assertTrue(driver.getCurrentUrl().contains("loginPortal"));
    }

    @Test(description = "Verify that the mouse movement link navigates to mouse movement page.")
    void verifyTheMouseMovementLinkFunctionality() throws InterruptedException {
        scrollIntoView(driver, mainPage.mouseMovement);
        mainPage.clickMouseMovement();
        Thread.sleep(2000);
        Assert.assertTrue(driver.getCurrentUrl().contains("mouse"));
    }

    @Test(description = "Verify that the popups and alerts link navigates to popups and alerts page.")
    void verifyThePopupsAndAlertsLinkFunctionality() throws InterruptedException {
        scrollIntoView(driver, mainPage.popupsAndAlerts);
        mainPage.clickPopupsAndAlerts();
        Thread.sleep(2000);
        Assert.assertTrue(driver.getCurrentUrl().contains("popups"));
    }

    @Test(description = "Verify that the predictive search link navigates to predictive search page.")
    void verifyThePredictiveSearchLinkFunctionality() throws InterruptedException {
        scrollIntoView(driver, mainPage.predictiveSearch);
        mainPage.clickPredictiveSearch();
        Thread.sleep(2000);
        Assert.assertTrue(driver.getCurrentUrl().contains("predictive"));
    }

    @Test(description = "Verify that the tables link navigates to tables page.")
    void verifyTheTablesLinkFunctionality() throws InterruptedException {
        scrollIntoView(driver, mainPage.tables);
        mainPage.clickTables();
        Thread.sleep(2000);
        Assert.assertTrue(driver.getCurrentUrl().contains("tables"));
    }

    @Test(description = "Verify that the test store link navigates to the test store page.")
    void verifyTheTestStoreLinkFunctionality() throws InterruptedException {
        scrollIntoView(driver, mainPage.testStore);
        mainPage.clickTestStore();
        Thread.sleep(2000);
        Assert.assertTrue(driver.getCurrentUrl().contains("teststore"));
    }

    @Test(description = "Verify that the about me link navigates to about me page.")
    void verifyTheAboutMeLinkFunctionality() throws InterruptedException {
        scrollIntoView(driver, mainPage.aboutMe);
        mainPage.clickAboutMe();
        Thread.sleep(2000);
        Assert.assertTrue(driver.getCurrentUrl().contains("aboutMe"));
    }

    @AfterTest
    private void tearDown() {
        driver.quit();
    }
}
