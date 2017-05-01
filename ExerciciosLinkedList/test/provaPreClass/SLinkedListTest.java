package provaPreClass;

import org.junit.Assert;
import org.junit.Test;

public class SLinkedListTest {

	@Test
	public void searchTest() {
		SLinkedList<Integer> linkedList = new SLinkedList<>();
		int[] arrayList = {1,4,5,6,8,9};
		
		linkedList  = SLinkedList.arrayToLinkedList(arrayList);
		long result = linkedList.getSize();
		Assert.assertTrue(result==3);
		
		System.out.println(linkedList.stringFy());
		
	}
	

}
