package allPages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

public class ProductResultsPage {
	private WebDriver dr;
	public ProductResultsPage(WebDriver dr) {
		this.dr =dr;
		PageFactory.initElements(dr, this);
	}
	
	@FindBy(xpath="//div[@id='emailModal']//button[@class='close lsco-icon lscoicon-x']")WebElement popUp;
	@FindBy(xpath="//a[@data-name='Under $50']")WebElement priceUnderFifty;
	//@FindBy(xpath="//div[@class='price ']")WebElement product;
	
	
	
	
	public void clickOnPriceFilter() {
		List<WebElement> priceFilter = dr.findElements(By.xpath("//ul[@data-facet-name='price']//li"));
		Iterator<WebElement> we=priceFilter.iterator();
		 FilteredResultPage ff= new FilteredResultPage(dr);
		while(we.hasNext())
		{
			 we.next().click();
			
			ff.verifyFilterProducts(); 
			
			
		}
		

	}
	
	
	



	
	
	
	

	
	

}
