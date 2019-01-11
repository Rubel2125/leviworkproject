package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProbiderMethods {
	
	
	@DataProvider(name="levisSignUp")
	public Object[][] dataFromExcelSheet() throws IOException {
		return ReadExcelFile.readExcelFile("LevisEntry.xlsx", 0);
		
	}

}
