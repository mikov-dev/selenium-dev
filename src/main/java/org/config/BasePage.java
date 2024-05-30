package org.config;

import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;


public class BasePage {

    Properties prop;
    FileInputStream fis;
    public WebDriver driver;
    public String baseUrl;

    public String mainWindow;
    public Set<String> handles;
    public Iterator<String> iterate;

    public Properties readPropertiesFile(String fileName) {
        try {
            fis = new FileInputStream(fileName);
            prop = new Properties();
            prop.load(fis);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return prop;
    }
}
