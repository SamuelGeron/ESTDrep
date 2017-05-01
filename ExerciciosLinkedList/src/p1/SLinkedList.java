package p1;

import q1.Node;


public class SLinkedList<T> {

	private Node<T> first;

	private Node<T> last;

	private long size = 0;

	public long getSize() {
		return size;
	}
	
	public static SLinkedList<Integer> arrayToLinkedList(int[] arrayToReceive){
		SLinkedList<Integer> result = new SLinkedList<>();
		for(int i=0; i<arrayToReceive.length; i++){
			Node<Integer> node = new Node<>(arrayToReceive[i]);
			if(arrayToReceive[i] % 2 == 0){
				result.add(node);
			}
		}
		return result;
	}
	
	public Node<T> search(T value) {
		Node<T> aux = this.getFirst();
		while (aux != null) {
			if(aux.getValue().equals(value)) {
				return aux;
			}
			aux = aux.getNext();
		}
		
		return null;
	}
	
	public void removeFirst() {
		if (!isEmpty()) {
			first = first.getNext();
			size--;
			if (isEmpty()) {
				last = null;
			}
		}
	}

	public void add(Node<T> node) {
		if (isEmpty()) {
			first = node;
			last = node;
		} else {
			last.setNext(node);
			last = node;
		}
		size++;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public Node<T> getFirst() {
		return first;
	}

	public Node<T> getLast() {
		return last;
	}

}
