/**
 * 
 */
package com.bridgelabz.dataStructurePrograms.dataStructureUtil;

public class StackLinkedList<T> {

	private Node<T> top;

	private int size;

	public StackLinkedList() {
		top = null;
		size = 0;
	}

	/**
	 * Function to check if the stack is empty or not
	 *
	 * @return true if empty else false
	 */
	public boolean isEmpty() {
		return top == null;
	}

	/**
	 * Function to get the size of the stack
	 *
	 * @return size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * Function to push the specified element in the stack
	 *
	 * @param data
	 *            the element to be pushed into the stack
	 */
	public void push(T data) {
		Node<T> tnode = new Node<T>(data, null);
		if (top == null)
			top = tnode;
		else {
			tnode.setNextRef(top);
			top = tnode;
		}
		size++;
	}

	/**
	 * Function to pop the element from stack
	 *
	 * @return the deleted element
	 */
	public T pop() {
		if (isEmpty()) {
			System.out.println("No elements");
			return null;
		}
		Node<T> tnode = top;
		top = tnode.getNextRef();
		size--;
		return tnode.getValue();
	}
}