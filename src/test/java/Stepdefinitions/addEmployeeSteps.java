package Stepdefinitions;

import Config.TestContext;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AddEmployeePage;
import pages.LoginPage;

import java.util.List;
import java.util.Map;

public class addEmployeeSteps {

    private TestContext context;
    private LoginPage loginpage;
    private AddEmployeePage addEmployeepage;
    private WebDriverWait wait;
    public  addEmployeeSteps(TestContext context){

        this.context = context;
        this.loginpage = context.getLoginPage();
        this.addEmployeepage =context.getAddempPage();
        this.wait = context.getWait();
    }
    @When("I enter username {string} and password {string}")
    public void i_enter_username_and_password(String username, String password) throws InterruptedException {
        //context.navigateToLoginPage();
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginpage.getUsernameField()));
        loginpage.userNameEnter(username);
        loginpage.passwordEnter(password);
        loginpage.loginButtonClick();
        Thread.sleep(4000);
    }

    @When("I click on {string}")
    public void i_click_on(String string) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(addEmployeepage.getPIMmenu()));

        addEmployeepage.pimmenuclick();
        wait.until(ExpectedConditions.visibilityOfElementLocated(addEmployeepage.getaddbutton()));

        addEmployeepage.addclick();
        wait.until(ExpectedConditions.visibilityOfElementLocated(addEmployeepage.getPIMlabel()));

    }

    @When("^I enter the following employee details$")
    public void enterEmployeeDetails(DataTable table) throws InterruptedException {
    List<List<String>> data=table.cells();
    context.getDriver().findElement(addEmployeepage.getusername()).sendKeys(data.get(0).get(0));
    Thread.sleep(3000);
    context.getDriver().findElement(addEmployeepage.getlastname()).sendKeys(data.get(0).get(1));
    }

    @Then("the employee {string} should be added successfully")
    public void the_employee_should_be_added_successfully(String string) throws InterruptedException {
        Thread.sleep(3000);
        addEmployeepage.saveclick();
    }

}
