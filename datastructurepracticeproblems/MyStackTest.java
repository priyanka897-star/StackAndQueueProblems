package datastructurepracticeproblems;

import linkedlistpracticeproblems.INode;
import linkedlistpracticeproblems.Node;

public class MyStackTest {

	public static void main(String[] args) {
		givenNumberWhenPOPShouldMatchWithLastAddedNode();
	}
	public static void givenNumberWhenPOPShouldMatchWithLastAddedNode() {
		MyStack<Integer> myStack = new MyStack<Integer>();
		Node<Integer> firstNumberNode = new Node<Integer>(70);
		Node<Integer> secondNumberNode = new Node<Integer>(30);
		Node<Integer> thirdNumberNode = new Node<Integer>(56);
		myStack.push(firstNumberNode);
		myStack.push(secondNumberNode);
		myStack.push(thirdNumberNode);
		INode peak = myStack.peak();
		INode pop = myStack.pop();
		System.out.println("After pop peak Node into Stack:");
		 myStack.printStack();
		boolean result = thirdNumberNode.equals(pop) && thirdNumberNode.equals(peak) ;
		System.out.println(result);
	}
}
