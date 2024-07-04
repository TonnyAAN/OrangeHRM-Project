package Stepdefinitions;

import Config.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;
import pages.SearchempPage;
import utilities.DropdownUtils;


public class searchEmployeeSteps {

    private TestContext context;
    private LoginPage loginpage;
    private SearchempPage searchemppage;

    private DropdownUtils dropdownUtils;
    private WebDriverWait wait;


    public searchEmployeeSteps(TestContext context) {

        this.context = context;
        this.loginpage = context.getLoginPage();
        this.searchemppage = context.getSearchempPage();
        this.dropdownUtils = context.getDropdownUtils();
        this.wait = context.getWait();
    }

    @Given("I navigate to the {string} menu")
    public void i_navigate_to_the_menu(String string) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchemppage.getDirectoryDisplay()));
        searchemppage.directoryMenuClick();
    }

    @When("I search for an employee by name {string}")
    public void i_search_for_an_employee_by_name(String empname) throws InterruptedException {

        wait.until(ExpectedConditions.visibilityOfElementLocated(searchemppage.getEmpnameField()));
        searchemppage.empnameclick();
        searchemppage.enterempName(empname);
        Thread.sleep(4000);
        searchemppage.select();
        Thread.sleep(3000);
        searchemppage.enter();
    }

    @When("I select jobtitle for employee {string}")
    public void i_select_jobtitle_for_employee(String jobtitle) throws InterruptedException {

        Thread.sleep(3000);
        context.getDriver().findElement(searchemppage.getJobField()).click();
        dropdownUtils.selectDropdownByVisibleText(jobtitle);

    }

    @When("I select location  for employee {string}")
    public void i_select_location_for_employee(String location) throws InterruptedException {

        Thread.sleep(3000);
        context.getDriver().findElement(searchemppage.getLocationField()).click();
        dropdownUtils.selectDropdownByVisibleText(location);

    }


    @Then("I should see the employee details for {string}")
    public void i_should_see_the_employee_details_for(String string) throws InterruptedException {
        searchemppage.getSearch();
        Thread.sleep(8000);
    }
}
