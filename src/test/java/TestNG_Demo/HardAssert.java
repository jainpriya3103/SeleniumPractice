package TestNG_Demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert
{
	@Test
	public void m1()
	{
		String exp = "Priya Jain";
		String act = "Priya";
		Assert.assertEquals(act, exp);
	}

}
