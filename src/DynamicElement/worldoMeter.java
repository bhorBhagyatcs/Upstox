package DynamicElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class worldoMeter {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.worldometers.info/coronavirus/country/india/");
		//get coronavirus cases
		String CovidCase=driver.findElement(By.xpath("//Div[@id='maincounter-wrap'][1]")).getText();
		System.out.println(CovidCase);
		String death=driver.findElement(By.xpath("//Div[@id='maincounter-wrap'][2]")).getText();
		System.out.println(death);
		String recovered=driver.findElement(By.xpath("//Div[@id='maincounter-wrap'][3]")).getText();
		System.out.println(recovered);
	}

}
