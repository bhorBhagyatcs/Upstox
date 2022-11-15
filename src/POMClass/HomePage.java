package POMClass;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\BHAGYASHREE\\Desktop\\ExcelSheet\\NewPOMActitime.xlsx");
		Sheet sh=WorkbookFactory.create(fis).getSheet("Sheet1");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BHAGYASHREE\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		POM_PageFactory_WithDDF_page P1=new POM_PageFactory_WithDDF_page(driver);
		String UName=sh.getRow(0).getCell(0).getStringCellValue();
		P1.enterUN(UName);
		
		String password=sh.getRow(0).getCell(1).getStringCellValue();
		P1.enterPWD(password);
		
		
		P1.loginB();
		
	
	
	//create object of POM2Page
	
	String vText=sh.getRow(0).getCell(2).getStringCellValue();
	     POM2Page P2=new POM2Page(driver);
	     P2.verifyText(vText);
	
	  
	
	}
}
