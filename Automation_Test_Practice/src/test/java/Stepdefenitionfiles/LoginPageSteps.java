package Stepdefenitionfiles;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.Loginpage;
import utils.TextContext;

import java.io.IOException;

public class LoginPageSteps {
     TextContext context;
    public LoginPageSteps(TextContext context){
        this.context = context;
    }


    @Given("User enter the username")
    public void userEnterTheUsername() {
        context.pageObjectManager.GetLogin().EnterUserName();
    }

    @Then("User enter the password")
    public void userEnterThePassword() throws IOException {
        context.pageObjectManager.GetLogin().EnterPassword();
    }

    @And("Enter the click function")
    public void enterTheClickFunction() {
        context.pageObjectManager.GetLogin().ClickLogin();
    }
}
