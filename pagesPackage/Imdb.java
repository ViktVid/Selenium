package pagesPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Imdb {
	
	WebDriver driver;
	WebElement searchBox;
	WebElement submitButton;
	WebElement film;
	WebElement addToWatchlist;
	WebElement createAccount;
	WebElement name;
	WebElement email;
	WebElement password;
	WebElement rePassword;
	WebElement captcha;
	WebElement text;
	WebElement signIn;
	WebElement addedInWatchlist;
	
	public Imdb(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getSearchBox() {
		return driver.findElement(By.xpath("//*[@id=\"suggestion-search\"]"));
	}

	public WebElement getFilm() {
		return driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1--item-0\"]/a"));
	}

	public WebElement getAddToWatchlist() {
		return driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/section[1]/section/div[3]/section/section/div[3]/div[2]/div[2]/div/div/button[1]/div"));
	}
	
//	public WebElement getSignIn() {
//		return driver.findElement(By.xpath(
//				"//a[@href=\"'https://www.imdb.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.imdb.com%2Fregistration%2Fap-signin-handler%2Fimdb_us&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=imdb_us&openid.mode=checkid_setup&siteState=eyJvcGVuaWQuYXNzb2NfaGFuZGxlIjoiaW1kYl91cyIsInJlZGlyZWN0VG8iOiJodHRwczovL3d3dy5pbWRiLmNvbS90YXNrY29tcGxldGlvbi9yZWRlZW0_dGFza3Rva2VuPWV5SjBiMnRsYmtsa1pXNTBhV1pwWlhJaU9pSXhNemN0TmpnMk16YzBOeTAwTkRnMU1UVTJJaXdpZEc5clpXNUpaR1Z1ZEdsbWFXVnlWSGx3WlNJNklsTkZVMU5KVDA1ZlNVUWlMQ0poWTNScGIyNUVZWFJoSWpwN0luUmhjbWRsZEVOdmJuTjBJam9pZEhRd01ERXdNekl6SWl3aWNtRjBhVzVuVm1Gc2RXVWlPbTUxYkd4OUxDSmhZM1JwYjI0aU9pSmhaR1JVYjFkaGRHTm9iR2x6ZENJc0luUnBiV1Z6ZEdGdGNDSTZNVFl6TWpZNU1EVXhPRE00TlN3aWNtVjBkWEp1VlZKTUlqb2lMM1JwZEd4bEwzUjBNREF4TURNeU15OCUyRmNtVm1YejF1ZGw5emNsOXpjbk5uWHpBaWZRJTNEJTNEJnJlZl89bGduX25vcmVmIn0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&tag=imdbtag_reg-20'\"]"));
	
//	}
	
	
	public WebElement getAddedInWatchlist() {
		return driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/section[1]/section/div[3]/section/section/div[3]/div[2]/div[2]/div/div/button[1]/div"));
	}

public WebElement getSignIn() {
		return driver.findElement(By.cssSelector(".auth-sprite.imdb-logo.retina"));			
	}

		/*	public WebElement getCreateAccount() {
		return driver.findElement(By.xpath("//*[@id=\"signin-options\"]/div/div[2]/a"));
	}	
	
	public WebElement getName() {
			return driver.findElement(By.xpath("//*[@id=\"ap_customer_name\"]"));
		}
*/
		public WebElement getEmail() {
			return driver.findElement(By.xpath("//*[@id=\"ap_email\"]"));
		}

		public WebElement getPassword() {
			return driver.findElement(By.xpath("//*[@id=\"ap_password\"]"));
		}
		/*
		public WebElement getRePassword() {
			return driver.findElement(By.xpath("//*[@id=\"ap_password_check\"]"));
		}	*/
		
		public WebElement getSubmitButton() {
			return driver.findElement(By.id("signInSubmit"));
		}
/*		public WebElement getCaptcha() {
			return driver.findElement(By.xpath("//*[@id=\"cvf-page-content\"]/div/div/div/div[2]/div/img"));
		}
		
		public WebElement getText() {
		 return driver.findElement(By.xpath("//*[@id=\"cvf-page-content\"]/div/div/div/form/div[2]/input"));
		 
		} */

	public void insertSearchBox (String filmName) {
		this.getSearchBox().clear();
		this.getSearchBox().sendKeys(filmName);
	}
		
	public void chooseFilm () {
		this.getFilm().click();
	}
	
	public void watchlist () {
		this.getAddToWatchlist().click();
	}
	
	public void chooseSignIn () {
		this.getSignIn().click();
	}

/*	public void account () {
		this.getCreateAccount().click();
	}
	
	public void insertName(String name) {
		this.getName().sendKeys(name);
	} 
*/	
	public void insertEmail (String email) {
		this.getEmail().sendKeys(email);
	} 
	
	
	public void insertPassword(String password) {
		this.getPassword().sendKeys(password);
	} 
	 
	/*	public void rePass (String rPass) {
		this.getRePassword().sendKeys(rPass);
	} */
	
	public void clickSubmitButton() {
		this.getSubmitButton().click();
	} 
	
	public void added() {
		this.getAddedInWatchlist().getText();
	}
	
/*	public void captcha () {
		this.getCaptcha().getText();
	}
	*/
	
	
}
