package utilities;

import org.openqa.selenium.WebDriver;

import allPages.HomePage;
import allPages.SignInPage;

public class PageObjectManagers {
	private WebDriver dr;
	
	PageObjectManagers(WebDriver dr){
		this.dr=dr;
	}
	
	
	private HomePage homePage;
	private SignInPage signInPage;
	
	
	public HomePage gethomePage() {
		 return (homePage==null) ? new HomePage(dr) :  homePage;
	}
	
	
	
}
