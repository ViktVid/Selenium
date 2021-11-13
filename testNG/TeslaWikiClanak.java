package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class TeslaWikiClanak {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");

		WebDriver d = new ChromeDriver();

		d.navigate().to("https://www.google.com");
		d.manage().window().maximize();

		WebElement searchBox = d
				.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
		Thread.sleep(500);
		searchBox.sendKeys("Nikola Tesla");
		Thread.sleep(500);
		d.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[5]/center/input[1]"))
				.click();

		Thread.sleep(500);
		d.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]"));
		Thread.sleep(500);
		WebElement firstPage = d.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div/div[1]/a/h3"));
		firstPage.click();
		Thread.sleep(500);

		WebElement variants = d.findElement(By.id("p-variants"));
		variants.click();
		WebElement variants2 = d.findElement(By.id("ca-varlang-2"));
		variants2.click();
		WebElement footer = d.findElement(By.id("footer-places-about"));
		footer.getText();

		String expectedText = "O Vikipediji";

		Assert.assertEquals(expectedText, footer);

	}
}
