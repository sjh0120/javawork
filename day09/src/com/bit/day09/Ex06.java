package com.bit.day09;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex06 {

	public static void main(String[] args) {
		int cnt=100000;
		
		ArrayList list1=new ArrayList();
		LinkedList list2=new LinkedList();
		
		long time1=System.currentTimeMillis();
		for(int i=0; i<cnt; i++) {
			list1.add(i);
		}
		long time2=System.currentTimeMillis();
		for(int i=0; i<cnt; i++) {
			list2.add(i);
		}
		long time3=System.currentTimeMillis();
		
		System.out.println("ArrayList add(이론상 느림) : " + (time2-time1));
		System.out.println("LinkedList add(이론상 빠름) : " + (time3-time2));
		
		long time4=System.currentTimeMillis();
		Object su=null;
		for(int i=0; i<cnt; i++) {
			su=list1.get(i);
		}
		long time5=System.currentTimeMillis();
		for(int i=0; i<cnt; i++) {
			su=list2.get(i);
		}
		long time6=System.currentTimeMillis();
		
		System.out.println("ArrayList get(이론상 빠름) : " + (time5-time4));
		System.out.println("LinkedList get(이론상 느림) : " + (time6-time5));
		

	}

}
