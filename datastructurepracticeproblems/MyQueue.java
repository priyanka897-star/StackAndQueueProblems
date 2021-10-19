package datastructurepracticeproblems;

public class MyQueue<K> {
private final MyNode<K> myNode;
	

	public MyQueue() {
		myNode = new MyNode<>();
	}

	public void enqueue(INode<K> element) {
		myNode.add(element);
	}

	public INode peak() {
		return myNode.head;
	}

	public INode dequeue() {
		return myNode.pop();
	}

	public void printStack() {
		myNode.printNodes();
	}
}



