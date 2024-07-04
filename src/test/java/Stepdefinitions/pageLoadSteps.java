package Stepdefinitions;

import Config.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.LoadPage;
import pages.LoginPage;
import utilities.MenuclickUtils;

public class pageLoadSteps {
    private TestContext context;
    private LoginPage loginpage;
    private WebDriverWait wait;
    private LoadPage loadpage;
    private MenuclickUtils menuclickUtils;
    private String currentUrl;

    public pageLoadSteps(TestContext context){
        this.context = context;
        this.loginpage = context.getLoginPage();
        this.loadpage =context.getLoadPage();
        this.menuclickUtils =context.getMenuclickUtils();

    }
    @When("the user navigates to the {string} page")
    public void the_user_navigates_to_the_page(String page)  {
     menuclickUtils.menuClickpage(page);
    }
    @Then("the {string} page should load successfully")
    public void the_page_should_load_successfully(String string) {
        currentUrl = context.getDriver().getCurrentUrl();
        System.out.println("Navigated to URL: " + currentUrl);
    }
    @Then("the page title should be {string}")
    public void the_page_title_should_be(String expectedUrlPart) {
        Assert.assertTrue(currentUrl.contains(expectedUrlPart),"URL does not contain expected part");
    }

}
