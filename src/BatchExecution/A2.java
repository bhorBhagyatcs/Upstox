package BatchExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class A2 {
	 @Test
	 public void tc4() {
		 Reporter.log("running tc4", true);
	 }
	@Test
	public void tc5() {
		Reporter.log("tc5 is running", true);
	}
@Test
public void tc6() {
	Reporter.log("running tc6", true);


}
}