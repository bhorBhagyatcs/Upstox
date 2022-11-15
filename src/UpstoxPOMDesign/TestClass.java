package UpstoxPOMDesign;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BHAGYASHREE\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://login-v2.upstox.com/");
		Login1page login1=new Login1page(driver);
		login1.enterUN();
		login1.enterPWD();
		login1.clickLoginBtn();
		
		
		Login2Page login2=new Login2Page(driver);
		login2.enterPIN();
		
		
		Login4Page login4=new Login4Page(driver);
		login4.clickText();
		

		String expTitle="Upstox Pro";
		String actTitle=driver.getTitle();
		
		if (actTitle.equals(expTitle)) {
			System.out.println("TC is pass");
			
		}
		else {
			
			System.out.println("tc is fail");
		}
		
	 driver.close();
	}
		
		
	}

