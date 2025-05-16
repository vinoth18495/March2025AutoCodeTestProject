package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class Wait_Concept {

    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();
        driver.get("https://learnmoreplayground.blogspot.com/p/explicit-wait.html");
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        driver.findElement(By.xpath("(//div[@id='container']//button)[3]")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));
        //fluent wait concept
        wait.pollingEvery(Duration.ofSeconds(5));
        wait.ignoring(NoSuchElementException.class);
        WebElement value = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("change_text")));
        boolean displayed = driver.findElement(By.xpath("//h3[text()='Hello, Learn More Aspirants']")).isDisplayed();
        System.out.println(driver.findElement(By.xpath("//h3[text()='Hello, Learn More Aspirants']")).getText());
driver.quit();
    }
}
