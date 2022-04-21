package com.bit.day10;

import java.util.*;

public class Ex03 {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(1111);
		list.add(2222);
		list.add(3333);
		list.add(2222);
		list.add(1111);
		System.out.println(list.toString());
		
		Set set=new HashSet();
		set.addAll(list);
		//set.clear();
		System.out.println(set.toString());
		System.out.println(set.contains(1111));
		System.out.println(set.contains(4444));
		set.add(4444);
		System.out.println(set.containsAll(list));
		
		Set set2=new TreeSet();
		set2.addAll(list);
		System.out.println(set2.toString());
		

		String a="bbcd";
		String b="abcd";
		int c=a.compareTo(b);
		System.out.println(c);
	}
}
