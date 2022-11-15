import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_nxqtetlae_e&adgrpid=60571832564&hvpone=&hvptwo=&hvadid=486387378181&hvpos=&hvnetw=g&hvrand=1769687625137674068&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=20462&hvtargid=kwd-296458789801&hydadcr=14452_2154371&gclid=CjwKCAjwyaWZBhBGEiwACslQoztuaUzVtkycUVcauNUo8kUycHOnHxkCPLRqsWRj8KUEp13CDIDdGBoCp-IQAvD_BwE");
	      driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
	      driver.findElement(By.xpath("//input[@id=\"ap_email\"]")).sendKeys("bhor.bhagya777@gmail.com");
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//span[@id=\"continue\"']")).click();
	}

}