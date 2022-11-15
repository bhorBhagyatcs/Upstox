import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpDownArrowAutomation {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BHAGYASHREE\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/b/?_encoding=UTF8&node=16225007011&pf_rd_r=2FEXSCTYAEK9TSDD8SAS&pf_rd_p=5d1979c4-26e6-453f-8020-c55e2744810c&pd_rd_r=71fec3ec-bf20-4ed0-ba22-8c86ec48b09c&pd_rd_w=K0fFv&pd_rd_wg=uEIjY&ref_=pd_gw_unk");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
	    //scroll down
	    jse.executeScript("window.scrollBy(0,2000);");
	    //scroll up
	    Thread.sleep(5000);
	    jse.executeScript("window.scrollBy(0,-1000);");  
	
	}

}
