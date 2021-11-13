package basePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import pagesPackage.PageHerokuapp;

public class BaseHerokuapp {
		public WebDriver driver;
		public PageHerokuapp pgHerokuapp;
		
		
	@BeforeClass
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
}
