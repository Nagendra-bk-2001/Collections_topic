package com.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Demo {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<Integer>();
		
		l.add(10);
		l.add(20);
		l.add(30);
		
		System.out.println(l);
		
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
		
		
		int[] x = {20,30,40};
		
		System.out.println(x.length);
		
		
		String y = "I love u naguu";
		System.out.println(y.length());
		System.out.println("===========================================");
		
		ArrayList aaa= new ArrayList();
		
		aaa.add(10);
		
		aaa.add(20);
		
		aaa.add(30);
		
		System.out.println("object inside arrallist " + aaa + "size is : " + aaa.size());

		LinkedList i = new LinkedList();
		
		
		i.addAll(aaa);//add all method using a one collection to another collection 
		i.add(60);
		i.add(70);
		i.add(90);
		
		System.out.println("object inside linkedlist " + i + "size is : " + i.size());

		System.out.println("===========================================");
		
		System.out.println("object inside linkedlist " + i + "size is : " + i.size());
		System.out.println(i.containsAll(aaa));
		i.remove(1);
		i.removeAll(aaa);//used to variable value removee the arraylist of values 
		System.out.println("object inside linkedlist " + i + "size is : " + i.size());
		System.out.println(i.containsAll(aaa));
		
	}

}
