package com.juaracoding.main;

import java.util.LinkedList;

public class ContohLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> myData = new LinkedList<String>();
		myData.add("Data 1");
		myData.add("Data 2");
		myData.add("Data 3");
		myData.add("Data 4");
		myData.add("Data 5");
		
		
		System.out.println(myData);
		
		myData.addFirst("Data 0");
		myData.addLast("Data 6");
		
		System.out.println(myData);
		
		for (int i=0; i<myData.size(); i++) {
			System.out.print(myData.get(i)+", ");
		}
	
		

	}

}
