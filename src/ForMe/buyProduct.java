package ForMe;


	

	import java.time.Duration;
	import java.util.ArrayList;
	import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


	public class buyProduct {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new  ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.amazon.in/");
	        driver.manage().window().maximize();
	        String parent= driver.getWindowHandle();
	        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone 14 max pro 256 gb",Keys.ENTER);
	        driver.findElement(By.xpath("//span[text()='Apple iPhone 13 Pro Max (256GB) - Graphite']")).click();
	        Set<String> SessionId= driver.getWindowHandles();
	        ArrayList<String> id=new ArrayList<String>(SessionId);
	       for(String kk: id) {
	        	if(!parent.equalsIgnoreCase(kk)) {
	        		driver.switchTo().window(kk);
	        		//driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	        		driver.findElement(By.xpath("//input[@id='buy-now-button']")).click();
	        	}
	        }
	        
	        
	        
		}

	}


