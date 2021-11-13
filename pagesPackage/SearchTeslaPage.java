package pagesPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchTeslaPage {

	WebDriver driver;
	WebElement languageBox;
	WebElement searchBox;
	WebElement submit;
	WebElement logo;
	WebElement cuca;
	
	public SearchTeslaPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getLanguageBox() {
		return driver.findElement(By.id("js-link-box-en"));
	}

	public WebElement getSubmit() {
		return driver.findElement(By.id("searchButton"));
	}

	public WebElement getSearchBox() {
		return driver.findElement(By.id("searchInput"));
	}
	
	public WebElement getLogo() {
		return driver.findElement(By.id("mp-welcome"));
	}
	
	public void chooseLanguage() {
		this.getLanguageBox().click();

	}

	public void submitButton() {
		this.getSubmit().click();
	}
	
	public void typeInSearchBox (String text) {
		this.getSearchBox().sendKeys(text);
	}
	
	public void logoW () {
		this.getLogo().getText();
	}
	


}