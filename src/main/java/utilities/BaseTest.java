package utilities;

import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;



public class BaseTest {
	public WebDriver dr;
	Properties properties;
	
	@BeforeTest
	//reading from file
	public void openBrowser() throws IOException {
		properties =ReadPropertiesFile.fileRead("/Users/anamulhoque/eclipse-workspace/LevisCompany/config.properties");
		String browser = properties.getProperty("browser");
		String runmode =properties.getProperty("runmode");
		if(browser.equals("chrome")) {
			if(runmode.equals("local")) {
				System.setProperty("webdriver.chrome.driver", "/Users/anamulhoque/Downloads/chromedriver/");
				 dr = new ChromeDriver();
			}
		}
		
		
		if(browser.equals("firefox")) {
			if(runmode.equals("local")) {
				System.setProperty("webdriver.gecko.driver", "/Users/anamulhoque/Downloads/geckodriver/");
				 dr = new ChromeDriver();
			}
		}
		
		dr.get(properties.getProperty("url"));
	}
	
	@AfterTest
	public void tearDown() {
		dr.quit();
	}
	

}
