package com.testRunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.JvmReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//@RunWith(Cucumber.class)
//@CucumberOptions(features = "src\\test\\resources\\Feature",glue = "com.stepDefination")

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Feature", glue="com.stepDefination", monochrome = true, plugin = {"pretty", "json:src\\test\\resources\\Reports\\facebook.json"}, dryRun = false, strict = true)

public class TestRunner {
	@AfterClass
	public static void reports(){
	    JvmReport.generateReport(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\facebook.json");
	}
		
	

}
