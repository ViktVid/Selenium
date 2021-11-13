package pagesPackage;

import basePackage.BaseTest;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage {

	WebDriver driver;
	WebElement username;
	WebElement password;
	WebElement submitButton;
	File file;
	FileInputStream fis;
	
	XSSFWorkbook workbook;
	
	public LogInPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getUsername() {
		return driver.findElement(By.id("username"));
	}

	public WebElement getPassword() {
		return driver.findElement(By.id("password"));
	}

	public WebElement getSubmitButton() {
		return driver.findElement(By.id("submit"));
	}

	public void insertUsername(String usernameData) {
		this.getUsername().clear();
		this.getUsername().sendKeys(usernameData);
	}

	public void insertPassword(String passwordData) {
		this.getPassword().clear();
		this.getPassword().sendKeys(passwordData);
	}

	public void clickSubmitButton() {
		this.getSubmitButton().click();
	}

}
