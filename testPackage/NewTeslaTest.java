package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseTesla;

public class NewTeslaTest extends BaseTesla {

	@BeforeMethod
	public void pageSetUp() {
		driver.manage().window().maximize();
		driver.navigate().to("https://www.wikipedia.com");
	}

	@Test(priority = 10)
	public void testPrvaStranica() {
		
		searchTeslaPage.chooseLanguage();
		searchTeslaPage.typeInSearchBox("Nikola Tesla");
		searchTeslaPage.submitButton();
		searchTeslaPage.logoW();
		
	

	}


}
