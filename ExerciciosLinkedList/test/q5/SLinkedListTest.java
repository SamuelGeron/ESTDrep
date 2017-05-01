package q5;

import org.junit.Assert;
import org.junit.Test;

public class SLinkedListTest {

	@Test
	public void searchTest() {
		SLinkedList<String> linkedList1 = new SLinkedList<>();
		Node<String> nodeA1 = new Node<>("A");
		Node<String> nodeB1 = new Node<>("B");
		Node<String> nodeC1 = new Node<>("C");

		linkedList1.add(nodeA1);
		linkedList1.add(nodeB1);
		linkedList1.add(nodeC1);
		
		SLinkedList<String> linkedList2 = new SLinkedList<>();
		
		linkedList1.fuckinCopyIt(linkedList2);
		
		boolean result = linkedList2.stringFy().equals(linkedList1.stringFy());
		Assert.assertTrue(result == true);

		
	}

}
