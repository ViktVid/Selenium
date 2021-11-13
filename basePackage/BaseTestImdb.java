package basePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import pagesPackage.Imdb;

public class BaseTestImdb {
	public WebDriver driver;
	public Imdb imdb;

	@BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		imdb = new Imdb(driver);

	}

	@AfterClass
	public void tearDown() {
		driver.close();
		driver.quit();
		
	}
 
}
