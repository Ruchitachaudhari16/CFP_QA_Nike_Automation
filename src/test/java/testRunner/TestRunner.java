package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
                features = "C:\\Users\\www.abcom.in\\IdeaProjects\\Automating_Nike_Using_Cucumber\\src\\test\\resources\\userLogin.feature",
                glue = "stepDefinitions",
                dryRun = true,
                plugin = {"C:\\Users\\www.abcom.in\\IdeaProjects\\Automating_Nike_Using_Cucumber\\Target\\test-output"}

        )
public class TestRunner {
}
