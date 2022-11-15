package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled {
	@Test(enabled=false)
	public void Login() {
		Reporter.log("Login tc is running", true );
	}
@Test
public void logout() {
Reporter.log("logout tc is running",true);
}

}
