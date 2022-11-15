package Popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BHAGYASHREE\\Downloads\\chromedriver_win32\\chromedriver.exe");
	// create object of browser setting class
		ChromeOptions c= new ChromeOptions();
		//close popup
	    c.addArguments("--disable-notifications");
		c.addArguments("start-maximized");
		//open the browser
		WebDriver driver = new ChromeDriver(c);
		driver.get("https://www.hdfcbank.com/");
		
	
	
	}

}