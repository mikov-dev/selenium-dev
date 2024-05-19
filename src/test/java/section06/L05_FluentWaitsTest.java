package section06;

import org.config.BaseTest;
import org.pages.WaitsTwoPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.internal.collections.Pair;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class L05_FluentWaitsTest extends BaseTest {

    public <T> List<T> fromArrayToList(T[] a) {
        return Arrays.stream(a).collect(Collectors.toList());
    }

    Pair<String, Integer> toPairs;

    WaitsTwoPage waitsTwoPage;

    @BeforeMethod
    private void beforeMethod() {
        setUpWithChrome();
        waitsTwoPage = new WaitsTwoPage(driver);
        driver.get(waitsTwoPage.baseUrl);
    }

    @Test
    void testFluentWaitWithVoidMethodWithoutParams() {
        waitsTwoPage.fluentlyWaitForAnElement(driver, waitsTwoPage.appearingParagraph);
        Assert.assertTrue(driver.findElement(waitsTwoPage.appearingParagraph).isDisplayed());
        Assert.assertTrue(driver.findElement(waitsTwoPage.appearingParagraph).getText().contains("This is a new paragraph that appears after 8 seconds."));
    }

    @Test
    void testFluentWaitWithCreatingAWaitObjectWithParams() {
        var paragraph = waitsTwoPage.fluentlyWait(driver, 10, 500, waitsTwoPage.appearingParagraph);
        Assert.assertTrue(paragraph.isDisplayed());
        Assert.assertTrue(paragraph.getText().contains("This is a new paragraph that appears after 8 seconds."));
    }

    @AfterMethod
    private void tearDown() {
        driver.quit();
    }

}
