package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    public WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver= driver;
    }
    By UsernameXpath = By.xpath("//input[@placeholder='Username']");
    By PasswordXpath = By.xpath("//input[@placeholder='Password']");
    By ClickLogin = By.xpath("//button[@type='submit']");
    By DashBoardLabel = By.xpath("//h6[normalize-space()='Dashboard']");

    public By getUsernameField() {
        return UsernameXpath;
    }
    public By getDashboardLabel(){
        return DashBoardLabel;
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
