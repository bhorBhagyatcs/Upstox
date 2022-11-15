package POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_PageFactory_WithDDF_page {
	@FindBy(id="username")private  WebElement UN;
	@FindBy(name="pwd")private WebElement PWD;
	@FindBy(id="loginButton")private WebElement login1;
	
	public POM_PageFactory_WithDDF_page(WebDriver Driver) {
		PageFactory.initElements(Driver,this);
		
		
	}
	public void enterUN(String UName) {
		UN.sendKeys(UName);
	}
	public void enterPWD(String password) {
		PWD.sendKeys(password);
	}
	
	public void loginB() {
		login1.click();
	}
}
