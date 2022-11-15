package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Timeouts {
	@Test(timeOut=8000)
	
	 public void tc1() {
		 Reporter.log("running tc1", true);
	 }

}
