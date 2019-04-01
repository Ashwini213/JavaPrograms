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
	private int size = 0;
	static String[] str = new String[100];
	@SuppressWarnings("rawtypes")
	static CustomLinkedList newList = new CustomLinkedList();

	public boolean isEmpty() {
		return head == null;
	}

	public String addElement(T key) {
		Node<T> nd = new Node<T>();
		nd.setValue(key);
		size++;

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

	@SuppressWarnings("unchecked")
	public CustomLinkedList<T> searchKey(CustomLinkedList<String> list, String key) {
		Node<T> current = head;
		boolean status = false;
		// while (current != null) {
		for (int i = 0; i < str.length - 1; i++) {
			if (str[i] != null && str[i].equals(key)) {
				status = true;
				str[i] = null;
				current = current.getNextRef();
				break;
			}
		}
		for (int i = 0; i < str.length; i++) {
			if (str[i] != null)
				newList.addElement(str[i]);
		}

		if (status) {
			System.out.println(key + " is present in the list ");
		} else {
			System.out.println("Element is not present in the list ");
			newList.addElement(key);
		}
		return newList;

	}

}
