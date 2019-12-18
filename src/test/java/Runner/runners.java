package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\PDC3B-Training.PDC3B\\eclipse-workspace\\tst234\\MyFeature\\Login.Feature", glue= {"StepDefinition"},
tags= {"@Regression"})

public class runners {

}
