/* Author Name          : Raghuvanshi  
 * E-Mail           	: raghuvanshig17@gmail.com 
 * Creation Date    	: 2:00:11 PM Aug 6, 2017 
 * Last modification	: Aug 6, 2017
               by		: Raghuvanshi 
 * File Name			: CircularLinkedList.java
 * 
 * 
 */

package com.raghu.DS.CircularLinkedList;

/**
 * @author Raghuvanshi
 *
 */
public class CircularLinkedList {

	protected Node tail;
	protected int length;

	public CircularLinkedList() {
		length = 0;
		tail = null;
	}
	
	
	// printing of Circular linked list 
	public String printCircularLinkedList(){
		String result = "[";
		if(tail == null){
			return result+" ]";
		}
		result = result+tail.getNext().getData();
		Node temp = tail.getNext();
		while(temp.getNext() != tail.getNext()){
			result = result + " , " + temp.getNext().getData();
			temp = temp.getNext();
		}
		return result + "]";
	}
	/***
	 *   insertion a node at the begining of the circular linked list 
	 */
	
	// case : 1
	public void addNewHead(int data){
		Node newNode = new Node(data);
		if(tail == null){
			tail = newNode;
			tail.setNext(tail);
		}
		newNode.setNext(tail.getNext());
		tail.setNext(newNode);
		length++;
	}
	
	// case : 2
	public void addNewTail(int data){
		Node newNode = new Node(data);
		if(tail == null){
			tail = newNode;
			tail.setNext(tail);
		}
		newNode.setNext(tail.getNext());
		tail.setNext(newNode);
//		tail =  newNode;
		tail = tail.getNext();
		length++;
	}
	
	// case : 3
	public void addNodeAfterPosition(int data, int position){
		Node  newNode = new Node(data);
		if(position < 0){
			position = 0;
		}
		if (position > length) {
			position = length;
		}
		Node pre = tail.getNext() , next =  tail.getNext().getNext();
		for(int i = 0 ; i < position ; i++){
			pre = next;
			next = next.getNext();
		}
		newNode.setNext(pre.getNext());
		pre.setNext(newNode);
		length++;
	}
	
	
	/***
	 *    deletion operation from a circular linked list 
	 */
	
	// case : 1
	public int deleteHead(){
		if(tail == null){
			return 0;
		}
		
		Node temp = tail.getNext();
		tail.setNext(temp.getNext());
		int nodeData = temp.getData();
		temp.setNext(null);
		length--;
		return nodeData;
	}
	
	//case : 2 
	public int deleteTail(){
		if(tail == null){
			return 0;
		}
		Node temp = tail;
		while(temp.getNext() != tail){
			temp=temp.getNext();
		}
		int  nodeData= temp.getNext().getData();
		temp.setNext(tail.getNext());
		tail.setNext(null);
		tail = temp;
		length--;
		return nodeData;
	}
	public int getHead(){
		return tail.getNext().getData();
	}
	
	public int getTail(){
		return tail.getData();
	}
	
// case : 3 
	public int deleteNodeAfterPosition(int position){
		if(position < 0){
			position = 0;
		}
		if(position > length){
			position = length;
		}
		Node pre = tail , next = tail.getNext();
		for(int i = 0;  i < position ; i++){
			pre = next;
			next = next.getNext();
		}
		pre.setNext(next.getNext());
		int nodeData = next.getData();
		next.setNext(null);
		length--;
		return  nodeData;
	}
	
	
}
