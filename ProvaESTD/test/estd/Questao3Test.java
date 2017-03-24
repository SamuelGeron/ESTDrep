package estd;

import org.junit.Assert;
import org.junit.Test;

public class Questao3Test {
	
	@Test
	public void sum2equals8Test() {
		Questao3 quest3 = new Questao3();
		int[] n = {3,5,2,2,2,2};

		boolean result = quest3.sum2equals8(n);
		
		Assert.assertTrue(result == true);
		
	}
	
}
