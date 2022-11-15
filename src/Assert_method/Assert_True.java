package Assert_method;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_True {
	@Test
	public void TC1() {
		Reporter.log("Running TC1,true");
		boolean A1= true;
		Assert.assertTrue(A1);
	}

}
