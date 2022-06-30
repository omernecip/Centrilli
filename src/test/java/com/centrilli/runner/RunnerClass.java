package com.centrilli.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/centrilli/stepDefinitions",
        dryRun = false,
        tags = ""


)
public class RunnerClass {

}
