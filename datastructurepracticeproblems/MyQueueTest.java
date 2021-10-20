package datastructurepracticeproblems;

import linkedlistpracticeproblems.INode;
import linkedlistpracticeproblems.Node;

public class MyQueueTest {
	public static void main(String[] args) {
		givenNumberInQueueWhenPOPShouldMatchWithLastAddedNode();
	}
	public  static void givenNumberInQueueWhenPOPShouldMatchWithLastAddedNode() {
		MyQueue myQueue = new MyQueue();
		Node <Integer>firstNumberNode = new Node<Integer>(56);
		Node <Integer> secondNumberNode = new Node<Integer>(30);
		Node<Integer> thirdNumberNode = new Node<Integer>(70);
		myQueue.enqueue(firstNumberNode);
		myQueue.enqueue(secondNumberNode);
		myQueue.enqueue(thirdNumberNode);
		myQueue.printQueue();
		INode peak =  myQueue.peak();
		INode dequeue =  myQueue.dequeue();
		myQueue.printQueue();
	        boolean result = thirdNumberNode.equals(dequeue ) && thirdNumberNode != peak ;
	       System.out.println(result);
    }
}


