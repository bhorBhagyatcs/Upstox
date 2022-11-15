package UpstoxPOMDesign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login2Page {
	@FindBy(xpath="//input[@id='yob']")private WebElement PIN;
	
	public Login2Page(WebDriver driver) {
		PageFactory.initElements( driver,this);
		
	}
	public void enterPIN() {
		PIN.sendKeys("1995");
	}

}
