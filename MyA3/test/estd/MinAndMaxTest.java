package estd;

import org.junit.Assert;
import org.junit.Test;

public class MinAndMaxTest {
	@Test
	public void minAndMax(){
	
	MinAndMax minAndMax = new MinAndMax();
	int[] i = {3,5,8,9,4};
	
	int resultado = minAndMax.bigDiff(i);
	
	Assert.assertTrue(resultado == 4);
	}
}
