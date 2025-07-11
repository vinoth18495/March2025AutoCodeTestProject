package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputHandling_Concept {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://letcode.in/");
        driver.findElement(By.xpath("//div[@class='navbar-start']/child::a")).click();
        driver.findElement(By.xpath("//a[@class='card-footer-item' and @href='/edit']")).click();
        driver.findElement(By.xpath("//input[@id='fullName']")).sendKeys("vinothkumar");
        driver.findElement(By.xpath("//input[@id='join']")).sendKeys(" person", Keys.ENTER);
        String v=driver.findElement(By.id("getMe")).getAttribute("value");
        System.out.println(v);
        driver.findElement(By.id("clearMe")).clear();
        Boolean Isenable = driver.findElement(By.id("noEdit")).isEnabled();
        System.out.println(Isenable);
        String isreadonly= driver.findElement(By.id("dontwrite")).getAttribute("readonly");
        System.out.println(isreadonly);
        driver.quit();
    }
}
