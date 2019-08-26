package org.cts.test.MavenTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Java {
	
	public static void main(String[] args) throws IOException {
		//file location
		File loc=new File("C:\\Users\\vvino\\eclipse-workspace\\MavenTest\\Testdta\\farith.xlsx");
		//We are going to read the inputs from exclell we need to use class
		FileInputStream stream=new FileInputStream(loc);
		
		
		Workbook w=new XSSFWorkbook(stream);
		
		Sheet s = w.getSheet("Sheet1");
		
		s.getRow(0);
		
}
}