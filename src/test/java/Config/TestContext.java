package Config;




import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.*;
import utilities.DropdownUtils;
import utilities.MenuclickUtils;
import io.qameta.allure.Allure;
import java.io.ByteArrayInputStream;
import org.openqa.selenium.TakesScreenshot;
import java.time.Duration;

public class TestContext {
    private static final String BASE_URL = "https://opensource-demo.orangehrmlive.com/";
    private static final int WAIT_TIMEOUT = 10;
    public WebDriver driver;
    public LoginPage loginpage;
    public ForgotPage forgotpage;
    public AddEmployeePage addemployeepage;
    public SearchempPage searchemppage;
    public LoadPage loadpage;
    public DropdownUtils dropdownUtils;
    public MenuclickUtils menuclickUtils;
    public WebDriverWait wait;

    public TestContext(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginpage = new LoginPage(driver);
        forgotpage = new ForgotPage(driver);
        addemployeepage = new AddEmployeePage(driver);
        searchemppage = new SearchempPage(driver);
        loadpage = new LoadPage(driver);
        dropdownUtils = new DropdownUtils(driver);
        menuclickUtils = new MenuclickUtils(driver);

        wait = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIMEOUT));
    }
    public WebDriver getDriver(){
        return driver;
    }
    public void navigateToLoginPage() {
        driver.get(BASE_URL);
    }

    public LoginPage getLoginPage(){
        return loginpage;
    }

    public  ForgotPage getForgotPage(){
        return forgotpage;
    }

    public AddEmployeePage getAddempPage(){
        return addemployeepage;
    }

    public SearchempPage getSearchempPage(){
        return searchemppage;
    }
    public LoadPage getLoadPage(){
        return loadpage;
    }

    public DropdownUtils getDropdownUtils(){
        return dropdownUtils;
    }
    public MenuclickUtils getMenuclickUtils(){
        return menuclickUtils;
    }
    public WebDriverWait getWait() {
        return wait;
    }

    public void takeScreenshot(String name) {
        Allure.addAttachment(name, new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
    }


    public void tearDown(){

     if(driver!=null){
         driver.quit();

     }
   }
}
