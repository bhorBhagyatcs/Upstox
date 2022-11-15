package fetchDataFromExcel;

import java.io.FileInputStream;

import java.io.IOException;


import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelDataFetching {
	public static void main(String[] args) throws Throwable, IOException {
		//create object of FileInputsream Class
		FileInputStream fis= new FileInputStream("C:\\Users\\BHAGYASHREE\\Desktop\\ExcelSheet\\sheet1.xlsx");
		//use methods to fetch excelsheet in selenium
		String data= WorkbookFactory.create(fis).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(data);
		
		
	}

}
