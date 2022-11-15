package PracticeTime;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Kite_Zerodha {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		
		ChromeOptions c=new ChromeOptions();
		c.addArguments("--disable-Notifications");
				
		
		WebDriver driver=new ChromeDriver(c);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("CKM519");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Bhagya@777");
		driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("591929");
		driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
		driver.findElement(By.xpath("//span[@class='symbol']")).click();
		driver.findElement(By.xpath("//button[@class='submit']")).click();
		driver.findElement(By.xpath("//button[@class='button-outline cancel']")).click();
		String expTitle="Dashboard / Kite";
		String Acttitle=driver.getTitle();
		if(expTitle.equals(Acttitle)) {
			System.out.println("user is on homepage tc is pass");
		}
		else {
			System.out.println("tc is Fail");
		}
		
	}

}
