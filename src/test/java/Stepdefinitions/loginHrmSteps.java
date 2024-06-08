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
    private LoginPage loginpage ;
    private TestContext context;
    private WebDriverWait wait;
    public loginHrmSteps(TestContext context){
        this.context = context;
        this.loginpage = context.getLoginPage();
        this.wait = context.getWait();
    }


    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        //context.getDriver().get("https://opensource-demo.orangehrmlive.com/");
        context.navigateToLoginPage();
        //wait = new WebDriverWait(context.getDriver(), Duration.ofSeconds(10));
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

    @When("I enter {string} and {string}")
    public void i_enter_and(String invaliduser, String invalidpassword) {
       loginpage.userNameEnter(invaliduser);
       loginpage.passwordEnter(invalidpassword);
    }
    @Then("I should see an error message {string}")
    public void i_should_see_an_error_message(String errormsg) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginpage.getErrorMsg()));
        String actualerrorlabel = context.getDriver().findElement(loginpage.getErrorMsg()).getText();
        Assert.assertEquals( actualerrorlabel,errormsg);
    }
    @After
    public void tearDown() {
        context.tearDown();
    }


}
