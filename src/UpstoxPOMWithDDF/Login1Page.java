package UpstoxPOMWithDDF;


	import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Login1Page {
		
	    @FindBy(xpath="//input[@id='userCode']")private WebElement UN;
		@FindBy(xpath="//input[@id='password']")private WebElement pwd;
		@FindBy(xpath="//button[@id='submit-btn']")private WebElement LoginBtn;
		
		public Login1Page(WebDriver driver) {
			PageFactory.initElements( driver,this);
			
		}
		public void enterUN() {
			UN.sendKeys("2QALQX");
		}
		public void enterPWD() {
			pwd.sendKeys("Pnishi@321");
		}
	    public void clickLoginBtn() {
	    	LoginBtn.click();
	    }
	}


