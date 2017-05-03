package provaPreClass;

import p2.DNode;

public class DLinkedList<T> {

	private DNode<T> first;

	private DNode<T> last;

	private long size = 0;
	
	public String stringFy(){
		
		String stringNode = "";
		DNode<T> aux = this.getFirst();
		
		while (aux != null) {
			stringNode = stringNode + aux.getValue();
			aux = aux.getNext();
		}
		
		return stringNode;
	}
	
	public long getSize() {
		return size;
	}
	
	public void removeFirst() {
		if(!isEmpty()) {
			first = first.getNext();
			size--;
			if(isEmpty()) {
				last = null;
			}
		}
	}
	
	public void removeValue(T valueToRemove){
		
		DNode<T> aux = this.getFirst();
		
		while (aux != null) {
			if(aux.getValue().equals(valueToRemove)){
				if(aux.getPrev() == null && aux.getNext() == null){
					aux = null;
					size--;
				}else if(aux.getPrev() == null && aux.getNext() != null){
					aux.getNext().setPrev(null);
					size--;
				}else if(aux.getPrev() != null && aux.getNext() == null){
					aux.getPrev().setNext(null);
					size--;
				}else{
					aux.getNext().setPrev(aux.getPrev());
					aux.getPrev().setNext(aux.getNext());
					size--;
				}
				return;
			}
			aux = aux.getNext();
		}
		
	}
	
	public void addFirst(DNode<T> dnode) {
		if (isEmpty()) {
			first = dnode;
			last = dnode;
		} else {
			first.setPrev(dnode);
			dnode.setNext(first);
			first = dnode;
		}
		size++;
	}
	
	public void addLast(DNode<T> dnode) {
		if (isEmpty()) {
			first = dnode;
			last = dnode;
		} else {
			last.setNext(dnode);
			dnode.setPrev(last);
			last = dnode;
		}
		size++;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}

	public DNode<T> getFirst() {
		return first;
	}

	public DNode<T> getLast() {
		return last;
	}

}
