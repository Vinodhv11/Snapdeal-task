package org.cts.test.MavenTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTest {
public static void main(String[] args) throws Throwable {
	File Loc = new File("C:\\Users\\vvino\\eclipse-workspace\\MavenTest\\Testdta\\Test.xlsx");
	FileInputStream a = new FileInputStream(Loc);
	
	Workbook b = new XSSFWorkbook(a);
	Sheet c = b.getSheet("Sheet1");
	for (int i = 0; i < c.getPhysicalNumberOfRows(); i++) {
		Row d = c.getRow(i);
		for (int j = 0; j < d.getPhysicalNumberOfCells(); j++) {
			Cell e = d.getCell(j);
			System.out.println(e);
			
		}
		
	}
}
}
