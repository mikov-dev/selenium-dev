package org.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class ScreenshotHelper {

    public static void takeScreenShot(WebDriver driver) throws IOException {
        File screenFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destinationFile = new File("src/main/resources/screenshots/" + timeStampName() + ".png");
        FileUtils.copyFile(screenFile, destinationFile);
    }

    public static String timeStampName() {
        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
    }
}
