package testPackage;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;

import basePackage.BaseHerokuapp;
import pagesPackage.PageHerokuapp;

public class TestHerokuapp extends BaseHerokuapp {

	@BeforeMethod
	public void pageSetUp() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/login");
		
		XSSFWorkbook workbook = new XSSFWorkbook("C:\\Users\\User\\Desktop\\Book1.xlsx");
		XSSFSheet sheet = workbook.getSheet("Book1");	
		
	}
	@Test ()
	public void correctUsernameAndPassword() throws IOException {	
		
		driver.findElement(By.id("username"));
		String username = pgHerokuapp.getStringData("Sheet1", 1, 1);
		String password = pgHerokuapp.getStringData("Sheet1", 1, 2);
		pgHerokuapp.getStringData(username, 1, 1);
		
		
		
		
	}
	
}
