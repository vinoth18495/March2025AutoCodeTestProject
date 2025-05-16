package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertConcept {


    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/alert");
        //simple Alert
        driver.findElement(By.id("accept")).click();
        String name = driver.switchTo().alert().getText();
        System.out.println(name);
        driver.switchTo().alert().accept();

        //comfirm Alert
        driver.findElement(By.id("confirm")).click();
        String text = driver.switchTo().alert().getText();
        System.out.println(text);
        driver.switchTo().alert().dismiss();

        //prompt Alert
        driver.findElement(By.id("prompt")).click();
        String output = driver.switchTo().alert().getText();
        System.out.println(output);
        driver.switchTo().alert().sendKeys("vinoth");
        driver.switchTo().alert().accept();
        String point = driver.findElement(By.id("myName")).getText();
        System.out.println(point);

    }
}
