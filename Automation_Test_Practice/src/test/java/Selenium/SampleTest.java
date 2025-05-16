package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class SampleTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        Thread.sleep(5000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
// Scroll to the bottom of the page
        js.executeScript("window.scrollTo(0, document.body.scrollHeight/4)");
       WebElement Hower = driver.findElement(By.xpath("//button[text()='Point Me']"));
        Actions a=new Actions(driver);
        a.clickAndHold(Hower).build().perform();
        WebElement DoubleClick = driver.findElement(By.xpath("//button[text()='Copy Text']"));
        Actions d =new Actions(driver);
        d.doubleClick(DoubleClick).build().perform();
        Thread.sleep(3000);
        driver.quit();

    }
}
