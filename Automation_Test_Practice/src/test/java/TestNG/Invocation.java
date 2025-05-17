package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Invocation {

    @Test(invocationCount = 2)
 public void sample() {

     WebDriver driver = new ChromeDriver();
 }
}
