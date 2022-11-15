package Popups;

import java.util.ArrayList;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopups {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BHAGYASHREE\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		//driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(3000);
		//handle search field to find mobiles under 20000
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobiles under 20000",Keys.ENTER);
		//to select 1st mobile
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='_4rR01T']")).click();
		//by default access is on main window to take access on all windows
		Set<String> allwindow=driver.getWindowHandles();
		Thread.sleep(3000);
		//to store all session id in order we use array list
		ArrayList<String> al= new ArrayList<String>(allwindow); //0-parent 1-child
	    Thread.sleep(3000);
		String main=al.get(0);
		System.out.println(main);
		String child=al.get(1);
		System.out.println(child);
	}

}
