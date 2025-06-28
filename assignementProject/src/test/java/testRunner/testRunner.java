package testRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\main\\java\\features",glue="stepDefinations",
monochrome=true,
plugin= {"pretty", "html:target/cucumber-reports/report.html","json:target/cucumber-reports/reoprt.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
tags="@performance or @login")

public class testRunner extends AbstractTestNGCucumberTests{
	
	//use for parallel execution 
	@DataProvider(parallel=true)
	public Object[][] scenarios() {
		return super.scenarios();
	}
}
