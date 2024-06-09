package Stepdefinitions;

import Config.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
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


}
