package datastructurepracticeproblems;

public class MyStackTest {
	
	public static void main(String[] args) {
		givenNumberWhenAddedToStackShouldHaveLastAddedNode();
	}
	public  static void givenNumberWhenAddedToStackShouldHaveLastAddedNode() {
		MyStack<Integer> myStack = new MyStack<Integer>();
		Node<Integer> firstNumberNode = new Node<Integer>(70);
		Node<Integer> secondNumberNode = new Node<Integer>(30);
		Node<Integer> thirdNumberNode = new Node<Integer>(56);
		myStack.push(firstNumberNode);
		myStack.push(secondNumberNode);
		myStack.push(thirdNumberNode);
		INode myNode =  myStack.peak();
		myStack.printStack();
		boolean result = myStack.peak().equals(thirdNumberNode);
	        System.out.println(result);
		}
}
