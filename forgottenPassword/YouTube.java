package forgottenPassword;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YouTube {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
/*Pomocu jave i selenijuma
1) otici na sajt youtube
2) u search-u pronaci Rick Astley i pustiti pesmu Never gonna give you up
voditi racuna da ako postoje reklame da ih preskocite
3) Nakon sto je pustena pesma, iz liste sa desne strane (watch next) pustiti drugi predlozen video  */
		
		driver.navigate().to("https://www.youtube.com");
		driver.manage().window().maximize();

		WebElement textBox = driver.findElement(By.name("search_query"));
		Thread.sleep(500);

		textBox.clear();
		Thread.sleep(500);

		textBox.sendKeys("Rick Astley Never gonna give you up official");
		Thread.sleep(500);
		
		WebElement search = driver.findElement(By.id("search-icon-legacy"));
		search.click();
		Thread.sleep(1000);

		Thread.sleep(5000);
		WebElement firstVideo = driver.findElement(By.xpath("//*[@id=\"movie_player\"]/div[15]/div/div[3]/button[1]"));
		firstVideo.click();
		
		 WebDriverWait wdwait = new WebDriverWait (driver, 5);
		 wdwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"video-title\"]/yt-formatted-string"))).click(); 	

		 Thread.sleep(5000);
		 WebElement nextVideo = driver.findElement(By.xpath("//*[@id=\"img\"]"));		 
		 nextVideo.click();
		 
	/* ( //*[@id="movie_player"]/button )
		( #movie_player > button )
		( //*[@id="movie_player"]/div[15]/div )
		( //*[@id="movie_player"]/div[3]/div[3]/button[2] ) */
	}

}
