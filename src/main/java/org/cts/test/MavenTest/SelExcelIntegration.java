package org.cts.test.MavenTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SelExcelIntegration {
	public static String getData(int rowno, int colno) throws IOException {
		File loc = new File("C:\\Users\\vvino\\eclipse-workspace\\MavenTest\\Testdta\\Selenium with excel integration.xlsx");
		FileInputStream stream = new FileInputStream(loc);
		Workbook book = new XSSFWorkbook(stream);
		Sheet s = book.getSheet("Sheet1");
		Row r = s.getRow(rowno);
		Cell c = r.getCell(colno);
		int type = c.getCellType();
		String name = "";
		if (type==1) {
			name = c.getStringCellValue();
			System.out.println(name);
			
		}
		else if (type==0) {
			if (DateUtil.isCellDateFormatted(c)) {
				Date d = c.getDateCellValue();
				SimpleDateFormat fo = new SimpleDateFormat("dd-mmm-yy");
				name = fo.format(d);
				System.out.println(name);			
			}
			else {
				double d = c.getNumericCellValue();
				long l = (long)d;
				name = String.valueOf(l);
				System.out.println(name);
			}
			
		}
		return name;
	}
	public static void main(String[] args) throws Throwable {
		getData(2, 2);
	}

}
