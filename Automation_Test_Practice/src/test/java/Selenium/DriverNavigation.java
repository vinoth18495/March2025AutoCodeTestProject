package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DriverNavigation {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://letcode.in/");
        driver.findElement(By.xpath("//div[@class='navbar-start']/child::a")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@class='card-footer-item' and @href=\"/button\"]")).click();
        driver.findElement(By.id("home")).click();
        Thread.sleep(3000);
        String HomeUrl= driver.getCurrentUrl();
        System.out.println(HomeUrl);
        driver.navigate().back();
        Thread.sleep(3000);
        String ReturnUrl= driver.getCurrentUrl();
        System.out.println(ReturnUrl);
        driver.navigate().forward();
        driver.navigate().to("https://letcode.in/contact");
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.quit();


    }

}
