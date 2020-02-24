package Uitilities;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {

	
	
	
	
	
public static String capturescreenshot(WebDriver driver){
File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
String screenshotpath=System.getProperty("user.dir")+"./Screenshot/shabnam"+ getcurrentDateTime()+".png";
try {
	FileHandler.copy(src, new File(screenshotpath));
	System.out.println("capturescreenshot");
} catch (IOException e) {
System.out.println("we do not capture screenshot");
}
return screenshotpath;
}
public static String getcurrentDateTime(){
	DateFormat format=new SimpleDateFormat("MM_dd_yyyy_mm_ss");
	Date currentdate=new Date();
	return format.format(currentdate);
	
}
}
