package com.bridgelabz.LinkedList;
public class MyNode<K> {
	private K key;
	private MyNode next;
	public MyNode(K key) {
		this.key = key;
		this.next = null;
	}
	public K getKey() {
		return key;
	}
	public MyNode getNext() {
		return next;
	}
	public void setNext(MyNode next) {
		this.next = next;
	}
}
