package allPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ShirtPage {
	private WebDriver dr;
	public ShirtPage(WebDriver dr) {
		this.dr =dr;
		PageFactory.initElements(dr, this);
	}
	
	ProductResultsPage productResultsPage;
	
	public void clickOnShirtPriceFilter() {
		productResultsPage = new ProductResultsPage(dr);
		productResultsPage.clickOnPriceFilter();
	}

}
