package inFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchingframe {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BHAGYASHREE\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
	driver.manage().window().maximize();
	//handle 1st frame
	driver.switchTo().frame("packageListFrame");
	//handle element present on 1st frame
	String text1=driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).getText();
	System.out.println(text1);
	//switch to main webpage
	driver.switchTo().defaultContent();
	//handle 2nd  frame
	driver.switchTo().frame("packageFrame");
	//handle elements of frame2
	String text2=driver.findElement(By.xpath("//a[text()='AbstractWebDriverEventListener']")).getText();
	System.out.println(text2);
	//switch main webpage
	driver.switchTo().defaultContent();
	//handle 3rd frame
	driver.switchTo().frame("classFrame");
	//handle elements present on 3rd frame
	Thread.sleep(3000);
	String text3 =driver.findElement(By.xpath("//span[text()='Interface Summary']")).getText();
	
	System.out.println(text3);
	
	}

}
