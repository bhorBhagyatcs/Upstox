package AlertInterface;


	

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class alertpopup2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\BHAGYASHREE\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://demo.guru99.com/test/delete_customer.php");
	    //enter customer id
	    driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("123456",Keys.ENTER);
	    //use alert interface
	    Alert alt = driver.switchTo().alert();
	    //I want to click on ok button
	   alt.accept();//automatically ok button will be clicked
	    
	    //click on cancel button
	    //alt.dismiss();
	    
	    
	    //get the text on popup
	    String text = alt.getText();
	    System.out.println(text);
	}
	}


