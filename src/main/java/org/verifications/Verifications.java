package org.verifications;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.logging.Logger;

public class Verifications {

    Logger logger = Logger.getLogger("Verifications");

    public void verifyTextContains(WebElement element, String text) {
        try {
            Assert.assertTrue(element.getText().contains(text));
        } catch (AssertionError e) {
            logger.warning(e.getMessage());
            throw new AssertionError(e);
        }
    }

    public void verifyTextDoesNotContain(WebElement element, String text) {
        try {
            Assert.assertFalse(element.getText().contains(text));
        } catch (AssertionError e) {
            logger.warning(e.getMessage());
            throw new AssertionError(e);
        }
    }

    public void verifyTextEquals(WebElement element, String text) {
        try {
            Assert.assertEquals(element.getText(), text);
        } catch (AssertionError e) {
            logger.warning(e.getMessage());
            throw new AssertionError(e);
        }
    }

    public void verifyAlertTextEquals(Alert alert, String text) {
        try {
            Assert.assertEquals(alert.getText(), text);
        } catch (AssertionError e) {
            logger.warning(e.getMessage());
            throw new AssertionError(e);
        }
    }
}
