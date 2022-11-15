package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocation_count {
	@Test(invocationCount=10)
	public void tc1() {
		Reporter.log("running tc1",true);
	}
	

}
