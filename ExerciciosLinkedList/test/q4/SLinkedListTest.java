package q4;

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
		Node<String> nodeA2 = new Node<>("A");
		Node<String> nodeB2 = new Node<>("B");
		Node<String> nodeC2 = new Node<>("C");

		linkedList2.add(nodeA2);
		linkedList2.add(nodeB2);
		linkedList2.add(nodeC2);

		boolean result = linkedList1.stringFy().equals(linkedList2.stringFy());
		Assert.assertTrue(result == true);

		
	}

}
