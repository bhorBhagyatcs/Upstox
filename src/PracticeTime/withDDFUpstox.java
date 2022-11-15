package PracticeTime;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class withDDFUpstox {
	public static void main(String[] args ) throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\BHAGYASHREE\\Downloads\\upstox.xlsx");
		 Sheet sh = WorkbookFactory.create(fis).getSheet("Sheet1");
		 String UN = sh.getRow(0).getCell(0).getStringCellValue();
		 String PWD = sh.getRow(0).getCell(1).getStringCellValue();
		 String DOB = sh.getRow(0).getCell(2).getStringCellValue();
		 String ExpTitle = sh.getRow(0).getCell(3).getStringCellValue();
			
		
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\BHAGYASHREE\\\\Downloads\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://login-v2.upstox.com/");
		driver.findElement(By.xpath("//input[@id=\"userCode\"]")).sendKeys(UN);
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys(PWD);
		driver.findElement(By.xpath("//div[text()='Sign into Upstox']")).click();
		driver.findElement(By.xpath("//input[@id=\"yob\"]")).sendKeys(DOB);
		driver.findElement(By.xpath("//div[text()='No, I’m good']")).click();
		
		String actTitle=driver.getTitle();
		
		if(actTitle.equals(ExpTitle)) {
			System.out.println("Title match TC is pass");
			
		}
		else {
			System.out.println("tc is pass");
		}
	}	
	}


