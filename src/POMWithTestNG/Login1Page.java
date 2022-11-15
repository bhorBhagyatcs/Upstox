package POMWithTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login1Page {
@FindBy(xpath = "//input[@id='userCode']")private WebElement UN;
@FindBy(xpath="//input[@id='password']")private WebElement PWD;
@FindBy(xpath="//button[@id='submit-btn']")private WebElement LoginBtn;

public Login1Page(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public void enterUN(String Username) {
	UN.sendKeys(Username);
}
public void enterPWD(String Password) {
	PWD.sendKeys(Password);
}
public void clickLoginBtn() {

LoginBtn.click();
}
}