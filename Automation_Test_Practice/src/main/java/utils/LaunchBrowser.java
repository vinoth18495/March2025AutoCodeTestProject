package utils;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class LaunchBrowser {

    public WebDriver driver;

    public WebDriver launchUrl() throws IOException {

        if(driver == null) {
//            File file = new File("src/main/resources/configuration/FrameworkConfiguration.properties");
//            FileInputStream fis = new FileInputStream(file);
//            Properties prop = new Properties();
//            prop.load(fis);

            switch (ReadPropertyValue.getPropertyValue("browser").toLowerCase()) {
                case "edge" -> driver = new EdgeDriver();
                case "chrome" -> driver = new ChromeDriver();
                case "safari" -> driver = new SafariDriver();
                default -> throw new InvalidArgumentException("Enter the valid browser name");
            }


            driver.get(ReadPropertyValue.getPropertyValue("login"));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
            driver.manage().window().maximize();

        }
        return driver;
    }
}
