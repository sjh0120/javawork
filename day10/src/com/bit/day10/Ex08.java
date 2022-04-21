package com.bit.day10;

import java.util.*;

public class Ex08 {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		//<Integer> 제네릭을 통한 제약
		list.add(1111);
		list.add(2222);
		//list.add("3333");
		
		Map<String, Double> map=new HashMap<String, Double>();
		map.put("String",  3.14); //-> String, double 둘다 만족
		//map.put(1234,  3.14); //=> String 만족 x
		map.put("key2",  1.23);
		
		//Map을 제네릭 붙였기 때문에
		Set<String> keys=map.keySet(); // Set keys 또한 제네릭이 필요하며
		Iterator<String> ite=keys.iterator(); // Iterator 또한 제네릭이 필요
		while(ite.hasNext()) {
			String key=ite.next(); //이로 인해 캐스팅이 필요 없어진다!
			double val=map.get(key); //마찬가지로 캐스팅이 필요 없어진다.
		}
		
		
		
		for(int i=0; i<list.size(); i++) {
			int obj=list.get(i);
			//list자체가 integer로 선언되었기 때문에 int형 캐스팅 없이 바로 선언 가능
			
		}
		
		//제네릭 주의사항1
		/*
		제네릭에 들어갈 수 있는 타입은 오직 클래스 타입
		int (x) Integer(o) 즉 wrapper 클래스로 선언해야함!
		int형 double형 다 넣고 싶다 -> Number
		List<Number> list=new ArrayList<Number>();로 선언
		꺼낼 때 또한 Number obj=list.get(i); 해야함!
		즉 <> 제네릭을 붙히지 않았다는 것은 Object형으로 다 받는다는 의미
		 */
		//제네릭 주의사항2
		/*
		Map의 경우 key와 value 2가지의 값을 고유하게 가짐
		따라서
		Map<String, Double> map=new HashMap<String, Double>(); 와 같이
		key 와 value 두가지를 다 제네릭 처리해줘야 한다.
		
		 */
		
		

	}

}
