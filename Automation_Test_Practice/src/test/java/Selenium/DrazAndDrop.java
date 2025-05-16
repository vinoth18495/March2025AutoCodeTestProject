package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class DrazAndDrop {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement draw= driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(draw);
        WebElement Drazvalue = driver.findElement(By.id("draggable"));
        WebElement Dropvalue = driver.findElement(By.id("droppable"));
        Actions check=new Actions(driver);
        check.dragAndDrop(Drazvalue,Dropvalue).build().perform();
        driver.switchTo().defaultContent();


    }

}
