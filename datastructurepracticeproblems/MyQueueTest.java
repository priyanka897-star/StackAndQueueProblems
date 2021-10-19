package datastructurepracticeproblems;

public class MyQueueTest {
	public static void main(String[] args) {
		givenNumberWhenAddedToQueueShouldHaveLastAddedNode();
	}
	public  static void givenNumberWhenAddedToQueueShouldHaveLastAddedNode() {
		MyQueue<Integer> myQueue = new MyQueue<Integer>();
		Node<Integer> firstNumberNode = new Node<Integer>(70);
		Node<Integer> secondNumberNode = new Node<Integer>(30);
		Node<Integer> thirdNumberNode = new Node<Integer>(56);
		myQueue.enqueue(firstNumberNode);
		myQueue.enqueue(secondNumberNode);
		myQueue.enqueue(thirdNumberNode);
		INode pop =  myQueue.dequeue();
		myQueue.printStack();
	    if( !firstNumberNode.isEmpty());
	    {
	   System.out.println(true);
	  }
}
}

