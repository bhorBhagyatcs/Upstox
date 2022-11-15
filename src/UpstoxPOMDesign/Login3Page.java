package UpstoxPOMDesign;

//import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login3Page {
	WebDriver driver;
	@FindBy(xpath ="//title[text()='Upstox Pro']")private WebElement title;
	
	public Login3Page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void verifyPageTitle() {
		String expTitle="Upstox Pro";
		String act=driver.getTitle();
	
		if(expTitle.equals(act)) {
			System.out.println("TC Is Pass");
		}
		else {
			System.out.println("TC Is Fail");
		}
		
	}

}
