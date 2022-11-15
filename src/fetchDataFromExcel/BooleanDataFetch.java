package fetchDataFromExcel;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class BooleanDataFetch {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\BHAGYASHREE\\Desktop\\ExcelSheet\\sheet1.xlsx");
		boolean b=WorkbookFactory.create(fis).getSheet("Sheet1").getRow(0).getCell(1).getBooleanCellValue();
		System.out.println(b);
	}

}
