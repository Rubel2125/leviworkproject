package allPagesTest;

import org.testng.annotations.Test;

import allPages.FilteredResultPage;
import allPages.HomePage;
import allPages.ProductResultsPage;
import allPages.ShirtPage;
import utilities.BaseTest;

public class ProductResultPageTest extends BaseTest{
	
	
	ProductResultsPage productResultsPage;
	HomePage homePage;
	ShirtPage shirtPage;
	FilteredResultPage filteredResultPage;
	
	
	
	@Test
	public void filterButtonTest() throws InterruptedException {
		//productResultsPage = new ProductResultsPage(dr);
		homePage = new HomePage(dr);
		homePage.popUpHandle();
		homePage.typeOnSearchButton("shirt");
		Thread.sleep(2000);
		shirtPage = new ShirtPage(dr);
		Thread.sleep(1500);
		shirtPage.clickOnShirtPriceFilter();
		Thread.sleep(1500);
		filteredResultPage = new FilteredResultPage(dr); 
		Thread.sleep(1500);
		filteredResultPage.verifyFilterProducts();
		
		
		
		
		
	}
	
	
	
	
	

}
