package Config;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;

import java.time.Duration;

public class TestContext {
    private static final String BASE_URL = "https://opensource-demo.orangehrmlive.com/";
    private static final int WAIT_TIMEOUT = 10;
    public WebDriver driver;
    public LoginPage loginpage;
    private WebDriverWait wait;
    public TestContext(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginpage = new LoginPage(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIMEOUT));
    }
    public WebDriver getDriver(){
        return driver;
    }

    public LoginPage getLoginPage(){
        return loginpage;
    }
    public WebDriverWait getWait() {
        return wait;
    }
    public void navigateToLoginPage() {
        driver.get(BASE_URL);
    }

    public void tearDown(){
        if(driver!=null){
            driver.quit();
        }
    }
}
