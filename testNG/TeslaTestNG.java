package testNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
		Zadatak 2) Koristeci TestNG napraviti 2 testa.
		Jedan je otici na Google i otkucati Nikola Tesla i testirati da li se prvo pojavljuje stranica sa wikipedije,
		a drugi test je otici na wikipedia stranicu,
		otkucati Nikola Tesla i testirati da li se otvorio clanak o Nikoli Tesli.
		Koristiti BeforeMethod, BeforeClass, Test, AfterMethod, AfterClass */

//	import io.github.bonigarcia.wdm.WebDriverManager;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.*;

	public class TeslaTestNG {

		 WebDriver driver;

		    @BeforeClass
		    public void setUp() {
		    	
		        WebDriverManager.chromedriver().setup();
		        driver = new ChromeDriver();
		    }

		    @BeforeMethod
		    public void driverSetUp() {
		        driver.manage().window().maximize();
		    }

		    @Test (priority = 10)
		    public void testGoogle() {
		        driver.navigate().to("https://www.google.com");
		        WebElement searchBox = driver.findElement(By.cssSelector(".gLFyf.gsfi"));
		        searchBox.clear();
		        searchBox.sendKeys("Nikola Tesla");
		        searchBox.sendKeys(Keys.ENTER);
		        WebElement firstText = driver.findElement(By.cssSelector(".LC20lb.DKV0Md"));
		        String dobijeniPrviRezultat = firstText.getText();
		        //System.out.println(dobijeniPrviRezultat);
		        //String ocekivaniPrviRezultat = "Nikola Tesla - Vikipedija";
		        Assert.assertEquals(dobijeniPrviRezultat, "Nikola Tesla - Vikipedija");
		        //Prvo ide actual result pa expected result za Assert
		    }
		    
		    @Test (priority = 20)
		    public void testWikipedia() {
		        driver.navigate().to("https://www.wikipedia.org");
		        WebElement searchBox = driver.findElement(By.id("searchInput"));
		        searchBox.clear();
		        searchBox.sendKeys("Nikola Tesla");
		        WebElement searchButton = driver.findElement(By.cssSelector(".pure-button.pure-button-primary-progressive"));
		        searchButton.click();
		        WebElement firstHeading = driver.findElement(By.id("firstHeading"));
		        String dobijenNaslov = firstHeading.getText();
		        String ocekivanNaslov = "Nikola Tesla";
		        Assert.assertEquals(dobijenNaslov, ocekivanNaslov);
		    }

		    @AfterClass
		    public void finishTestRun() {
		        driver.close();
		        driver.quit();
		    }

		}