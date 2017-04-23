package estd;

import org.junit.Assert;
import org.junit.Test;

public class SorterTest {

	@Test
	public void sortTest() {
		Sorter sorter = new Sorter();
		int[] n = { 3, 2, 5, 1 };
		sorter.sort(n);
		int[] expected = { 1, 2, 3, 5 };
		Assert.assertArrayEquals(expected, n);
	}

}
