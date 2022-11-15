package Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get1 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\BHAGYASHREE\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_4qsiujpf5j_e&adgrpid=60456322738&hvpone=&hvptwo=&hvadid=486393568006&hvpos=&hvnetw=g&hvrand=17945856944362001026&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=20462&hvtargid=kwd-360364908477&hydadcr=14451_2154369&gclid=CjwKCAjw4JWZBhApEiwAtJUN0NEVfx20q0VnTsztY6mraAB189U8qoxdsLL_1pyVShTzKFb5ydmeUBoCEMUQAvD_BwE");
		Thread.sleep(1000);
		driver.close();
		}
	

}
