package Assert_method;

import org.testng.Assert;
//import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNotEquals {
@Test
public void TC1() {
	String A1="Neelam";
	String A2="Bhagya";
	Assert.assertNotEquals(A1, A2);
}
}
