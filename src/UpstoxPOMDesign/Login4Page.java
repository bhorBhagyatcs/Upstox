package UpstoxPOMDesign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login4Page {
	@FindBy(xpath="//div[text()='No, I’m good']") private WebElement text;
	
	public Login4Page(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
public void clickText() {
	text.click();
}
}
