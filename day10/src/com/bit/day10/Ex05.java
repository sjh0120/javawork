package com.bit.day10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Ex05 {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		
		list.add(1111);
		list.add(2222);
		list.add(3333);
		list.add(4444);
		
		System.out.println(list);
		list.sort(new Comparator() {
			
			@Override
			public int compare(Object o1, Object o2) {
				return 0;
				//return (int)o1-(int)o2;
				//양수 오름차순
				//음수 내림차순

			}
		});
		
		System.out.println(list);
		
		Iterator ite=list.iterator();
		while(ite.hasNext())
			System.out.println(ite.next());
	}

}
