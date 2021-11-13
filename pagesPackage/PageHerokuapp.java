package pagesPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageHerokuapp {

	WebDriver driver;
	File file;
	FileInputStream fis;

	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;

	public PageHerokuapp(String filePath) throws IOException {
		this.file = new File(filePath);
		this.fis = new FileInputStream(file);
		this.workbook = new XSSFWorkbook(fis);

	}

	public String getStringData(String sheetName, int rowNumber, int cellNumber) {
		this.sheet = workbook.getSheet(sheetName);
		this.row = sheet.getRow(rowNumber);
		this.cell = row.getCell(cellNumber);
		return this.cell.getStringCellValue();
	}

	public int getIntegerData(String sheetName, int rowNumber, int cellNumber) {
		this.sheet = workbook.getSheet(sheetName);
		this.row = sheet.getRow(rowNumber);
		this.cell = row.getCell(cellNumber);
		return (int) this.cell.getNumericCellValue();
	}
}