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

   public By getforgotlinktext(){

       return ForgotlinkXp;
   }
   public void forgotlinkClick(){
        driver.findElement(ForgotlinkXp).click();
    }

    public By forgotTitleText(){
        return ForgotTitle;
    }

}
