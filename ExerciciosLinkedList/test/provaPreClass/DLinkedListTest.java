package provaPreClass;

import org.junit.Assert;
import org.junit.Test;

import p2.DLinkedList;
import p2.DNode;

public class DLinkedListTest {

	@Test
	public void removeFirstTest() {
		DLinkedList<String> linkedList = new DLinkedList<>();
		
		DNode<String> nodeA = new DNode<>("A");
		DNode<String> nodeB = new DNode<>("B");
		DNode<String> nodeC = new DNode<>("C");

		linkedList.addFirst(nodeA);
		linkedList.addFirst(nodeB);
		linkedList.addFirst(nodeC);
		
		linkedList.removeValue("A");
		
		Assert.assertTrue(linkedList.getSize() == 2);
		System.out.println(linkedList.stringFy());
		
		
	}
	
}
