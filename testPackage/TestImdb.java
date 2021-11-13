package testPackage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseTestImdb;
import junit.framework.Assert;
import pagesPackage.Imdb;

public class TestImdb extends BaseTestImdb {
	

	@BeforeMethod
	public void pageSetUp() {
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.imdb.com/");
	}

	@Test(priority = 10)
	public void addingToWatchlist() throws InterruptedException {
		Thread.sleep(1000);
		imdb.insertSearchBox("The Cabinet of Dr.Caligari");
		Thread.sleep(1000);
		imdb.chooseFilm();
		Thread.sleep(500);
		imdb.watchlist();
		Thread.sleep(1000);
		imdb.chooseSignIn();
/*		imdb.account();
		imdb.insertName("Ime"); */
		imdb.insertEmail("Milkacokic@gmail.com");
		imdb.insertPassword("The Cabinet of Dr.Caligari");
//		imdb.rePass("The Cabinet of Dr.Caligari");
		imdb.clickSubmitButton();
//		imdb.captcha(); 
		Thread.sleep(1000);
		Assert.assertTrue(imdb.getAddedInWatchlist().getText().contentEquals("In Watchlist"));
	}
}
