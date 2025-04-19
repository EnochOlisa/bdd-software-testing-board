package com.bddsoftwaretestingboard.stepDefinitions;

import com.bddsoftwaretestingboard.config.SpringConfig;
import com.bddsoftwaretestingboard.pages.LoginPOM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.springframework.test.context.ContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(classes = SpringConfig.class)

public class LoginStepDef {

    WebDriver driver = new EdgeDriver();
    LoginPOM loginPage = new LoginPOM(driver);

    @Given("User is on the login page")
    public void userIsOnLoginPage() {
        loginPage.navigateToLoginPage();
    }

    @When("User enters valid credentials")
    public void userEntersValidCredentials() {
        loginPage.enterUsername("enocholisa@yahoo.com");
        loginPage.enterPassword("Tester@123");
    }

    @When("User clicks on the login button")
    public void userClicksOnLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("User should be redirected to the homepage with logged-in status")
    public void userIsRedirectedToHomePage() {
        loginPage.confirmLogin();
    }
}
