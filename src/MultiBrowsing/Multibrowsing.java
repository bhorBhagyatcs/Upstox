package MultiBrowsing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//import com.beust.jcommander.Parameter;

public class Multibrowsing {
	@Parameters("browsername")//annotation
	@Test
	public void TC(String browsername) {//paramerized method
			WebDriver driver=null;//runtime polymorphism
		
			if(browsername.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\BHAGYASHREE\\\\Downloads\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
		 driver=new ChromeDriver();
		
	}
			else if(browsername.equals("firefox")) {
				System.setProperty("webdriver.gecko.driver","C:\\Users\\BHAGYASHREE\\Downloads\\geckodriver-v0.32.0-win64 (4)\\geckodriver.exe");
				 driver=new FirefoxDriver();
				
			}
			driver.get("https://www.flipkart.com/");//globally
			
	}

}
