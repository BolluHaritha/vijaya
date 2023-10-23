package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\BolluHaritha\\Lesson5-CucumberDemo\\src\\test\\java\\features\\StepArugumentExample.feature",
                 glue= {"steps"},
                 dryRun=false,
                 plugin= {"pretty",
                		 "html:target/cucumberreport.html",
                		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", 
           			  "timeline:test-output-thread/"}, 
                 tags = "@all" 
  )

public class TestRunner {

}
