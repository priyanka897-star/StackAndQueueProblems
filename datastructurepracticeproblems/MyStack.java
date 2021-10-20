package datastructurepracticeproblems;

import linkedlistpracticeproblems.MyLinkedList;
import linkedlistpracticeproblems.INode;
import linkedlistpracticeproblems.Node;

public class MyStack{
	private final MyLinkedList myLinkedList;
	
	public MyStack() {
		myLinkedList = new MyLinkedList();
	}

	public void push(INode element) {
		myLinkedList.add(element);
	}

	public INode peak() {
		return myLinkedList.head;
	}

	public void printStack() {
		myLinkedList.printNodes();
	}
    }
}
