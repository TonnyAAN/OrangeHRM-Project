package cucumberOptions;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/com/feature",
        glue= "Stepdefinitions",monochrome=true,plugin = {"html:target/cucumber.html"})

public class TestngRunner extends AbstractTestNGCucumberTests {
}
