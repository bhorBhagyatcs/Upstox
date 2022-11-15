package SoftAssert_Verify;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Remove_DisadvantageOfAssert {
	@Test
	public void TC1() {
		String S1="Bhagya";
		String S2="Neelam";
		SoftAssert s=new SoftAssert();
		s.assertEquals(S1, S2);
		Reporter.log("Hi I am after failing 1st verification",true);
		s.assertAll();
		
	}
	@Test
	public void TC2() {
		Reporter.log("Running Tc2",true);
		
	}

}
