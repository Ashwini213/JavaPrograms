package com.bridgelabz.dataStructurePrograms;

class Node<T> implements Comparable<T> {

	private T value;
	private Node<T> nextRef;
	private Node<T> setPrev;
	private Node<T> ref;
	private Node<T> Prev;

	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public Node<T> getNextRef() {
		return nextRef;
	}
	public void setNextRef(Node<T> ref) {
		this.nextRef = ref;
	}
	@Override
	public int compareTo(T arg) {
		if(arg == this.value){
			return 0;
		} else {
			return 1;
		}
	}
	public int getData() {
		// TODO Auto-generated method stub
		return 0;
	}
	public void setPrev(Node<T> nd) {
		this.setPrev =ref;
	}
	public Node<T> getPrev() {
		// TODO Auto-generated method stub
		return Prev;
	}
	
}

