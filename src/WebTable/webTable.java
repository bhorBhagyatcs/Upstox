package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\BHAGYASHREE\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/BHAGYASHREE/Downloads/WebTable%20by%20ANKUSH%20(1).html");
		String sn=driver.findElement(By.xpath("//table[@id='2244']//th[2]")).getText();
		System.out.println(sn);
		String city=driver.findElement(By.xpath("//table[@id='2244']//th[3]")).getText();
		System.out.println(city);
		String row1=driver.findElement(By.xpath("//table[@id='2244']//tr[1]")).getText();
		System.out.println(row1);
	}

}
