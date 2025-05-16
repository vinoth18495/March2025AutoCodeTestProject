package TestNG;

import org.apache.poi.ss.formula.atp.Switch;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExample {

    WebDriver driver;

    @Test
    @Parameters({"Name", "Browser"})
    public void printName(String name, String browser) {

        switch (browser) {

            case "Chrome":
                driver = new ChromeDriver();
                break;
            case "Edge":
                driver = new EdgeDriver();
                break;
            default:
                System.out.println("Browser is not defined");
                break;
        }
        System.out.println("The name is " + name);
        System.out.println("The browser name is " + browser);
    }


}
