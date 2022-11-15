package POMClass;

//import javax.management.loading.PrivateClassLoader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actitime {
	@FindBy(id="username")private  WebElement UN;
	@FindBy(name="pwd")private WebElement PWD;
	@FindBy(id="loginButton")private WebElement login;
	
	public Actitime(WebDriver Driver) {
		PageFactory.initElements(Driver,this);
		
		
	}
	public void enterUN() {
		UN.sendKeys("admin");
	}
	public void enterPWD() {
		PWD.sendKeys("manager");
	}
	
	public void loginB() {
		login.click();
	}

}
