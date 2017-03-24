package estd;

import org.junit.Assert;
import org.junit.Test;

public class Questao2Test {
	
	@Test
	public void takeOutXTest() {
		
		Questao2 quest2 = new Questao2();
		String s = "xxrrfvxx";
		String result = quest2.takeOutX(s);
		System.out.println(result);
		Assert.assertTrue(result.equals("rrfv"));
		
	}

}
