package com.bddsoftwaretestingboard.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", // Path to feature files
        glue = "com.bddsoftwaretestingboard.stepDefinitions",  // Path to step definition classes
        plugin = {"pretty", "html:target/cucumber-reports"} // Enable HTML reporting
)
public class TestRunner {


}
