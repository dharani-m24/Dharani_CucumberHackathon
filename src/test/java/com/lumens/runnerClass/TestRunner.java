package com.lumens.runnerClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="FeatureFiles",
				glue="com.lumens.stepDefinitions",
				dryRun = false,
				monochrome = true,
				plugin = {"html:target/cucumber-html-report","com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/extendreport.html"})
public class TestRunner {

}
