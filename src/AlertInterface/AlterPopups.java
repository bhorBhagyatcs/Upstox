package AlertInterface;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlterPopups {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("12345",Keys.ENTER);
		
		//switch main webpage to alert popup
		Alert alt=driver.switchTo().alert();
		//click on ok button
		alt.accept();
		//click on cancel button
		//alt.dismiss();
		//to get text present on popups
		//String s=alt.getText();
		//System.out.println(s);
		
		
	}

}
