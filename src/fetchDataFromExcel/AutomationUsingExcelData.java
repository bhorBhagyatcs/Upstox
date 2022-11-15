package fetchDataFromExcel;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class AutomationUsingExcelData {
	public static void main(String[] args) throws Throwable {
		

		

		
				System.setProperty("webdriver.chrome.driver","E:\\Velocity Software Testing\\Auto\\Javafirstprogram\\src\\Browers\\chromedriver.exe");
			    WebDriver driver=new ChromeDriver();
			    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50000));
			    driver.get("https://www.instagram.com/");
			    
			    FileInputStream file=new FileInputStream("E:\\Velocity Software Testing\\Auto\\12-10-2022\\DataSample.xlsx");
			    XSSFWorkbook workbook =new XSSFWorkbook(file);
			    XSSFSheet Sheet = workbook.getSheet("Sheet1");
			    int rowcount=Sheet.getLastRowNum();
			    int cellcount=Sheet.getRow(1).getLastCellNum();
			    System.out.println("rowcount :"+rowcount+" cellcount: "+cellcount);
			    for (int i=1; i<=rowcount;i++) {
			    	XSSFRow celldata = Sheet.getRow(i);
			    	
			    	String mail = celldata.getCell(0).getStringCellValue();
			    	String pwd = celldata.getCell(1).getStringCellValue();
			    	
			    	driver.findElement(By.cssSelector("input[name='username']")).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			    	driver.findElement(By.cssSelector("input[name='username']")).sendKeys(mail);
			    	
			    	
			    	driver.findElement(By.cssSelector("input[name='password']")).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			    	driver.findElement(By.cssSelector("input[name='password']")).sendKeys(pwd);
			    	driver.findElement(By.xpath("//div[text()='Log In']")).click();
			    	
			    	
			    	
			    	
			    	
			    	System.out.println(i+"."+mail+" || "+pwd);
			    	
			    	
			    }
			    driver.findElement(By.xpath("//button[text()='Not Now']")).click();
			}

		
	}


