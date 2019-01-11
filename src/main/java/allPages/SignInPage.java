package allPages;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.CommonMethods;

public class SignInPage {
	private WebDriver dr;
	
	public SignInPage(WebDriver dr){
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}
	@FindBy(xpath="(//a[@class='signin-signout-link'])[3]")WebElement signIn;
	@FindBy(xpath="//input[@id='register.email']")WebElement email;
	@FindBy(xpath="//input[@id='password']")WebElement password;
	@FindBy(xpath="//div[@id='emailModal']//button[@class='close lsco-icon lscoicon-x']")WebElement popUp;
	
	public void clickOnsignInButton() throws InterruptedException {
		//CommonMethods.clickElement(signIn);
		Thread.sleep(3000);
		signIn.click();
	}
	public void signUpAccount(Object emailaccout, Object passwordNo) {
		email.sendKeys(emailaccout.toString());
		password.sendKeys(passwordNo.toString());
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
