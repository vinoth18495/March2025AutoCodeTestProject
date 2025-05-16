package utils;

import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class TextContext {

    public WebDriver driver;
    public PageObjectManager pageObjectManager;
    public LaunchBrowser browser;

    public TextContext() throws IOException {
        browser = new LaunchBrowser();
        pageObjectManager = new PageObjectManager(browser.launchUrl());
    }
}
