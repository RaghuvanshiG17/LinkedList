/* Author Name          : Raghuvanshi  
 * E-Mail           	: raghuvanshig17@gmail.com 
 * Creation Date    	: 2:57:09 PM Aug 5, 2017 
 * Last modification	: Aug 5, 2017
               by		: Raghuvanshi 
 * File Name			: SingleLinkedList.java
 * 
 * 
 */

package com.raghu.DS.SingleLinkedList;

/**
 * @author Raghuvanshi
 *
 */
public class SingleLinkedList {

	int length;
	Node head;

	public SingleLinkedList() {
		length = 0;
	}

	// get Head of the Single Linked List
	public int getHead() {
		return head.getData();
	}

	/**
	 * Insertion in Single Linked List
	 */

	// printing the Single Linked List element
	public String printList() {
		String result = "[ ";
		if (head == null) {
			return result + " ]";
		}
		result = result + head.getData();
		Node temp = head;
		while (temp.getNext() != null) {
			result = result + " , " + temp.getNext().getData();
			temp = temp.getNext();
		}
		result = result + " ]";
		return result;
	}

	// case : 1
	public void insertBeforeHead(int data) {
		Node newNode = new Node(data);
		newNode.setNext(head);
		head = newNode;
		length++;
	}

	// case : 2
	public void insertAfterTail(int data) {
		Node newNodw = new Node(data);
		if (head == null) {
			head = newNodw;
			length++;
		}
		Node temp = head;
		while (temp.getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(newNodw);
		newNodw.setNext(null);
		length++;
	}

	// case : 3
	public void insertAtAfterPosition(int data, int position) {
		if (position < 0) {
			position = 0;
		}
		if (position > length) {
			position = length;
		}
		Node newNode = new Node(data);
		Node temp = head;
		for (int i = 0; i < position; i++) {
			temp = temp.getNext();
		}
		newNode.setNext(temp.getNext());
		temp.setNext(newNode);
		length++;
	}

	/**
	 * Deletion in Single Linked List
	 */

	// case : 1
	public int deleteHead() {
		if (head == null) {
			return 0;
		}
		Node newNode = head;
		head = head.getNext();
		newNode.setNext(null);
		length--;
		return newNode.getData();
	}

	// case : 2
	public int deleteTail() {
		if (head == null) {
			return 0;
		}
		Node newNode = head;
		Node preNode = head;
		while (newNode.getNext() != null) {
			preNode = newNode;
			newNode = newNode.getNext();
		}
		int data = newNode.getData();
		preNode.setNext(null);
		length--;
		return data;
	}

	
	// case  : 3 
	public int deleteFromPosition(int position){
		if(head == null){
			return 0;
		}
		Node newNode = head;
		Node preNode = head;
		for(int i = 0 ; i < position ; i++){
			preNode = newNode;
			newNode = newNode.getNext();
		}
		preNode.setNext(newNode.getNext());
		int data = newNode.getData();
		newNode.setNext(null);
		length--;
		return data;
	}
}
