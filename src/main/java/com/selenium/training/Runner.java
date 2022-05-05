package com.selenium.training;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features",
        glue= {
                //"com/selenium/training/app/example/stepDefinitions",
                "pageobjectmodel/definitions/definitions"
        }
)
public class Runner {
}
