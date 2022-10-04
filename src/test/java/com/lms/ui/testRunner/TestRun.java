package com.lms.ui.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith (Cucumber.class)
@CucumberOptions
(
		
		features= "./Features/",
		glue = {"helpers","com.lms.ui.stepDefs"},
		dryRun = false,
		monochrome = true,
		plugin={"html:target/cucumber-html-report", "json:target/cucumber.json",
				 "pretty:target/cucumber-pretty.txt","usage:target/cucumber-usage.json", 
				"junit:target/cucumber-results.xml"}
		
		)
public class TestRun {

}
