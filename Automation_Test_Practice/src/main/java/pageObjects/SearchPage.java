package pageObjects;

import org.openqa.selenium.WebDriver;

public class SearchPage {

    WebDriver driver;
    public SearchPage(WebDriver driver){
        this.driver = driver;
    }

    public void SearchResultPage(){
        String searchProductPageTitle = driver.getTitle();
        System.out.println(searchProductPageTitle);
    }
}
