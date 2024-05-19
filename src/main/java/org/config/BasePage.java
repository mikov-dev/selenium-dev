package org.config;

import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

public class BasePage {
    public WebDriver driver;
    public String baseUrl;

    public String mainWindow;
    public Set<String> handles;
    public Iterator<String> iterate;
}
