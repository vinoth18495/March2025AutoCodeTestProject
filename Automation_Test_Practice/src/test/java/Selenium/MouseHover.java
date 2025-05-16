package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.shopclues.com");
        WebElement hower= driver.findElement(By.xpath("//li[@id='nav_44']/child::a"));
        Actions a=new Actions(driver);
        a.clickAndHold(hower).build().perform();




    }
}
