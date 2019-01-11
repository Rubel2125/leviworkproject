package allPagesTest;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import allPages.HomePage;
import utilities.BaseTest;
import utilities.ReadPropertiesFile;

public class HomePageTest extends BaseTest {

	HomePage homepage;
	
	@Test(enabled=false)
	public void checkSearchBoxIsWorkingOrNot() {
		
	}
	//to check its taking me to right home page
	
	@Test(priority=0)
	public void checkLunchRightHomePage() throws IOException {
		String actual=dr.getCurrentUrl();
		Properties properties=ReadPropertiesFile.fileRead("/Users/anamulhoque/eclipse-workspace/LevisCompany/config.properties");
		String url=properties.getProperty("url");
		Assert.assertEquals(actual, url);
		
	}
	
	@Test(enabled=false)
	public void checkHomePageContainsLogoTest() {
		homepage= new HomePage(dr);
		homepage.verifyhomePageLogo();//xpath error
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}