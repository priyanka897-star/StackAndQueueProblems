package datastructurepracticeproblems;

public class MyNode<K> {
	public INode head;
	public INode tail;

	public MyNode() {
		this.head = null;
		this.tail = null;
	}

	public void add(INode newNode) {

		if (this.head == null)
			this.head = newNode;
		if (this.tail == null)
			this.tail = newNode;
		else {
			INode temp = this.head;
			this.head = newNode;
			head.setNext(temp);
		}
	}
	public INode pop() {
		INode temp = this.head;
		this.head = head.getNext();
		return temp;
	}

	public void printNodes() {
		StringBuffer myNodes = new StringBuffer("My Nodes :");
		INode temp = head;
		while (temp.getNext() != null) {
			myNodes.append(temp.getKey());
			if (!temp.equals(tail))
				myNodes.append("->");
			temp = temp.getNext();
		}
		myNodes.append(temp.getKey());
		System.out.println(myNodes);
	}
}
