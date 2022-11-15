package POMWithTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login2Page {
	@FindBy(xpath="//input[@id='yob']")private WebElement DOB;
	
	public Login2Page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	
	}

      public void enterDOB(String OTP) {
	   DOB.sendKeys(OTP);
	
}

}