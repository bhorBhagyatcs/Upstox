import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Opera_browser {
	public static void main(String[] args) {
		System.setProperty("webdriver.opera.driver", "C:\\Users\\BHAGYASHREE\\Downloads\\operadriver_win64\\operadriver_win64");
		WebDriver driver= new  OperaDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
}
}