package com.ArraryList;

import java.util.ArrayList;
public class FirstExample {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(20.3);
		al.add(11);
		al.add(null);
		al.add("Java");
		
		System.out.println(al);
		System.out.println("===============================");
		
		//size of the arraylist of length 
		System.out.println( " size of the arrayList length is = "+al.size());
		
		System.out.println("===============================");
		
//		arraylist of used to get() method is  index of element is come
		
		System.out.println(al.get(3));
		
		System.out.println("==============================="); 
//		if the contains using a compare the list of arraylist i element true p false
		System.out.println(al.contains("java"));
		System.out.println(al.contains("Java"));
		
		System.out.println("===============================");
//		remove the method using the remove the element from arralylist
		al.remove(0);
		System.out.println("after the remobve the method showing element is = "+al);
		al.add(10);
		System.out.println("adding again 10 is  "+al);
		
		System.out.println("===============================");
		System.out.println("empty method using showig output is = "+al.isEmpty());
		
		System.out.println("===============================");
		al.clear();
		
		System.out.println("===============================");
		
		ArrayList x = new ArrayList();
		
		x.add(10);
		x.add(12);
		x.add(14);
		x.add(16);
		x.add(18);
		x.add(20);
		x.add(22);
		x.add(22);
		System.out.println(x);
		System.out.println("adding again 10 is  "+al);
		System.out.println("===============================");
//		System.out.println(x.indexOf(22));
		
		ArrayList aaa= new ArrayList();
		
		aaa.add(10);
		
		aaa.add(20);
		
		aaa.add(30);
		
		System.out.println("object inside arrallist ");
		
		
		
		
		
	}

}
