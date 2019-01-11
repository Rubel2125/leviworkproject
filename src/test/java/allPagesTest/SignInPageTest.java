package allPagesTest;

import org.testng.annotations.Test;

import allPages.SignInPage;
import utilities.BaseTest;
import utilities.DataProbiderMethods;

public class SignInPageTest extends BaseTest{
	
	SignInPage signInPage;
	
	
	
	
	@Test(dataProvider="levisSignUp", dataProviderClass=DataProbiderMethods.class)
	public void signInTest(Object emailaccout, Object passwordNo) throws InterruptedException {
		signInPage = new SignInPage(dr);
		
		signInPage.popUpHandle();
		signInPage.clickOnsignInButton();
		System.out.println("above line works");
		signInPage.signUpAccount(emailaccout,passwordNo);
		
	}

}