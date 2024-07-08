package Stepdefinitions;

import Config.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.ForgotPage;
import pages.LoginPage;

public class forgotSteps {
    private TestContext context;
    private LoginPage loginpage;
    private ForgotPage forgotpage;
    private WebDriverWait wait;

    public forgotSteps(TestContext context){
        this.context = context;
        this.loginpage = context.getLoginPage();
        this.forgotpage = context.getForgotPage();
        this.wait = context.getWait();
    }
    @When("I click on the  {string} link")
    public void i_click_on_the_link(String string) {
        context.navigateToLoginPage();
         wait.until(ExpectedConditions.visibilityOfElementLocated(forgotpage.getforgotlinktext()));
         forgotpage.forgotlinkClick();
         wait.until(ExpectedConditions.visibilityOfElementLocated(forgotpage.forgotTitleText()));
    }
    @Then("I should be redirected to the password reset page")
    public void i_should_be_redirected_to_the_password_reset_page() {
        String forgottitlelabel = context.getDriver().findElement(forgotpage.forgotTitleText()).getText();
        Assert.assertEquals(forgottitlelabel,"Reset Password");

    }
    @When("I enter a valid username {string}")
    public void i_enter_a_valid_username(String resetusername) {
     loginpage.userNameEnter(resetusername);
    }
    @When("I click on the {string} button")
    public void i_click_on_the_button(String string) {
    forgotpage.resetButtonClick();
    }
    @Then("I should see a message \"\"Reset Password link sent successfully\"")
    public void i_should_see_a_message_reset_password_link_sent_successfully() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(forgotpage.getResetMsg()));
        String successMsg = context.getDriver().findElement(forgotpage.getResetMsg()).getText();
        Assert.assertEquals(successMsg,"Reset Password link sent successfully");
    }

    @When("I leave the username field empty")
    public void i_leave_the_username_field_empty() {
    String usernameField = context.getDriver().findElement(loginpage.getUsernameField()).getText();
    usernameField.isEmpty();
    }
    @Then("I should see a message {string}")
    public void i_should_see_a_message(String requiredlabel) {
        forgotpage.resetButtonClick();
        wait.until(ExpectedConditions.visibilityOfElementLocated(forgotpage.getRequiredMsg()));
        String actualReqLabel = context.getDriver().findElement(forgotpage.getRequiredMsg()).getText();
        Assert.assertEquals(actualReqLabel,requiredlabel);

    }
    @When("I click on the cancel button")
    public void i_click_on_the_cancel_button() {
     forgotpage.cancelClick();
    }
    @Then("I should be redirected back to login page")
    public void i_should_be_redirected_back_to_login_page() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(forgotpage.getLoginText()));
        String loginlabel = context.getDriver().findElement(forgotpage.getLoginText()).getText();
        Assert.assertEquals(loginlabel,"Login");

    }




}
