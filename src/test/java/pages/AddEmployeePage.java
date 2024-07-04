package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddEmployeePage {

    private WebDriver driver;

    public AddEmployeePage(WebDriver driver){
        this.driver= driver;
    }
    By PIMmenu = By.xpath("//span[normalize-space()='PIM']");
    By Addbutton = By.xpath("//button[normalize-space()='Add']");
    By PIMlabel = By.xpath("//h6[normalize-space()='PIM']");
    By Firstname =By.xpath("//input[@placeholder='First Name']");
    By Middlename =By.xpath("//input[@placeholder='Middle Name']");
    By Lastname = By.xpath("//input[@placeholder='Last Name']");
    By Savebutton =By.xpath("//button[@type='submit']");
    public By getPIMmenu(){
        return PIMmenu;
    }
    public By getaddbutton(){
        return  Addbutton;
    }
    public By getPIMlabel(){
       return PIMlabel;
    }
    public By getusername(){
        return Firstname;
    }
    public By getlastname(){
        return Lastname;
    }
    public void pimmenuclick(){
        driver.findElement(PIMmenu).click();
    }
    public void addclick(){
       driver.findElement(Addbutton).click();
    }
    public void saveclick(){
        driver.findElement(Savebutton).click();
    }


}
