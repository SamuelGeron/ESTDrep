package estd;

import org.junit.Test;

import org.junit.Assert;

public class EvenTest {
	
	@Test
	public void countEvenTest(){
		
		Even even = new Even();
		int[] nums = {5,4,6,8,4,1,9};
		
		int resultado = even.countEvens(nums);
		
		Assert.assertTrue(resultado == 4);
		
	}

}
