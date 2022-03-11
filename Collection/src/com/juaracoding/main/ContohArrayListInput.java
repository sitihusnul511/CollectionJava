package com.juaracoding.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ContohArrayListInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		ArrayList<String> myData = new ArrayList<String>();
		
		int n = 5;
		
		for (int i=0; i<n; i++) {
			String data = scan.next();
			myData.add(data);
		}
		
		System.out.println("Sebelum sorting: "+myData);
		
		Collections.sort(myData);
		System.out.println("Setelah sorting ASC: "+myData);
		
		Collections.reverse(myData);
		System.out.println("Setelah sorting Desc: "+myData);
	}

}
