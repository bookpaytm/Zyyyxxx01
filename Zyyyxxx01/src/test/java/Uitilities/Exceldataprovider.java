package Uitilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldataprovider {

	
	
	
	XSSFWorkbook wb;
public Exceldataprovider(){
File src=new File("./Testdata/Testdatasheets.xlsx");
try {
	FileInputStream fis=new FileInputStream(src);
	 wb=new XSSFWorkbook(fis);
} catch (Exception e) {
System.out.println("unsucessfully failed");
}
}
public String getString(int indexname,int row,int coloum){
	return wb.getSheetAt(indexname).getRow(row).getCell(coloum).getStringCellValue();
}

public String getStringdata(String sheetname,int row,int coloum){
	return wb.getSheet(sheetname).getRow(row).getCell(coloum).getStringCellValue();
}
public double getnumericdata(String sheetname,int row,int coloum){
	return	wb.getSheet(sheetname).getRow(row).getCell(coloum).getNumericCellValue();
	
}
}
