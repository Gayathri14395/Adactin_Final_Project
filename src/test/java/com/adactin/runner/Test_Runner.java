package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.helper.FileReaderManager;
import com.adactin_finalproject.baseclass.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//java//com//adactin//feature", glue="com.adactin.stepdefinition",
monochrome=true,plugin= {"html:Reports/Adactin Report",
"pretty","json:Reports/json Report.json"},tags={"@smokeTest,@sanityTest"})


public class Test_Runner {
	
	public static  WebDriver driver;
	
	@BeforeClass
	public static void set_up() throws Throwable {
		
	String browser = FileReaderManager.getInstance().getInstanceCR().getBrowser();
		
	driver=	BaseClass.toLaunchBrowser(browser);
	//.toMaximize();
	}
	
	@AfterClass
	public static void tearDown() throws Throwable {
		BaseClass.toSleep();
		BaseClass.toClose();
	}
}
