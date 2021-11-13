package testLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLogin {
	
    WebDriver driver;

    @BeforeClass
    public void setUp() {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
    }
    
    @BeforeMethod
    public void driverSetUp() {
        driver.manage().window().maximize();
    }

    @Test
    public void positiveLogInTest() {
    	
    	driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
    	
    	WebElement username = driver.findElement(By.id("username"));
    	username.clear();
    	username.sendKeys("student");
    	
    	WebElement password = driver.findElement(By.id("password"));
    	password.clear();
    	password.sendKeys("Password123");
    	
    	WebElement submit = driver.findElement(By.id("submit"));
    	submit.click();
    	
    }
    
}
