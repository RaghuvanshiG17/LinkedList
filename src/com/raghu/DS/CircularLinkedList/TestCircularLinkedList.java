/* Author Name          : Raghuvanshi  
 * E-Mail           	: raghuvanshig17@gmail.com 
 * Creation Date    	: 2:25:24 PM Aug 6, 2017 
 * Last modification	: Aug 6, 2017
               by		: Raghuvanshi 
 * File Name			: TestCircularLinkedList.java
 * 
 * 
 */

package com.raghu.DS.CircularLinkedList;

/**
 * @author Raghuvanshi
 *
 */
public class TestCircularLinkedList {

	public static void main(String[] args) {
		CircularLinkedList cll = new CircularLinkedList();
		
		// insertion operation in circulat linked list 
		cll.addNewHead(4);
		cll.addNewHead(3);
		cll.addNewHead(2);
		cll.addNewHead(1);
		System.out.println(cll.length);
		System.out.println(cll.printCircularLinkedList());
		cll.addNewTail(8);
		System.out.println(cll.printCircularLinkedList());
		cll.addNodeAfterPosition(5, 3);
		cll.addNodeAfterPosition(6, 4);
		cll.addNodeAfterPosition(7, 5);
		System.out.println(cll.printCircularLinkedList());

		// deletion operation in circular linked list 
		System.out.println("Deleted head : "+cll.deleteHead());
		System.out.println(cll.printCircularLinkedList());
		System.out.println("Deleted tail : "+cll.deleteTail());
		System.out.println(cll.printCircularLinkedList());
		System.out.println("Deleted position Node  : "+cll.deleteNodeAfterPosition(3));
		System.out.println(cll.printCircularLinkedList());
	}

}