package com.juaracoding.main;

import java.util.ArrayList;

public class ContohArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		cars.set(0, "Toyota");
		
		System.out.println(cars);
		
		System.out.println(cars.get(1));
		
		for (int i = 0; i<cars.size(); i++) {
		System.out.print(cars.get(i)+" ");
		}

	}

}
