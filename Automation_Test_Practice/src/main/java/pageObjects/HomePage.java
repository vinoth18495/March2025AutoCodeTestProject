package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver webdriver){
        this.driver=webdriver;
    }
    public void selectDropDownValue(){
        WebElement Selectvalue = driver.findElement(By.id("searchDropdownBox"));
        Select CatagoryDrapdownValue = new Select(Selectvalue);
        CatagoryDrapdownValue.selectByIndex(3);
    }
    public void searchProductName(String ProductName){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys((ProductName));
    }
    public void clickSearchIcon()
    {
        driver.findElement(By.id("nav-search-submit-button")).click();
    }


}
