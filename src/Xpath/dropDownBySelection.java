package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDownBySelection { //for date Drop Down
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BHAGYASHREE\\Downloads\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804944%7Cb%7Cfacebook%20%27%7C&placement=&creative=550525804944&keyword=facebook%20%27&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-327195741349%26loc_physical_ms%3D20462%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMI_oSxx6Sl-gIVcNdMAh1WrQsiEAAYASAAEgKnMPD_BwE");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//select[@id='day']")).click();
	     WebElement Date=driver.findElement(By.xpath("//select[@id='day']"));
	     Select s=new Select(Date);
	     Thread.sleep(2000);
	     //s.selectByVisibleText("1");
	     //s.selectByValue("7");
	     s.selectByIndex(5);
	}

}
