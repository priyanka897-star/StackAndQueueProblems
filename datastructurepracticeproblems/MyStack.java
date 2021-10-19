package datastructurepracticeproblems;

public class MyStack<K>{

	private final MyNode<K> myNode;

	public MyStack() {
		myNode = new MyNode<>();
	}

	public void push(INode<K> element) {
		myNode.add(element);
	}

	public INode peak() {
		return myNode.head;
	}

	public INode pop() {
		return myNode.pop();
	}

	public void printStack() {
		myNode.printNodes();
	}
}
