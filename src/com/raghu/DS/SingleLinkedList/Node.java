/* Author Name          : Raghuvanshi  
 * E-Mail           	: raghuvanshig17@gmail.com 
 * Creation Date    	: 2:53:17 PM Aug 5, 2017 
 * Last modification	: Aug 5, 2017
               by		: Raghuvanshi 
 * File Name			: Node.java
 * 
 * 
 */

package com.raghu.DS.SingleLinkedList;

/**
 * @author Raghuvanshi
 *
 */
public class Node {

	private int data;
	private Node next;
	
	public Node(int data){
		this.data= data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
}
