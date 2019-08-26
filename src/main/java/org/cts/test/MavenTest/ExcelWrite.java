package org.cts.test.MavenTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\vvino\\eclipse-workspace\\MavenTest\\Testdta\\ExcelWr.xlsx");
	    Workbook a = new XSSFWorkbook();
	    Sheet b = a.createSheet("Sheet1");
	    Row c = b.createRow(3);
	    Cell d = c.createCell(3);
	    d.setCellValue("Vinodh");
	    
	    FileOutputStream e = new FileOutputStream(f);
	    a.write(e);
	    System.out.println("wrote");
	    
		
	}

	
}
