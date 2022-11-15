package DynamicElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazoneDynamicElement {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\BHAGYASHREE\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles under 20000",Keys.ENTER);
		String price=driver.findElement(By.xpath("(//span[@class='a-price-whole'])[3]")).getText();
		System.out.println(price);
		String ratings=driver.findElement(By.xpath("(//div[@class='a-row a-size-small'])[1]")).getText();
		System.out.println(ratings);
	}

}
