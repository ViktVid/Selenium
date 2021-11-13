package basePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import pagesPackage.SearchTeslaPage;

public class BaseTesla {

	public WebDriver driver;
	public SearchTeslaPage searchTeslaPage;
	
	@BeforeClass
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		searchTeslaPage = new SearchTeslaPage(driver);
		
	}
	
//	@AfterClass
//	public void tearDown() {
//		driver.close();
//		driver.quit();
//	}

	
	
}
