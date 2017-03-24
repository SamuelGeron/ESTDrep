package estd;

import org.junit.Assert;
import org.junit.Test;

public class Questao4Test {
	
	@Test
	public void firstOrLast5Test() {
		
		Questao4 quest4 = new Questao4();
		int[] n = {13, 5, 1, 2, 3};
		boolean result = quest4.firstOrLast5(n);
		
		Assert.assertTrue(result == false);
		
	}

}
