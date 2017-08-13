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
		System.out.println("Deleted Nth Node from the end : "+sll.retrunNthNodeFromEnd(4));	
		System.out.println(sll.printList());
		System.out.println("Length of the Linked List : "+sll.getListLength(sll.head));
		System.out.println("Search a perticular Key in Linked List : "+sll.searchPerticularKeyByLinear(8));
		System.out.println("Search a perticular Key in Linked List : "+sll.searchPerticularKeyByLinear(2));
		System.out.println("Search a perticular Key in Linked List : "+sll.searchPerticularKeyByLinear(4));
		System.out.println("Search a perticular Key in Linked List : "+sll.searchPerticularKeyByLinear(5));
		System.out.println("Search a perticular Key in Linked List : "+sll.searchPerticularKeyByLinear(6));
		System.out.println("Search a perticular Key in Linked List : "+sll.searchPerticularKeyByLinear(7));
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println(sll.printList());
		System.out.println("Search a perticular Key in Linked List : "+sll.searchPerticularKeyByRecursive(sll.head, 8));
		System.out.println("Search a perticular Key in Linked List : "+sll.searchPerticularKeyByRecursive(sll.head, 2));
		System.out.println("Search a perticular Key in Linked List : "+sll.searchPerticularKeyByRecursive(sll.head, 4));
		System.out.println("Search a perticular Key in Linked List : "+sll.searchPerticularKeyByRecursive(sll.head, 5));
		System.out.println("Search a perticular Key in Linked List : "+sll.searchPerticularKeyByRecursive(sll.head, 6));
		System.out.println("Search a perticular Key in Linked List : "+sll.searchPerticularKeyByRecursive(sll.head, 7));
		System.out.println("-------------------------------------------------------------------------------");
		sll.swapNodes(4, 7);
		System.out.println(sll.printList());
		sll.insertBeforeHead(1);
		sll.insertAtAfterPosition(5, 1);
		sll.insertBeforeHead(0);
		sll.insertAtAfterPosition(8, 6);
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println(sll.printList());
		System.out.println("Nth position value in a Linked list : "+sll.getNthNodeValue(3));
		System.out.println("Find the Middle of the linked list : "+sll.findMiddleNode());
		System.out.println("-------------------------------------------------------------------------------");
		sll.insertAtAfterPosition(4, 5);
		sll.insertAtAfterPosition(4, 2);
		sll.insertAtAfterPosition(4, 6);
		sll.insertAtAfterPosition(4, 7);
		System.out.println(sll.printList());
		System.out.println(" Number 4 is repeating time in linked list : "+sll.countNumberOfTimeExist(4));
//		System.out.println("Reverse of the given linked list : "+sll.reverseLinkedList(sll.head));
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println(sll.printList());
		// up to now there is no loop in the linked list so we will get the false 
		System.out.println("Find that Linked list contain loop ( cycle) or not : "+sll.findLoopInLinkedList());
		/**
		 *   we will comment the below code afte testing of the sll.findLoopInLinkedList() method 
		 *    for testing the above method plz uncomment sll.createLoopInLinkedList(); this method
		 *    this method can be eooect on another methods thats why iwe will comment this method 
		 */
