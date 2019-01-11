package allPages;

import static org.testng.Assert.assertTrue;

import org.apache.http.util.Asserts;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.Assert;

import utilities.CommonMethods;

public class HomePage {
	private WebDriver dr;
	
	public HomePage(WebDriver dr){
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}
	@FindBy(xpath="//div[@id='emailModal']//button[@class='close lsco-icon lscoicon-x']")WebElement popUp;
	@FindBy(xpath="(//input[@placeholder='Search'])[1]")WebElement searchButton;
	@FindBy(xpath="//span[@class='navbar-brand']")WebElement pageLogo; 
	
	public void checkSearchBarIsWorkingOrNot() {
		CommonMethods.sendKeys(searchButton, "shirts");
	}
	public void typeOnSearchButton(String search) {
		searchButton.sendKeys(search, Keys.ENTER);
	}
	
	public void verifyhomePageLogo() {
		boolean display=pageLogo.isDisplayed();
		Assert.assertTrue(display);
	}
	public void popUpHandle() throws InterruptedException {
		Thread.sleep(3000);
		try 
		{
			popUp.click();
		}
		catch(ElementNotVisibleException e)
		{
			System.out.println(e);
		
		}
	
	
	}




	
	
	
	

}
