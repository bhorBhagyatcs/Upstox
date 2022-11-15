package PracticeTime;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class with_DDF_kite_Zerodha {
	public static void main(String[] args) throws Throwable, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\BHAGYASHREE\\\\Downloads\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
	ChromeOptions c= new ChromeOptions();
	c.addArguments("--disables-Notifications");
	WebDriver driver=new ChromeDriver(c);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://kite.zerodha.com/");
	FileInputStream fis=new FileInputStream("C:\\Users\\BHAGYASHREE\\Desktop\\ExcelSheet\\KiteZerodha.xlsx");
	WorkbookFactory.create(fis).getSheet("Sheet1");
	
	
			
	}

}
