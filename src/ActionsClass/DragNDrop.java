package ActionsClass;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BHAGYASHREE\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement target=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		Actions act=new Actions(driver);
		act.moveToElement(target).perform();
		List<WebElement> allElement = driver.findElements(By.xpath("//div[@id='nav-al-container']"));
		for(WebElement i: allElement) {
			String text=i.getText();
			System.out.println(text);
			
		}
		
		
	}

}
