package com.capgemini.testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@RunWith(Cucumber.class)
@CucumberOptions(
				features = "./Features/HelpCenter.feature", 
				glue = "com.capgemini.stepDefinations", 
				dryRun = false,
				strict = true,
				plugin = { "pretty","html:test-output"},
				monochrome=true,		
				tags={}
				)
public class TestRun extends AbstractTestNGCucumberTests {
}