package Stepdefenitionfiles;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.TextContext;

public class AmazonHomePageSteps {

    TextContext context;


    public AmazonHomePageSteps(TextContext context) {

        this.context = context;
    }


    @When("Select the dropdown values")
    public void selectTheDropdownValues() {
        context.pageObjectManager.GetHomepage().selectDropDownValue();
    }


    @And("Click the icon button")
    public void clickTheIconButton() {
      context.pageObjectManager.GetHomepage().clickSearchIcon();
    }

    @Then("Search the productName {string} in the Searchbar")
    public void searchTheProductNameInTheSearchbar(String ProductName) {
        context.pageObjectManager.GetHomepage().searchProductName(ProductName);
    }


    @And("validate the title")
    public void validateTheTitle() {
      context.pageObjectManager.GetSearchPage().SearchResultPage();
    }
}
