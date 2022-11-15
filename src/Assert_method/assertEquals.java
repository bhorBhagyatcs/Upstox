package Assert_method;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertEquals {
@Test
public void TC1() {
	String s1= "Bhagya";
	String s2= "Bhagya";
	Assert.assertEquals(s1, s2);
	
}
}
