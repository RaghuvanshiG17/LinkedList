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

	public int length;
	public Node head;

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

	// case : 3
	public int deleteFromPosition(int position) {
		if (head == null) {
			return 0;
		}
		Node newNode = head;
		Node preNode = head;
		for (int i = 0; i < position; i++) {
			preNode = newNode;
			newNode = newNode.getNext();
		}
		preNode.setNext(newNode.getNext());
		int data = newNode.getData();
		newNode.setNext(null);
		length--;
		return data;
	}

	/***
	 * Problem 2 : Find the Nth element of a linked list from the end
	 * 
	 * 
	 * @param Nth
	 * @return
	 */
	public int retrunNthNodeFromEnd(int Nth) {

		if (head == null) {
			return 0;
		}
		if (Nth > length) {
			return 0;
		}
		Node pre = head, next = head;
		for (int i = 0; i < (length - Nth); i++) {
			pre = next;
			next = next.getNext();
		}
		pre.setNext(next.getNext());
		int nodeData = next.getData();
		next.setNext(null);
		length--;
		return nodeData;
	}

	/////////////////// GeeksforGeeks Problems ////////////////////////

	/**
	 * Question 7 : find the length of the linked list
	 * 
	 */
	public int getListLength() {
		if (head == null) {
			return 0;
		}
		int count = 1;
		Node temp = head;
		while (temp.getNext() != null) {
			count = count + 1;
			temp = temp.getNext();
		}
		return count;
	}

	/***
	 * Question 8 : Search an element is linked list 
	 * Desc : Write a Java function that searches a given key ‘x’ in a given singly linked list. The
	 * 		  function should return true if x is present in linked list and false
	 *        otherwise.
	 */
	// linear search
	public boolean searchPerticularKeyByLinear(int key) {
		if (head == null) {
			return false;
		}
		if (head.getData() == key) {
			return true;
		}
		Node temp = head;
		while (temp.getNext() != null) {
			if (temp.getNext().getData() == key) {
				return true;
			}
			temp = temp.getNext();
		}
		return false;
	}

	// recursive search
	public boolean searchPerticularKeyByRecursive(Node head, int key) {
		Node temp = head;
		if(temp == null){
			return false;
		}
		if(temp.getData() == key){
			return true;
		}
		return searchPerticularKeyByRecursive(temp.getNext(), key);
	}
	
	
	/***
	 *   Question 10 : Swap nodes in a linked list without swapping data
	 *   Desc : Given a linked list and two keys in it, swap nodes for two given keys. 
	 *          Nodes should be swapped by changing links. Swapping data of nodes may be expensive in many situations 
	 *          when data contains many fields.
	 *   Ex : Input:  10->15->12->13->20->14,  x = 12, y = 20
	 *        Output: 10->15->20->13->12->14
	 */
	
	
	 public void swapNodes(int x, int y)
	    {
	        if (x == y){
	        	return;
	        }
	        Node prevX = null, currX = head;
	        while (currX != null && currX.getData() != x)
	        {
	            prevX = currX;
	            currX = currX.getNext();
	        }
	        Node prevY = null, currY = head;
	        while (currY != null && currY.getData() != y)
	        {
	            prevY = currY;
	            currY = currY.getNext();
	        }
	        if (currX == null || currY == null){
	        	return;
	        }
	       if (prevX != null){
	    	   prevX.setNext(currY);
	       }
	       else{
	    	   head = currY;
	       }
	        if (prevY != null){
	        	prevY.setNext(currX);
	        }else{
	        	head = currX;
	        }
	        Node temp = currX.getNext();
	        currX.setNext(currY.getNext());
	        currY.setNext(temp);
	    }
	
	
	/****
	 *   Question 11 : Write a function to get Nth node in a Linked List
	 *   Desc :  Write a GetNth() function that takes a linked list and an integer index and returns the data value stored in the node at that index position.
	 *   Ex : 
	 *   	Input:  1->10->30->14,  index = 2 
	 *   	Output: 30 
	 *   	The node at index 2 is 30
	 *   
	 */
	 public int getNthNodeValue(int key){
		 if(key > length){
			 return 0;
		 }
		 if(key < 0){
			 return 0;
		 }
		 Node temp = head;
		 for(int i  = 0 ; i < key ; i++){
			 temp = temp.getNext();
		 }
		 return temp.getData();
	 }
	
	
	 /***
	  *   Question  12 : Find the middle of a given linked list in Java
	  *   Desc : Given a singly linked list, find middle of the linked list. For example, if given linked list is 1->2->3->4->5 then output should be 3.
	  *          If there are even nodes, then there would be two middle nodes, we need to print second middle element. For example, 
	  *          if given linked list is 1->2->3->4->5->6 then output should be 4.
	  * 
	  */
	 public int findMiddleNode(){
		Node pre = head;
		Node next = head;
		if(head != null){
			while(next != null && next.getNext() != null){
				next = next.getNext().getNext();
				pre = pre.getNext();
			}
		}
		 return pre.getData();
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
