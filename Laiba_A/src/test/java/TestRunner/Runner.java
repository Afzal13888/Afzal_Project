package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(
			features= {"src/test/java/Feature/BDD.feature"},
			dryRun =! true,
//			snippets = SnippetType.CAMELCASE,
			monochrome =true,
			glue ="step2"
		        )
public class Runner extends AbstractTestNGCucumberTests {

}
