/**
 * 
 */
package com.bridgelabz.dataStructurePrograms.dataStructureUtil;

/**
 * @author all
 *
 */

public class CustomLinkedList<T> {
	private Node<T> head;
	private Node<T> tail;
	private int count = 0;
	static String[] str = new String[100];

	public boolean isEmpty() {
		return head == null;
	}

	public String addElement(T element) {
		Node<T> nd = new Node<T>();
		nd.setValue(element);
		count++;

		/**
		 * check if the list is empty
		 */
		if (isEmpty()) {
			// since there is only one element, both head and
			// tail points to the same object.
			head = nd;
			tail = nd;
		} else {
			// set current tail next link to new node
			tail.setNextRef(nd);
			// set tail as newly created node
			tail = nd;
		}
		return null;
	}

	public void deleteAfter(T key) {

		Node<T> tmp = head;
		Node<T> refNode = null;
		System.out.println("Traversing to all nodes..");
		/**
		 * Traverse till given element
		 */
		while (true) {
			if (tmp == null) {
				break;
			}
			if (tmp.compareTo(key) == 0) {
				// found the target node, add after this node
				refNode = tmp;
				break;
			}
			tmp = tmp.getNextRef();
		}
		if (refNode != null) {
			tmp = refNode.getNextRef();
			refNode.setNextRef(tmp.getNextRef());
			if (refNode.getNextRef() == null) {
				tail = refNode;
			}
			System.out.println("Deleted: " + tmp.getValue());
			count--;
		} else {
			System.out.println("Unable to find the given element...");
		}
	}

	public void traverse() {

		Node<T> tmp = head;
		while (true) {
			if (tmp == null) {
				break;
			}
			System.out.println(tmp.getValue());
			tmp = tmp.getNextRef();
		}

	}

	public void get() {

		Node<T> tmp = head;
		int k = 0;
		while (true) {
			if (tmp == null) {
				break;
			}
			str[k] = String.valueOf(tmp.getValue());
			k++;
			tmp = tmp.getNextRef();
		}
	}

	public boolean searchKey(CustomLinkedList<String> list, String key) {
		Node<T> current = head;
		boolean status = false;
		// while (current != null) {
		for (int i = 0; i < str.length - 1; i++) {
			if (str[i] != null && str[i].equals(key)) {
				status = true;
				current = current.getNextRef();
				break;
			}
		}
		
		// }
		if (status)
			System.out.println(key+ " is present in the list ");
		else
			System.out.println("Element is not present in the list ");
		return status;

	}
	public  int size()
	{
		return count;
	}

}
