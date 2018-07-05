package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="E:/Sel_project/bddTest_POM/src/main/java/com/qa/features/login.feature"
		,glue ={"com/qa/stepdef"},
		format={"pretty","html:test-output"},
		dryRun=false
		)

public class TestRunner {

}
