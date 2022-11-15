package POMWithTestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



import WebTable.webTable;

public class TestClass {
	Sheet sh;
	Login1Page l1;
	Login2Page l2;
	HomePage hp;
	@BeforeClass
	public void openBrowser() throws Throwable {
	FileInputStream fis=new FileInputStream("C:\\Users\\BHAGYASHREE\\Desktop\\ExcelSheet\\TestNgPOM.xlsx");
	 sh=WorkbookFactory.create(fis).getSheet("Sheet1");
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\BHAGYASHREE\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
      driver.manage().deleteAllCookies();
      driver.get("https://login-v2.upstox.com/?client_id=DCS-TYasnEfnL5ydgqK3I9AL478Q&redirect_uri=https://developer.upstox.com/auth");
       l1= new Login1Page(driver);
       l2= new Login2Page(driver);
       hp= new HomePage(driver);
      
	}
      @BeforeMethod
      public void openApplication() {
    	  String Username=sh.getRow(0).getCell(0).getStringCellValue();
    	  l1.enterUN(Username);
    	  
    	  String Password=sh.getRow(0).getCell(1).getStringCellValue();
    	  l1.enterPWD(Password);
    	  
    	  l1.clickLoginBtn();
    	  
    	 String OTP=sh.getRow(0).getCell(2).getStringCellValue();
    	 l2.enterDOB(OTP);
       }
      
      @Test
      public void verifyText() {
    	  Reporter.log("Running Tc",true);
    	  String expText=sh.getRow(0).getCell(3).getStringCellValue();
    	  String actText=hp.verifyText();
    	  Assert.assertEquals(expText,actText);
      }
      
      
     
}
