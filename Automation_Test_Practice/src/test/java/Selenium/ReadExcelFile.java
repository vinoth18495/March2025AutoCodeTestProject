package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.IOException;

public class ReadExcelFile {

    public static void main(String[] args) throws IOException, InterruptedException {

        WebDriver driver= new EdgeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.findElement(By.id("username")).sendKeys(ExcelReport.getdata("login",0,0));
        driver.findElement(By.id("password")).sendKeys(ExcelReport.getdata("login",1,0));
        driver.findElement(By.xpath("//button[text()='Submit']")).click();
        driver.quit();

    }


}
