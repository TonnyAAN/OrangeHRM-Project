package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver= driver;
    }
    private By UsernameXpath = By.xpath("//input[@placeholder='Username']");
    private By PasswordXpath = By.xpath("//input[@placeholder='Password']");
    private By ClickLogin = By.xpath("//button[@type='submit']");
    private By DashBoardLabel = By.xpath("//h6[normalize-space()='Dashboard']");

    private By ErrorMsg = By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']");

    public By getUsernameField() {
        return UsernameXpath;
    }
    public By getDashboardLabel(){
        return DashBoardLabel;
    }
    public By getErrorMsg(){
        return ErrorMsg;
    }
    public void userNameEnter(String username){
    driver.findElement(UsernameXpath).sendKeys(username);
    }
    public void passwordEnter(String password){
    driver.findElement(PasswordXpath).sendKeys(password);
    }
    public void loginButtonClick(){
        driver.findElement(ClickLogin).click();
    }
}
