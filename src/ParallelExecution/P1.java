package ParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class P1 {
	@Test
	public void TC1() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(4000);
		driver.close();
	}

}
