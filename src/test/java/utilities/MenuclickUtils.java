package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuclickUtils {

    private WebDriver driver;


    public MenuclickUtils(WebDriver driver) {

        this.driver = driver;
    }

    public void menuClickpage(String page) {
        WebElement element = driver.findElement(By.xpath("//span[text()='" + page + "']"));
        element.click();
    }
}
