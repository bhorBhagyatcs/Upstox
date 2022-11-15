package Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Get_1 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\BHAGYASHREE\\Downloads\\geckodriver-v0.32.0-win64 (4)\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(4000);
	}

}
