package Methods;




import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximum {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_6b31gegj9g_e&adgrpid=60612964962&hvpone=&hvptwo=&hvadid=486380734071&hvpos=&hvnetw=g&hvrand=10852303237507453645&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=20462&hvtargid=kwd-49491430&hydadcr=14454_2154375&gclid=Cj0KCQjwmouZBhDSARIsALYcoups-kFCVYssl8xsG8222ZKfjOZlQWdv8Lcxjn-MUIEqbSmtb0il4hAaAjoXEALw_wcB");
		/*Thread.sleep(2000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.close();*/
		//to maximize the browser
		//driver.manage().window().maximize();
		//setSize- used to change size of browser
       Dimension d= new Dimension(200,100);
       driver.manage().window().setSize(d);
		//setPosition- used to change position of browser
		Point p= new Point(100,50);
		driver.manage().window().setPosition(p);
	}

}
