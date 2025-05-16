package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebTable {

   static WebDriver driver;
   static WebElement table;

    public static void main(String[] args) {
      driver = new EdgeDriver();
      driver.manage().window().maximize();
      driver.get("https://testautomationpractice.blogspot.com/");

        table = driver.findElement(By.xpath("//table[@name=\"BookTable\"]"));

    int column= table.findElements(By.xpath("//table[@name=\"BookTable\"]//tr//child::td[2]")).size();

    for (int i=0;i<column;i++){

      String count =  table.findElements(By.xpath("//table[@name=\"BookTable\"]//tr//child::td[2]")).get(i).getText();
        System.out.println("Column_result" +" "+ count);
    }
      int rowcount = table.findElements(By.xpath("//table[@name=\"BookTable\"]//tr[3]//child::td")).size();

    for (int j=0;j<rowcount;j++){

      String rowtext =  table.findElements(By.xpath("//table[@name=\"BookTable\"]//tr[3]//child::td")).get(j).getText();
        System.out.println("Row_result" +" "+ rowtext);
    }




    }
}
