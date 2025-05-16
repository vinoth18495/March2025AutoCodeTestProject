package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdownlist {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.expandtesting.com/dropdown");
       WebElement value= driver.findElement(By.xpath("//select[@id=\"country\"]"));
        Select Staticvalue=new Select(value);
        Staticvalue.selectByIndex(3);
        WebElement m=driver.findElement(By.xpath("//select[@id='elementsPerPageSelect']"));
        Select info=new Select(m);
        info.selectByValue("50");

    }
}
