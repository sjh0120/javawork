package com.bit.day10;

import java.util.Random;

public class Test01 {

	public static void main(String[] args) {
		System.out.println("로또번호 생성기");
		
		java.util.Set lotto=new java.util.TreeSet();
		Random ran=new Random();
		
		while(lotto.size()!=6) {
			//lotto.add((int)Math.random()*45+1);
			lotto.add(ran.nextInt(45)+1);
		}
		
		java.util.Iterator ite=lotto.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}

	}

}
