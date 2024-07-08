package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoadPage {

    private WebDriver driver;

    public LoadPage(WebDriver driver) {

        this.driver = driver;
    }

    By Directory = By.xpath("//span[text()='Directory']");
    By Claim = By.xpath("//span[text()='Claim']");
    By Buzz = By.xpath("//span[text()='Buzz']");
    By Performance = By.xpath("//span[text()='Performance']");
    By Myinfo = By.xpath("//span[text()='My Info']");
    By Recruitment = By.xpath("//span[text()='Recruitment']");
    By Time = By.xpath("//span[text()='Time']");
    By Leave = By.xpath("//span[text()='Leave']");
    By Pim = By.xpath("//span[text()='PIM']");
    By Admin = By.xpath("//span[text()='Admin']");

    public void directoryClick() {
        driver.findElement(Directory).click();
    }

    public void claimClick() {
        driver.findElement(Claim).click();
    }

    public void buzzClick() {
        driver.findElement(Buzz).click();
    }

    public void performanceClick() {
        driver.findElement(Performance).click();
    }

    public void myinfoClick() {
        driver.findElement(Myinfo).click();
    }

    public void recruitmentClick() {
        driver.findElement(Recruitment).click();
    }

    public void timeClick() {
        driver.findElement(Time).click();
    }

    public void leaveClick() {
        driver.findElement(Leave).click();
    }

    public void pimClick() {
        driver.findElement(Pim).click();
    }

    public void adminClick() {
        driver.findElement(Admin).click();
    }


}
