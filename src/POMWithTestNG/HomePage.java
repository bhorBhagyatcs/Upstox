package POMWithTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath="//div[text()='KARAN JAYRAM KADAM']")private WebElement Text;
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public String verifyText() {
		String actText=Text.getText();
		return actText;
	}

}
