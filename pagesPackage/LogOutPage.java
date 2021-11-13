package pagesPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogOutPage {

	WebDriver driver;
	WebElement logOutButton;

	public LogOutPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getLogOutButton() {
		return driver.findElement(By.cssSelector(
				".wp-block-button__link.has-text-color.has-background.has-very-dark-gray-background-color"));
	}

}