//		sll.createLoopInLinkedList();
		// Now we have a loop in the linked list so we will get true of the cycle / loop method output 
		System.out.println("Find that Linked list contain loop ( cycle) or not : "+sll.findLoopInLinkedList());
		SingleLinkedList l1 = new SingleLinkedList();
		l1.insertBeforeHead(5);
		l1.insertAfterTail(10);
		l1.insertAfterTail(15);
		System.out.println("L1 Linked list : "+l1.printList());
		
		SingleLinkedList l2 = new SingleLinkedList();
		l2.insertBeforeHead(2);
		l2.insertAfterTail(3);
		l2.insertAfterTail(20);
		System.out.println("L1 Linked list : "+l2.printList());
		l1.insertNodeInSortedLinkedList(12);
		System.out.println("Merge of two Sorted linked List : "+l1.printList());
		l1.insertNodeInSortedLinkedList(14);
		System.out.println("Merge of two Sorted linked List : "+l1.printList());
		l1.insertNodeInSortedLinkedList(9);
		System.out.println("Merge of two Sorted linked List : "+l1.printList());
		Node test = sll.head;
		sll.deleteANodeOnGivenReference(test.getNext().getNext().getNext().getNext());
		System.out.println("Linked List After deleting a given Node from the LinkedList : "+sll.printList());
		
		SingleLinkedList list1 = new SingleLinkedList();
		list1.insertBeforeHead(2);
		list1.insertAfterTail(4);
		list1.insertAfterTail(6);
		list1.insertAfterTail(8);
		list1.insertAfterTail(9);
		list1.insertAfterTail(10);
		list1.insertAfterTail(11);
		SingleLinkedList list2 = new SingleLinkedList();
		list2.insertBeforeHead(1);
		list2.insertAfterTail(3);
		list2.insertAfterTail(5);
		list2.insertAfterTail(7);
		Node test2 = list2.head.getNext().getNext().getNext();
		Node test3 = list1.head.getNext().getNext();
		test2.setNext(test3);
		/**                                
		 *                          [1]
		 *                          /
		 *                        [3]
		 *                        /
		 *                      [5]  
		 *           [2]        /     
		 *             \      [7]
		 *              [4]   /
		 *                \  /   
		 *                 [6]        ---------------------->  [6] is the intraction point of the below problem 
		 *                   \
		 *                    [8]
		 *                      \
		 *                      [9] 
		 *                        \
		 *                        [10]
		 *                          \
		 *                          [11]
		 */
		
		/*** Appraoch : 1
		 *   Time complxity of the below method is O(MN)
		 *   M = Number of node in the first Linked List 
		 *   N = Number of node in the second Linked List 
		 */
		System.out.println("Approach one Intraction point of the given two linked list : "+sll.intractionNodeOfTwoLinkedListMethod_1(list1.head, list2.head));
		
		/*** Appraoch : 2
		 *   Time complxity of the below method is O(M+N)
		 *   M = Number of node in the first Linked List 
		 *   N = Number of node in the second Linked List 
		 */
		System.out.println("Approach two Intraction point of the given two linked list : "+sll.intractionNodeOfTwoLinkedListMethod_2(list1.head, list2.head));
		
		SingleLinkedList list3 = new SingleLinkedList();
		list3.insertBeforeHead(11);
		list3.insertBeforeHead(11);
		list3.insertBeforeHead(11);
		list3.insertAfterTail(21);
		list3.insertAfterTail(43);
		list3.insertAfterTail(43);
		list3.insertAfterTail(60);
		System.out.println("Remove duplicate Node from the Linked List : "+list3.printList());
		sll.removeDuplicateNodeFromSortedLinkedLinkedList(list3.head);
		System.out.println("Remove duplicate Node from Sorted Linked List : "+list3.printList());
		SingleLinkedList list4 = new SingleLinkedList();
		list4.insertBeforeHead(12);
		list4.insertBeforeHead(11);
		list4.insertBeforeHead(12);
		list4.insertAfterTail(21);
		list4.insertAfterTail(41);
		list4.insertAfterTail(43);
		list4.insertAfterTail(21);
		System.out.println("Remove duplicate Node from Unsorted Linked List : "+list4.printList());
		sll.removeDuplicateNdeFromUnSortedLinkedList(list4.head);
		System.out.println("Remove duplicate Node from Unsorted Linked List : "+list4.printList());
		SingleLinkedList list5 = new SingleLinkedList();
		list5.insertBeforeHead(1);
		list5.insertAfterTail(2);
		list5.insertAfterTail(3);
		list5.insertAfterTail(4);
		list5.insertAfterTail(5);
		list5.insertAfterTail(6);
		System.out.println("Linked list before pairwise swap : "+list5.printList());
		sll.swapPairWiseNode(list5.head);
		System.out.println("Linked list after pairwise swap : "+list5.printList());
		sll.moveLastElementAsFront();
		System.out.println("Linked List after move Last element af front(head) : "+sll.printList());
		
		SingleLinkedList list6 = new SingleLinkedList();
		list6.insertBeforeHead(1);
		list6.insertAfterTail(2);
		list6.insertAfterTail(3);
		list6.insertAfterTail(4);
		list6.insertAfterTail(5);
		System.out.println("Linked List6 : "+list6.printList());
//		sll.deleteAlternateNode(list6.head);
//		System.out.println("Delete alternate nodes of a Linked List using by linear solution : "+list6.printList());
		sll.deleteAlternateNodeRecursive(list6.head);
		System.out.println("Delete alternate nodes of a Linked List using By Recursive Solution : "+list6.printList());
		
		
	}
	
	
}
