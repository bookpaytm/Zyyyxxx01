package Uitilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuredataprovider {

	
	
	
	
	Properties pro;
	
	public Configuredataprovider(){
		File src=new File("./Configure/Configure.Properties");
		try {
			FileInputStream fis=new FileInputStream(src);
 pro=new Properties();
 pro.load(fis);
		} catch (Exception e) {
		System.out.println("unsucessfully"+e.getMessage());
		}
	}
	public String getString( String keytosearch){
		return pro.getProperty(keytosearch);
	
		
	}
public String getbrowser(){
	return pro.getProperty("browser");
}
public String geturl(){
	return pro.getProperty("qaurl");
}
	}
	

