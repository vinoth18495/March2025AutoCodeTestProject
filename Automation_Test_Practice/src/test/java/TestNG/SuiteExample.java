package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample {

    WebDriver driver;

    long StartTime;

    long EndTime;
@BeforeSuite
    public void openbrowser(){
        long StartTime = System.currentTimeMillis();
        driver = new ChromeDriver();
    }
    @Test
    public void OpenGoogle(){

        driver.get("https://www.google.co.in/");

    }

    @Test
    public void OpenYahoo(){

         driver.get("https://in.search.yahoo.com/?fr2=inr");

    }

    @Test
    public void OpenBingo(){

        driver.get("https://www.bing.com/");

    }

@AfterSuite
    public void EndBrowser(){
        driver.quit();
        EndTime = System.currentTimeMillis();
        long TotalTime = EndTime - StartTime;
        System.out.println("Total time taken" + TotalTime);
    }
    }

