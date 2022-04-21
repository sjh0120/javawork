package com.bit.day10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex07 {

	public static void main(String[] args) {
		Map map1=new HashMap();
		
		Ex07 me1=new Ex07();
		Ex07 me2=new Ex07();
		
		map1.put(1111, 1000);
		map1.put(3.14, "실수");
		map1.put(true, "불린");
		map1.put(me1, "value");
		map1.put(me2, "value1");
		
		//Set에서의 keys 반복
//		Set keys=map1.keySet();
//		Iterator ite=keys.iterator();
//		Iterator ite2=keys.iterator();
//		while(ite.hasNext()) {
//			Object key=ite.next();
//			System.out.println(key + " : " + map1.get(key));
//		}
		
		Set entrys=map1.entrySet();
		Iterator ite=entrys.iterator();
		while(ite.hasNext()) {
			Entry entry=(Entry)ite.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
			System.out.println(entry);
		}	
		
	}

}
