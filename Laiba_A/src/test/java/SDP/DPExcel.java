package SDP;
	
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DPExcel {

	@DataProvider(name="logindata")
	public String[][] logindata() throws IOException {
	File file = new File("D:\\Ticket\\Selenium.xls");
	FileInputStream fis = new FileInputStream(file);
	HSSFWorkbook workbook = new HSSFWorkbook(fis);
	HSSFSheet  sheet = workbook.getSheet("TestSheet");
	int noOfRows = sheet.getPhysicalNumberOfRows();
	int noOfColumns=sheet.getRow(0).getLastCellNum();

	String[][] data=new String[noOfRows-1][noOfColumns];
	for(int i=0; i <noOfRows-1; i++ ) {
	for(int j=0; j <noOfColumns; j++ ) {
	DataFormatter df=new DataFormatter();
	data[i][j]= df.formatCellValue(sheet.getRow(i+1).getCell(j));
	}
	}

	workbook.close();
	fis.close();
	return data;
	}
}
