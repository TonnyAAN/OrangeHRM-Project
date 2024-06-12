package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPage {

    private WebDriver driver;

    public ForgotPage(WebDriver driver){

        this.driver=driver;
    }

   private By ForgotlinkXp = By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']");
   private By ForgotTitle = By.xpath("//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']");
   private By UsernameXpath = By.xpath("//input[@placeholder='Username']");
   private By ResetButton =By.xpath("//button[@type='submit']");
   private By ResetMsg = By.xpath("//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']");
   private By RequiredXpath = By.xpath("//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']");
   private By CancelXpath = By.xpath("//button[@type='button']");
   private By LoginTextXpath = By.xpath("//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']");
    public By getforgotlinktext(){
       return ForgotlinkXp;
   }
    public By getResetMsg(){
       return ResetMsg;
   }
   public By getRequiredMsg(){
        return  RequiredXpath;
   }
   public By getLoginText(){
        return LoginTextXpath;
   }
    public By forgotTitleText(){
        return ForgotTitle;
    }
    public void forgotlinkClick(){
        driver.findElement(ForgotlinkXp).click();
    }
    public void resetButtonClick(){
       driver.findElement(ResetButton).click();
    }
    public void cancelClick(){
        driver.findElement(CancelXpath).click();
    }





}
