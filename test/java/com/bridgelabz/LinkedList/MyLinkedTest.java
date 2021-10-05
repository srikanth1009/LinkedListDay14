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
	 @Test
	    public void given3NumberAdded2LinkListToTop(){
	        MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
	        MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
	        MyNode<Integer> myThirdNode = new MyNode<Integer>(70);

	        MyLinkedList myLinkedList = new MyLinkedList();
	        myLinkedList.add(myFirstNode);
	        myLinkedList.append(mySecondNode);
	        myLinkedList.append(myThirdNode);
	        myLinkedList.printNodes();

	        boolean result = myLinkedList.head.equals(myFirstNode) &&
	        		myLinkedList.head.getNext().equals(mySecondNode) && 
	        		myLinkedList.tail.equals(myThirdNode);

	        Assert.assertTrue(result);



	    }
	 @Test
	    public void given3NumberAdded2LinkListToTopInsert(){
	        MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
	        MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
	        MyNode<Integer> myThirdNode = new MyNode<Integer>(70);

	        MyLinkedList myLinkedList = new MyLinkedList();
	        myLinkedList.add(myFirstNode);
	        myLinkedList.append(myThirdNode);
	        myLinkedList.insert(myFirstNode,mySecondNode);
	        myLinkedList.printNodes();

	        boolean result = myLinkedList.head.equals(myFirstNode) &&
	        		myLinkedList.head.getNext().equals(mySecondNode) && 
	        		myLinkedList.tail.equals(myThirdNode);

	        Assert.assertTrue(result);



	    }
	 @Test
	    public void given3NumberAdded2LinkListTopop(){
	        MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
	        MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
	        MyNode<Integer> myThirdNode = new MyNode<Integer>(70);

	        MyLinkedList myLinkedList = new MyLinkedList();
	        myLinkedList.add(myFirstNode);
	        myLinkedList.append(myThirdNode);
	        myLinkedList.insert(myFirstNode,mySecondNode);
	        myLinkedList.pop();
	        myLinkedList.printNodes();
      }
	 @Test
	    public void given3NumberAdded2LinkListToPopLast(){
	        MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
	        MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
	        MyNode<Integer> myThirdNode = new MyNode<Integer>(70);

	        MyLinkedList myLinkedList = new MyLinkedList();
	        myLinkedList.add(myFirstNode);
	        myLinkedList.append(myThirdNode);
	        myLinkedList.insert(myFirstNode,mySecondNode);
	        myLinkedList.popLast();
	        myLinkedList.printNodes();
	    }
}

