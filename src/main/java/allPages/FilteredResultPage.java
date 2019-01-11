package allPages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class FilteredResultPage {
	private WebDriver dr;
	
	public FilteredResultPage(WebDriver dr) {
		this.dr =dr;
		PageFactory.initElements(dr, this);
	}
	

	
	
	public void verifyFilterProducts() {
		
		List<WebElement> list2 = dr.findElements(By.xpath("//div[@class='price ']//span[@class='hard-sale']"));
		ArrayList<String> page = new ArrayList<String>();
		
		List<WebElement> list =dr.findElements(By.xpath("//div[@class='price ']//span[@class='regular sale-price']"));
		
		
		for(WebElement product:list) {
			list =dr.findElements(By.xpath("//div[@class='price ']//span[@class='regular sale-price']"));
			String p =product.getText();
			 System.out.println(p);
			 p =p.replace("$", "");
			 
			 double k=Double.parseDouble(p);
			 if(k<=50.00) {
				 System.out.println("Filter is working properly");
			 }
			 else {
				 System.out.println("Filter is not working properly");
				 break;
			 }
			 System.out.println("test case failed");
			 dr.navigate().back();
		}
		
		
		
		
	}
	

}
