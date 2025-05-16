package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandling {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
         // Scroll to the bottom of the page
        js.executeScript("window.scrollTo(0, document.body.scrollHeight/3)");

        //To New tab senarios
//        driver.findElement(By.xpath("//button[text()='New Tab']")).click();
//       Set<String> change = driver.getWindowHandles();
//        Iterator<String> value = change.iterator();
//        String ParentWindow = value.next();
//        String ChildWindow = value.next();
//        driver.switchTo().window(ChildWindow);
//        System.out.println(driver.getTitle());
//        driver.switchTo().window(ParentWindow);
//        System.out.println(driver.getTitle());
//        driver.quit();

        //pop windows
        driver.findElement(By.xpath("//button[text()='Popup Windows']")).click();
        Set<String> winhandle = driver.getWindowHandles();
        Iterator<String> EachWindow = winhandle.iterator();
        String parentwindow = EachWindow.next();
        String childwindow = EachWindow.next();
        String GrandChild = EachWindow.next();
        driver.switchTo().window(childwindow);
        driver.findElement(By.className("getStarted_Sjon")).click();
        driver.switchTo().window(GrandChild);
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
       driver.quit();


    }
}
