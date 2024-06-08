package Config;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

public class TestContext {
    public WebDriver driver;
    public LoginPage loginpage;

    public TestContext(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginpage = new LoginPage(driver);

    }
    public WebDriver getDriver(){
        return driver;
    }

    public LoginPage getLoginPage(){
        return loginpage;
    }
    public void tearDown(){
        if(driver!=null){
            driver.quit();
        }
    }
}
