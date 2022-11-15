package Popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleChildWindow {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		//driver.manage().window().maximize();
		//close hidden vision popup
		  driver.findElement(By.xpath("//button[text()='✕']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobiles under 20000",Keys.ENTER);
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//div[@class='_4rR01T']")).click();
		  Thread.sleep(3000);
		  Set<String> allwindow=driver.getWindowHandles();
		  ArrayList<String> al= new ArrayList<String>(allwindow);
		  String main=al.get(0);
		  System.out.println(main);
	}

}
