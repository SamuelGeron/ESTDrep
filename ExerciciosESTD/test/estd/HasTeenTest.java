package estd;

import org.junit.Assert;
import org.junit.Test;

public class HasTeenTest {

	@Test
	public void hasTeen(){
		
		HasTeen hasteen = new HasTeen();
		
		boolean result = hasteen.hasTeen(13, 20, 10);
		
		Assert.assertTrue(result == true);
		
	}	
	
}
