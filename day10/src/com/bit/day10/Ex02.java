package com.bit.day10;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Ex02 {

	public static void main(String[] args) {
		//로 또 번호생성기(ver 0.2.0)
		
		System.out.println("로또 번호 생성기 (ver 0.2.0.)");
		/*
		java.util.Set lotto=new java.util.TreeSet();
		while(lotto.size() < 6) {
			lotto.add((int)(Math.random()*45 +1));
		}
		
		java.util.Iterator iteLotto=lotto.iterator();
		
		while(iteLotto.hasNext()) {
			System.out.println(iteLotto.next());
		}
		*/
		
		Random ran=new Random();
		Set lotto=new TreeSet();
		
		while(lotto.size() != 6) {
			lotto.add(ran.nextInt(45) + 1);
		}
		
		Iterator ite=lotto.iterator();
		while(ite.hasNext()) {
			System.out.print(ite.next() + "\t");
		}
		

	}

}
