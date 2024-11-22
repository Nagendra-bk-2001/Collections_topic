package com.ArraryList;

import java.util.ArrayList;
import java.util.Collections;

public class MAinClasss {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		a.add(70);
		
		System.out.println( "Before Sorted "+a);
		
		for(int i =0;i<a.size();i++)
		{
			System.out.println(a.get(i));

		}
		
		Collections.sort(a);
		
		System.out.println( "After  Sorted "+a);
		
		for(int i =0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		
	}

}
