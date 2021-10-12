package com.bridgelabz.LinkedList;
import org.junit.Assert;
import org.junit.Test;

public class MyLinkedTest {
	@Test
	public void given3NumberswhenAddedToLinkedListShouldBeAddedToTop() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		boolean result = myLinkedList.head.equals(myThirdNode) &&
				myLinkedList.head.getNext().equals(mySecondNode)&&
				myLinkedList.tail.equals(myFirstNode);

		//assertArrayEquals(result);
		Assert.assertTrue(result);
	}
	
}

