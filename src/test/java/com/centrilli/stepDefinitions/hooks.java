package com.centrilli.stepDefinitions;

import com.centrilli.utility.Driver;
import io.cucumber.java.Scenario;
import org.junit.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class hooks {

    @After
    public void teardownScenario(Scenario scenario) throws InterruptedException {

        //if scenario fails take screenshot
        if (scenario.isFailed()){

            byte [] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());

        }

        //Thread.sleep(1000);
        Driver.closeDriver();
    }
}
