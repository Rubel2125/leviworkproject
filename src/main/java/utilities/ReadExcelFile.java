package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

	public static Object[][] readExcelFile(String path, int sheetNo) throws IOException {
	File file= new File(path);
	FileInputStream f = new FileInputStream(file);
	XSSFWorkbook w = new XSSFWorkbook(f);
	//HSSFWorkbook w = new HSSFWorkbook(f);
	XSSFSheet sheet = w.getSheetAt(sheetNo);
	// sheet.getRow(1).getCell(1).getStringCellValue();
	Object[][] datas = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

	for (int i = 1; i <= sheet.getLastRowNum(); i++) {
		for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
			XSSFCell cell = sheet.getRow(i).getCell(j);
		
			switch (cell.getCellType()) {
			case STRING: {
				System.out.println(cell.getStringCellValue());
				datas[i-1][j] = cell.getStringCellValue();
				break;
			}
			case NUMERIC: {
				System.out.println(cell.getNumericCellValue());
				datas[i-1][j] = cell.getNumericCellValue();
				break;
			}
			case BLANK:
				System.out.println("blank");
				break;

			}
		}

	}
	return datas;

}

}
