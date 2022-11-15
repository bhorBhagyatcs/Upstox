package DataDrivenFramework;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithDDFramework {
	
		public static void main(String[] args) throws Throwable {
			//fetch data from excel
			FileInputStream fis=new FileInputStream("C:\\Users\\BHAGYASHREE\\Desktop\\ExcelSheet\\AptiTime.xlsx");
			Sheet sh = WorkbookFactory.create(fis).getSheet("Sheet1");
			System.setProperty("webdriver.chrome.driver","C:\\Users\\BHAGYASHREE\\Downloads\\chromedriver_win32\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    //implicit wait
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		    //delete all cookies
		    driver.manage().deleteAllCookies();
		    //maximize 
		    driver.manage().window().maximize();
		    //open the application
		    driver.get("https://demo.actitime.com/login.do");
		    //enter username
		    String UN = sh.getRow(0).getCell(0).getStringCellValue();
		    driver.findElement(By.xpath("//input[@id='username']")).sendKeys(UN);
		    //enter password
		    String pass = sh.getRow(0).getCell(1).getStringCellValue();
		    driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(pass);
		    //click on login btn
		    driver.findElement(By.xpath("//div[text()='Login ']")).click();
		    //enter something on home page
		    String data = sh.getRow(1).getCell(0).getStringCellValue();
		    driver.findElement(By.xpath("//input[@id='taskSearchControl_field']")).sendKeys(data);
		    //verify title of home page
		    String expT = sh.getRow(0).getCell(2).getStringCellValue();
		    String actT = driver.getTitle();
		    if(expT.equals(actT)) {
		    	System.out.println("TC is pass");
		    }
		    else {
		    	System.out.println("TC is fail");
	}

		}}
