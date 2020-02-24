package Pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Uitilities.Browserfactory;
import Uitilities.Configuredataprovider;
import Uitilities.Exceldataprovider;
import Uitilities.Helper;

public class Baseclass {

	
	
	
	
	
	
	
public WebDriver driver;
public Exceldataprovider excel;
public Configuredataprovider config;
public ExtentReports report;
public ExtentTest logger;

@BeforeSuite
public void setsuite(){
	Reporter.log("test case is start", true);
excel=new Exceldataprovider();
config=new Configuredataprovider();
report=new ExtentReports();
ExtentHtmlReporter extent=new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"./Reports/salman"+Helper.getcurrentDateTime()+".html"));
report.attachReporter(extent);
Reporter.log("test case is run", true);
}

@BeforeClass
public void setapp(){
driver=Browserfactory.Startapplication(driver, config.getbrowser(), config.geturl());	
}
@AfterClass
public void shintdown(){
	driver.quit();
}
@AfterMethod
public void getcurrentDateTime(ITestResult result) throws IOException{
	if(result.getStatus()==ITestResult.SUCCESS){
		logger.pass("Test acseis pass", MediaEntityBuilder.createScreenCaptureFromPath(Helper.capturescreenshot(driver)).build());
	
	}
	report.flush();
}
}
