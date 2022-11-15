package Assert_method;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_Fail {
	@Test
	public void TC1() {
		Reporter.log("Running TC1",true);
		Assert.fail();
		
	}
	@Test
	public void TC2() {
		Reporter.log("Running TC2",true);
}
}