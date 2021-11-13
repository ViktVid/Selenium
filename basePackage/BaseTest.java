package basePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import pagesPackage.LogInPage;
import pagesPackage.LogOutPage;

public class BaseTest {
	public WebDriver driver;
	public LogInPage logInPage;
	public LogOutPage logOutPage;

	@BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		// System.setProperty("webdriver.chrome.driver",
		// "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		logInPage = new LogInPage(driver);
		logOutPage = new LogOutPage(driver);
	}

	@AfterClass
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
