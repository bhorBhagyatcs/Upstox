package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithAtributesnText {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
 //enter username using xpath attribute
	driver.findElement(By.xpath("//input[@id='username'")).sendKeys("admin");
	//enter password
	driver.findElement(By.xpath("//input[@name='pwd'")).sendKeys("manager");
	//find elements using xpath text
	driver.findElement(By.xpath("//div[text()='Login'")).click();
}
}