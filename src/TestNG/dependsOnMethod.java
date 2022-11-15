package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependsOnMethod {
	@Test
	public void Login() {
		Reporter.log("Login tc is running", true );
	}
      
	@Test(dependsOnMethods= "Login")
          public void logout() {
Reporter.log("logout tc is running",true);
}

}
