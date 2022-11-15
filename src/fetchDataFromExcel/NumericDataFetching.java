package fetchDataFromExcel;

import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.WorkbookFactory;

public class NumericDataFetching {
	
	public static void main(String[] args) throws Throwable {
		FileInputStream fis= new FileInputStream("C:\\Users\\BHAGYASHREE\\Desktop\\ExcelSheet\\sheet1.xlsx");
		String value=WorkbookFactory.create(fis).getSheet("Sheet1").getRow(3).getCell(1).getStringCellValue();
		System.out.println(value);
	}

}
