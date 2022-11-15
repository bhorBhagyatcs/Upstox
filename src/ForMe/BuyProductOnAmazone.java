package ForMe;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BuyProductOnAmazone {
	public static void main(String[] args) throws AWTException, Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles under 20000", Keys.ENTER);
		driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
		driver.findElement(By.xpath("(//div[@class='a-section a-spacing-none puis-padding-right-small s-title-instructions-style'])[4]")).click();
		driver.findElement(By.xpath("(//div[@class='a-section a-spacing-none puis-padding-right-small s-title-instructions-style'])[5]")).click();
		String Parent=driver.getWindowHandle();
		Set<String> getallwindow=driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String> (getallwindow);
		String ss=al.get(1);
		for(String kk:al) {
			if(!Parent.equalsIgnoreCase(kk)){
				driver.switchTo().window(ss);
				
			}
			
		}
		/*Iterator<String> iterator=gtallwindow.iterator();
		String parentwin=iterator.next();
		String childwin=iterator.next();
		driver.switchTo().window(childwin);*/
				
		driver.findElement(By.xpath("//input[@id='buy-now-button']")).click();
		
		
		
	}
	

}
