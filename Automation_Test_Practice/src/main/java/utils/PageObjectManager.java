package utils;

import org.openqa.selenium.WebDriver;
import pageObjects.HomePage;
import pageObjects.Loginpage;
import pageObjects.SearchPage;

public class  PageObjectManager {
    WebDriver driver;
    SearchPage page;
    HomePage mainPage;
    public PageObjectManager(WebDriver driver){
        this.driver= driver;
    }


    public HomePage GetHomepage(){
        mainPage = new HomePage(driver);
        return mainPage;
    }

    public SearchPage GetSearchPage(){
        page = new SearchPage(driver);
        return page;
    }
    public Loginpage GetLogin(){
        Loginpage loginpage=new Loginpage(driver);
        return loginpage;
    }
}
