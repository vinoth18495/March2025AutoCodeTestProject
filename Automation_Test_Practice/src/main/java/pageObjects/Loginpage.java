package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Base64Encoder;
import utils.ReadPropertyValue;

import java.io.IOException;

public class Loginpage {

    WebDriver driver;

    public Loginpage(WebDriver Driver){
        this.driver = Driver;
    }

    public void EnterUserName(){
        String username = driver.findElement(By.xpath("//div[@class='login']//div[1]//label[1]")).getText().split(" ")[1].substring(1);
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);

    }

    public void EnterPassword() throws IOException {
        driver.findElement(By.id("password")).sendKeys(Base64Encoder.decode64(ReadPropertyValue.getPropertyValue("password")));
    }

    public void ClickLogin(){
        driver.findElement(By.xpath("//button[text()='Login']")).click();
    }
}
