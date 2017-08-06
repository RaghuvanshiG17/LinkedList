/* Author Name          : Raghuvanshi  
 * E-Mail           	: raghuvanshig17@gmail.com 
 * Creation Date    	: 2:57:25 PM Aug 5, 2017 
 * Last modification	: Aug 5, 2017
               by		: Raghuvanshi 
 * File Name			: TestSingleLinkedList.java
 * 
 * 
 */

package com.raghu.DS.SingleLinkedList;

/**
 * @author Raghuvanshi
 *
 */
public class TestSingleLinkedList {
	
	public static void main(String[] args) {
		SingleLinkedList sll = new SingleLinkedList();
		/**
		 *  Insertion Operation 
		 */
		sll.insertBeforeHead(4);
		sll.insertBeforeHead(3);
		sll.insertBeforeHead(2);
		sll.insertBeforeHead(1);
		System.out.println(sll.printList());
		sll.insertAfterTail(8);
		System.out.println(sll.printList());
		sll.insertAtAfterPosition(5, 3);
		sll.insertAtAfterPosition(6, 4);
		sll.insertAtAfterPosition(7, 5);
		System.out.println(sll.printList());
		System.out.println(sll.getHead());
		System.out.println("Total length : "+sll.length);
		System.out.println();
		
		/**
		 *  Deletion Operation 
		 */
		// delete head of the singllinkedlist
		System.out.println("Head : "+sll.deleteHead());
		System.out.println(sll.printList());
		System.out.println("Total length : "+sll.length);
		
		// delete tail of the singlelinkedlist
		System.out.println("Tail : "+sll.deleteTail());
		System.out.println(sll.printList());
		System.out.println("Total length : "+sll.length);
		
		// delete the node of the given position
		System.out.println("Delete by Position : "+sll.deleteFromPosition(3));
		System.out.println(sll.printList());
		System.out.println("Total length : "+sll.length);
	}
	
}
