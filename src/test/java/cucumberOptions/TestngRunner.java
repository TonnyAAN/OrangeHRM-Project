package cucumberOptions;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions
        (features="src/test/java/com/feature",
        glue= "Stepdefinitions",monochrome=true,plugin={"html:target/cucumber.html","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"})

public class TestngRunner extends AbstractTestNGCucumberTests {
}



