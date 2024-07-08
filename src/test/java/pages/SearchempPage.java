package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class SearchempPage {

    private WebDriver driver;

    public SearchempPage(WebDriver driver) {

        this.driver = driver;

    }

    By DirectoryMenu = By.xpath("//span[normalize-space()='Directory']");
    By EmpnameField = By.xpath("//div[contains(@class, 'oxd-autocomplete-wrapper')]//input");
    By JobField = By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[1]");
    By LocationField = By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[2]");
    By search = By.xpath("//button[@type='submit']");


    public By getDirectoryDisplay() {
        return DirectoryMenu;
    }

    public By getEmpnameField() {
        return EmpnameField;
    }

    public By getJobField() {
        return JobField;
    }

    public By getLocationField() {
        return LocationField;
    }

    public void directoryMenuClick() {
        driver.findElement(DirectoryMenu).click();
    }

    public void enterempName(String empname) {
        driver.findElement(EmpnameField).sendKeys(empname);
    }

    public void select() {
        driver.findElement(EmpnameField).sendKeys(Keys.ARROW_DOWN);
    }

    public void enter() {
        driver.findElement(EmpnameField).sendKeys(Keys.ENTER);
    }

    public void empnameclick() {
        driver.findElement(EmpnameField).click();
    }

    public void getSearch() {
        driver.findElement(search).click();

    }


}
