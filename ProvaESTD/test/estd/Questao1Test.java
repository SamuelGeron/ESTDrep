package estd;

import org.junit.Assert;
import org.junit.Test;

public class Questao1Test {
	
	@Test
	public void sequence22Test() {
		Questao1 quest1 = new Questao1();
		int[] n = {3,5,6,2,2,5};

		boolean result = quest1.sequence22(n);
		
		Assert.assertTrue(result == true);
		
	}

}
