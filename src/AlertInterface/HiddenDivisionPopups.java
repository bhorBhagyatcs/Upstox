package AlertInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopups {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://flipkart.com");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	driver.close();
	
	}

}
