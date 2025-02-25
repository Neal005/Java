package unit_testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {
	
	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	public ReadExcelFile(String excelPath)
	{
		try {
			File src = new File(excelPath);
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int getData(int sheetnumber, int row, int column)
	{
		sheet = wb.getSheetAt(sheetnumber);
		int data = (int) sheet.getRow(row).getCell(column).getNumericCellValue();
		return data;
	}
	
	public float getDataFloat(int sheetnumber, int row, int column)
	{
		sheet = wb.getSheetAt(sheetnumber);
		float data = (float) sheet.getRow(row).getCell(column).getNumericCellValue();
		return data;
	}
	
	public int getRowCount(int sheetIndex)
	{
		int row = wb.getSheetAt(sheetIndex).getLastRowNum();
		row = row + 1;
		return row;
	}
}