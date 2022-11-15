package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
	 @Test(priority=3)
	 public void tc1() {
		 Reporter.log("running tc1", true);
	 }
	@Test(priority=1)
	public void tc2() {
		Reporter.log("tc2 is running", true);
	}
@Test(priority=2)
public void tc3() {
	Reporter.log("running tc3", true);
}
}
