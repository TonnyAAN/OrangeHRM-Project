package Stepdefinitions;

import Config.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.LoginPage;

import java.time.Duration;

public class loginHrmSteps {
    public LoginPage loginpage ;
    public TestContext context;
    public WebDriverWait wait;
    public loginHrmSteps(TestContext context){
        this.context = context;
        this.loginpage = context.getLoginPage();
    }


    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        context.getDriver().get("https://opensource-demo.orangehrmlive.com/");
        wait = new WebDriverWait(context.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginpage.getUsernameField()));
    }
    @When("I enter username {string}")
    public void i_enter_username(String username) {
        loginpage.userNameEnter(username);
    }
    @When("I enter password {string}")
    public void i_enter_password(String password) {
        loginpage.passwordEnter(password);
    }
    @When("I click on the login button")
    public void i_click_on_the_login_button() {
        loginpage.loginButtonClick();
    }
    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() {
        wait = new WebDriverWait(context.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginpage.getDashboardLabel()));
        String dashboardlabel = context.getDriver().findElement(loginpage.getDashboardLabel()).getText();
        Assert.assertEquals(dashboardlabel,"Dashboard");

    }
    @After
    public void tearDown() {
        context.tearDown();
    }


}
