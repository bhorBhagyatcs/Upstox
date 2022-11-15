package POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM2Page {
	//declaration
	@FindBy(xpath="//td[text()='Enter Time-Track']")private WebElement text;
	
    //initialization
	public POM2Page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void verifyText(String vText) {
		
		String ActT=text.getText();
		if(ActT.equals(vText)) {
			System.out.println("TC is Pass");
		}
	}
}
