package PracticeTime;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowserAndProductAddToCart {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BHAGYASHREE\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobile under 20000", Keys.ENTER);
		driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]")).click();
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[3]")).click();
		
		String parent=driver.getWindowHandle();
		
		Set<String> allwindow=driver.getWindowHandles();
		
		ArrayList<String> al= new ArrayList<String>(allwindow);
		String ss=al.get(2);
		for(String i : al ) {
			if(!parent.equalsIgnoreCase(i)) {
				driver.switchTo().window(ss);
			}
			
		}
	}

}
