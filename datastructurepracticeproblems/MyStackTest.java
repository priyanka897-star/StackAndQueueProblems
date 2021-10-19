package datastructurepracticeproblems;

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
		INode pop = myStack.pop();
		myStack.printStack();
		if( !thirdNumberNode.isExist());
		{
		   System.out.println(true);
		  }
	}
}
