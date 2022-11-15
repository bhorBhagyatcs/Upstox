package DataDrivenFramework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;

public class withoutDDF {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BHAGYASHREE\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin",Keys.TAB,"manager",Keys.TAB,Keys.ENTER);
		driver.findElement(By.xpath("//input[@class='taskSearchField']")).sendKeys("bhagya",Keys.ENTER);
		String expectedTitle="actiTIME - Enter Time-Track";
		String actT=driver.getTitle();
		if(expectedTitle.equals(actT)){
			System.out.println("Test case Pass");
		}
		else {
			System.out.println("Test case Fail");
			
			
		}
		
	}

}
