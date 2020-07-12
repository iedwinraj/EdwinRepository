package ItestListenerConcept;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ItestListenerConcept.Listener.class)  

public class class1 {

	@Test
	public void sum() {
		int sum = 0;
		int a = 5;
		int b = 7;
		sum = a + b;
		System.out.println(sum);
		//Assert.assertEquals(sum, 20);
	}

	@Test
	public void testtofail() {
		System.out.println("Test case has been failed");
		Assert.assertTrue(false);
	}

}
