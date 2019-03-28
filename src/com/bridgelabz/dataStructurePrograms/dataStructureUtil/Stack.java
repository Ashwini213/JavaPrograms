/**
 * 
 */
package com.bridgelabz.dataStructurePrograms.dataStructureUtil;

/**
 * @author all
 *
 */
public class Stack<T> {
	private int stackSize;
	private T[] stackArr;
	private int top;

	public void push(T entry) {

		System.out.println("Adding: " + entry);
		this.stackArr[++top] = entry;
	}

	public void pop() {
		T entry = this.stackArr[top--];
		System.out.println("Removed entry: " + entry);
	}

	public T peek() {
		return stackArr[top];
	}

	public boolean isStackEmpty() {
		return (top == -1);
	}

	public boolean isStackFull() {
		return (top == stackSize - 1);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
