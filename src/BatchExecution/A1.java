package BatchExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class A1 {
	 @Test
	 public void tc1() {
		 Reporter.log("running tc1", true);
	 }
	@Test
	public void tc2() {
		Reporter.log("tc2 is running", true);
	}
@Test
public void tc3() {
	Reporter.log("running tc3", true);

}
}