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
		String result = "[";
		if (head == null) {
			return result + " ]";
		}
		result = result + head.getData();
		Node temp = head;
		while (temp.getNext() != null) {
			result =result + "]-->[" + temp.getNext().getData();
			temp = temp.getNext();
		}
		result = result + "]";
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
	public int getListLength(Node head) {
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
	
	
	/***
	 *   Question  13 : Write a function that counts the number of times a given int occurs in a Linked List
	 *   Desc         : Given a singly linked list and a key, count number of occurrences of given key in linked list. 
	 *   Example      : if given linked list is 1->2->1->2->1->3->1 and given key is 1, then output should be 4.
	 *  
	 */
	 public int countNumberOfTimeExist(int a){
		 if(head == null){
			 return 0;
		 }
		 Node temp = head;
		 int count = 0;
		 while(temp.getNext() != null){
			 if(temp.getData() == a){
				 count = count+1;
			 }
			 temp = temp.getNext();
		 }
		 return count;
	 }
	
	 
	
	/****
	 *  Question 16 :  Reverse a linked list 
	 *  Desc        :  Given pointer to the head node of a linked list, the task is to reverse the linked list. 
	 *   			   We need to reverse the list by changing links between nodes.
	 *  Example     :  1->2->3->4->NULL
	 *  			   4->3->2->1->NULL
	 */
	
//	 public Node reverseLinkedList(Node head){
//		if(head == null){
//			return null;
//		}
//		Node pre = null;
//		Node next = null;
//		
//	 }
//	 
	
    /***
     *  Question  17 : Detect loop in a linked list
     *  Desc         : Given a linked list, check if the the linked list has loop or not. Below diagram shows a linked list with a loop.
     * 
     */
	
	public boolean findLoopInLinkedList(){
		Node slow = head , fast = head;
		while(fast != null && fast.getNext() != null){
			slow = slow.getNext();
			fast = fast.getNext().getNext();
			if(slow == fast){
				return true;
			}
		}
		return false;
	}
	
	
	/***
	 *  Question  : Create a loop in the linked list 
	 *  Desc      : We have to traverse linked list and at the tail of the linked list we will assign any node address instead of the null
	 *  
	 */
	public void createLoopInLinkedList(){
		Node temp  = head;
		while(temp.getNext() != null){
			temp = temp.getNext();
		}
		temp.setNext(head.getNext().getNext());
	}
	
	/***
	 *  Question 20 : Given a linked list which is sorted, how will you insert in sorted way
	 *  Desc        : Given a sorted linked list and a value to insert, write a function to insert the value in sorted way. 
	 */
	public void insertNodeInSortedLinkedList(int data) {
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
		}
		Node temp = head;
		while(temp.getNext() != null && temp.getNext().getData() < data){
				temp = temp.getNext();
		}
		newNode.setNext(temp.getNext());
		temp.setNext(newNode);
		length++;
	}
	
	/***
	 *  Question 21 : Given only a pointer/reference to a node to be deleted in a singly linked list, how do you delete it?
	 *  Desc        : Given a pointer to a node to be deleted, delete the node. Note that we don’t have pointer to head node.
	 * 
	 */
	public void deleteANodeOnGivenReference(Node node) {
		Node temp = head;
		if (node == temp) {
			head = head.getNext();
			temp.setNext(null);
		}
		while (temp.getNext() != null && temp.getNext() != node) {
			temp = temp.getNext();
		}
		temp.setNext(node.getNext());
		node.setNext(null);
		length--;
	}

	/***
	 *   Question  23 : Write a function to get the intersection point of two Linked Lists.
	 *   Desc         : There are two singly linked lists in a system. By some programming error the end node of one of the linked list got linked into the second list, 
	 *   				forming a inverted Y shaped list. Write a program to get the point where two linked list merge.
	 * 
	 */
	
	public int intractionNodeOfTwoLinkedListMethod_1(Node head1, Node head2) {
		if (head1 == null || head2 == null) {
			return -1;
		}
		Node current1 = head1;
		Node current2 = head2;
		while (current1.getNext() != null) {
			while (current2.getNext() != null) {
				if (current1 == current2) {
					return current1.getData();
				}
				current2 = current2.getNext();
			}
			current2 = head2;
			current1 = current1.getNext();
		}
		return -1;
	}

	/***
	 * 
	 * @param head1
	 * @param head2
	 * @return
	 */
	public int intractionNodeOfTwoLinkedListMethod_2(Node head1 , Node head2){
		int length1 = getListLength(head1);
		int length2 = getListLength(head2);
		int difference = 0;
		if(length1 > length2){
			difference = length1-length2;
			return getInteractionNode(difference, head1 , head2);
		}else{
			difference = length2-length1;
			return getInteractionNode(difference, head2 , head1);
		}
	}

	/**
	 * @param difference
	 * @param head1
	 * @param head2
	 * @return
	 */
	private int getInteractionNode(int difference, Node head1, Node head2) {
	 Node current1 = head1;
	 Node current2 = head2;
	 for(int i = 0 ;  i < difference ; i++){
		 if (current1 == null) {
			 return 0;
		}
		current1 = current1.getNext();
	 }
	 while(current1!= null && current2!= null){
		 if(current1.getData() == current2.getData()){
			 return current1.getData();
		 }
		 current1 = current1.getNext();
		 current2 = current2.getNext();
	 }
		return 0;
	}
	
	/****
	 *   Question  25 : Remove duplicates from a sorted linked list.
	 *   Desc         : Write a removeDuplicates() function which takes a list sorted in non-decreasing order and deletes any duplicate nodes from the list. 
	 *   				The list should only be traversed once.
	 *   Ex           : 11->11->11->21->43->43->60 then removeDuplicates(),
	 *   Result       : 11->21->43->60.
	 * 
	 */
	
	public void removeDuplicateNodeFromSortedLinkedLinkedList(Node head){
		Node pre = head;
		Node temp ;
		if(head == null){
			return;
		}
		while(pre.getNext() != null){
			
			if (pre.getData() == pre.getNext().getData()) {
				temp = pre.getNext();
				pre.setNext(pre.getNext().getNext());
				temp.setNext(null);
			}else{
				pre = pre.getNext();
			}
			
		}
	}
	
	
	/***
	 *   Question  26 : Remove duplicates from an unsorted linked list.
	 *   Desc         : Write a removeDuplicates() function which takes a list and deletes any duplicate nodes from the list. 
	 *   				The list is not sorted.
	 *   Ex           : 12->11->12->21->41->43->21.
	 *   Result       : 12->11->21->41->43.				
	 * 
	 */
	public void removeDuplicateNdeFromUnSortedLinkedList(Node head){
		Node pre = null , next = null , dup = null;
		pre = head;
		while(pre != null && pre.getNext() != null){
			next = pre;
			while(next.getNext() != null){
				if(pre.getData() == next.getNext().getData()){
					dup = next.getNext();
					next.setNext(next.getNext().getNext());
					dup.setNext(null);
				}else{
					next = next.getNext();
				}
			}
			pre = pre.getNext();
		}
	}
	
	/***
	 *  Question  27 : Pairwise swap elements of a given linked list.
	 *  Desc         : Given a singly linked list, write a function to swap elements pairwise.
	 *  Ex 1         : 1->2->3->4->5 
	 *  Result       : 2->1->4->3->5, 
	 *  Ex 2         : 1->2->3->4->5->6 
	 *  Result       : 2->1->4->3->6->5.
	 * 
	 */
	
	public void swapPairWiseNode(Node head){
		Node temp = head;
		if(head == null){
			return ;
		}
		while(temp != null && temp.getNext()!= null){
			int k = temp.getData();
			temp.setData(temp.getNext().getData());
			temp.getNext().setData(k);
			temp = temp.getNext().getNext();
		}
	}
	
	/***
	 *   Question 29 : Move last element to front of a given Linked List.
	 *   Desc        : Write a C function that moves last element to front in a given Singly Linked List. For example, 
	 *   Ex          : 1->2->3->4->5, 
	 *   Result      : 5->1->2->3->4.
	 * 
	 */
	public void moveLastElementAsFront(){
		Node next = head;
		Node pre = null;
		if(head == null){
			return ;
		}
		while(next != null && next.getNext() != null){
			pre= next;
			next = next.getNext();
		}
		next.setNext(head);
		pre.setNext(null);
		head = next;
	}
	
	/***
	 *  Question 30 : Delete alternate nodes of a Linked List
	 *  Desc        : Given a Singly Linked List, starting from the second node delete all alternate nodes of it.
	 *  Ex          : 1->2->3->4->5
	 *  Result      : 1->3->5
	 */
	public void deleteAlternateNode(Node head){
		Node pre =  head;
		Node next = head.getNext();
		Node temp;
		while(pre != null && next != null){
			pre.setNext(next.getNext());
			temp = next;
			temp.setNext(null);
			pre = pre.getNext();
			if(pre != null){
				next = pre.getNext();
			}
			temp.setNext(null);
		}
		
	}

	/***
	 * Recursive solution of the above problem.
	 * @param head
	 */
	public void deleteAlternateNodeRecursive(Node head){
		if(head == null){
			return ;
		}
		Node pre = head.getNext();
		if(pre == null){
			return ;
		}
		head.setNext(pre.getNext());
		pre.setNext(null);
		deleteAlternateNodeRecursive(head.getNext());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}