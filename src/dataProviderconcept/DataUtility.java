package dataProviderconcept;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DataUtility {
	@Test
	public static void readexcel() throws IOException {

		// I have placed an excel file 'Test.xlsx' in my D Driver
		FileInputStream fis = new FileInputStream("D:\\Edwin\\DataProviderTestNg.xlsx");
		// @SuppressWarnings("resource")
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		// I have added test data in the cell A1 as "SoftwareTestingMaterial.com"
		// Cell A1 = row 0 and column 0. It reads first row as 0 and Column A as 0.
		// Row row = sheet.getRow(0);
		// Cell cell = row.getCell(0);
		// System.out.println(cell);
		/*
		 * XSSFCell val0 = sheet.getRow(1).getCell(0); XSSFCell val1 =
		 * sheet.getRow(1).getCell(1); XSSFCell val2 = sheet.getRow(1).getCell(2);
		 * XSSFCell val3 = sheet.getRow(1).getCell(3); XSSFCell val4 =
		 * sheet.getRow(1).getCell(4); XSSFCell val5 = sheet.getRow(1).getCell(5);
		 * XSSFCell val6 = sheet.getRow(1).getCell(6); XSSFCell val7 =
		 * sheet.getRow(1).getCell(7); XSSFCell val8 = sheet.getRow(1).getCell(8);
		 * //XSSFCell val9 = sheet.getRow(1).getCell(9);
		 * 
		 * System.out.println(val0); System.out.println(val1); System.out.println(val2);
		 * System.out.println(val3); System.out.println(val4); System.out.println(val5);
		 * System.out.println(val6); System.out.println(val7); System.out.println(val8);
		 */

		//System.out.println(sheet.getLastRowNum());
		//System.out.println(sheet.getFirstRowNum());

		int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
		System.out.println(rowCount);


		for (int i = 1; i < rowCount + 1; i++) {

			Row row = sheet.getRow(i);

			// Create a loop to print cell values in a row

			for (int j = 0; j < row.getLastCellNum(); j++) {

				// Print Excel data in console

				System.out.println(row.getCell(j).getStringCellValue());
		
				

			}

		}

	}

}
