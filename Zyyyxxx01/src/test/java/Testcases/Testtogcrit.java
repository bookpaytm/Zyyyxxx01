package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.Baseclass;
import Pages.Loginpage;
import Uitilities.Browserfactory;
import Uitilities.Exceldataprovider;

public class Testtogcrit extends Baseclass {

	
	
	
	
	
	
	

@Test
public void launchapp(){
logger=report.createTest("testtogcrit");
Loginpage login=PageFactory.initElements(driver, Loginpage.class);
logger.info("Start application");
login.Testtogcrit(excel.getStringdata("login", 0, 0), excel.getStringdata("login", 0, 1));
logger.pass("satart application is passed");
}
}
