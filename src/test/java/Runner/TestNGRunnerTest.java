package Runner;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions 
			(plugin = {"pretty","html:target/cucumber/testnewcucumber.html"},
			features = "src/test/resources/Features",
			glue = {"DriverFactory","CustomType","DomainObjects","Hooks","PageObjectModel","StepDefinitions"})

public class TestNGRunnerTest extends AbstractTestNGCucumberTests
{
	@Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}