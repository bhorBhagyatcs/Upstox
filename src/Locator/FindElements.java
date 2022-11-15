package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	//enter username
	driver.findElement(By.cssSelector("input[id=\"username\"]")).sendKeys("admin");
	//enter password
	driver.findElement(By.cssSelector("input[name=\"pwd\"]")).sendKeys("manager");
	}

}
