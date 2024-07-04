package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.NoSuchElementException;

public class DropdownUtils {

    private WebDriver driver;

    public DropdownUtils(WebDriver driver) {

        this.driver = driver;
    }

    public void selectDropdownByVisibleText(String visibleText) throws InterruptedException {

        Thread.sleep(3000);
        System.out.println(visibleText);

        List<WebElement> options = driver.findElements(By.xpath("//div[@role='listbox']//div"));
        System.out.println("Number of options found: " + options.size());
        boolean optionFound = false;
        for (WebElement option : options) {
            String optionText = option.getText().trim();
            System.out.println("Option text: '" +optionText+ "'");
            if (optionText.equalsIgnoreCase(visibleText.trim())) {
                System.out.println("Match found. Clicking option.");
                option.click();
                optionFound = true;
                break;
            }
        }
        if (!optionFound) {
            System.out.println("No matching option found for: " + visibleText);
            throw new NoSuchElementException("No matching location found: " + visibleText);
        }
    }


}
