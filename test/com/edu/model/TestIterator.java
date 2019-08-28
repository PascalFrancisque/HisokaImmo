package com.edu.model;

import java.util.Iterator;

public class TestIterator extends IteratorTable {

	public TestIterator(String[] tab) {
		super(tab);
	}

	public static void main(String[] args) {

	String[] names = {"PG", "Barbara", "Akrem", "Benoit"};
	Iterator<?> it = new IteratorTable(names); 
	while(it.hasNext())
	System.out.println(it.next());
	
	}

}
