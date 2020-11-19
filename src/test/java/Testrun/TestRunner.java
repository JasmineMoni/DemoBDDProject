package Testrun;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(features="Featurefiles/LoginMultipleData.feature", glue="StepDef")
	public class TestRunner {
	    
	}


