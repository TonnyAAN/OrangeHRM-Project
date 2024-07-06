package Stepdefinitions;

import Config.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class Hooks {
    private  TestContext context;

    public Hooks(TestContext context) {
        this.context = context;
    }

    @After(order=1)
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            context.takeScreenshot("Failed scenario screenshot");
        }
        context.takeScreenshot("End of scenario screenshot");
    }
    @After(order=0)
    public void tearDown() {
        context.tearDown();
    }
}