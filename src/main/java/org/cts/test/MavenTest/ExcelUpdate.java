package org.cts.test.MavenTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUpdate {
public static void main(String[] args) throws IOException {
	
	File f = new File("C:\\Users\\vvino\\eclipse-workspace\\MavenTest\\Testdta\\ExcelWr.xlsx");
	FileInputStream a = new FileInputStream(f);
	Workbook b = new XSSFWorkbook(a);
	Sheet c = b.getSheet("Sheet1");
	Row d = c.getRow(3);
	Cell e = d.getCell(3);
	String f1 = e.getStringCellValue();
	if (f1.equals("Vinodh")) {
		e.setCellValue("Prashanth");	
		
	}
	FileOutputStream g = new FileOutputStream(f);
	b.write(g);
	System.out.println("Updated");
}

}
