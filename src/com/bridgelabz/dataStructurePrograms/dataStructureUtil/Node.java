package com.bridgelabz.dataStructurePrograms.dataStructureUtil;

public class Node<T> implements Comparable<T> {

	public T value;
	public Node<T> nextRef;
	public T key;
	public int size = 0;

	public T getValue() {
		return value;
	}

	public void setValue(T key) {
		this.value = key;
	}

	public Node<T> getNextRef() {
		return nextRef;
	}

	public void setNextRef(Node<T> ref) {
		this.nextRef = ref;
	}

	public Node<T> getSize() {
		return this.getSize();
	}

	public void setSize(Node<T> size) {
		this.nextRef = size;
	}

	@Override
	public int compareTo(T o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Node() {

	}

	public Node(T data, Node<T> next) {
		this.value = data;
		this.nextRef = next;
	}

}