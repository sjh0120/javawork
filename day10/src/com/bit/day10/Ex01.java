package com.bit.day10;


public class Ex01 {

	public static void main(String[] args) {
		// Set타입의 자료구조(순서가 없는 자료구조)
		// 이론적 : 순서(x), 중복(x) -> 실질적 : 순서(o), 중복(x)
		// 중복을 허용하지 않는 자료구조
		java.util.Set set1=new java.util.HashSet();
		System.out.println("1." + set1.add(1111));
		System.out.println("2." + set1.add(2222));
		System.out.println("3." + set1.add(3333));
		System.out.println("4." + set1.add(2222)); //이전까지 순서가 있는 중복가능한 자료구조는 add를 할때 모두 true이다!
		System.out.println("5." + set1.add(1111));
		java.util.Iterator ite=set1.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		java.util.Iterator ite2=set1.iterator();
		//Iterator 또한 next()를 통해서 안의 내용물을 다 꺼냈기 때문에 다시 사용하기 위해서는 새로 선언해야한다.
		
		//트리셋 vs 해쉬셋
		// * 해쉬셋 -> 해쉬 함수 사용 //순서가 정해져있지 않아서 자료구조의 정렬을 해쉬를 쓴다
		// * 트리셋 -> 트리 사용 //자료구조의 정렬을 트리를 사용한다.
		java.util.Set set2=new java.util.TreeSet();
		System.out.println("1." + set2.add("첫 번째"));
		System.out.println("2." + set2.add("두 번째"));
		System.out.println("3." + set2.add("세 번째"));
		System.out.println("4." + set2.add("두 번째")); 
		System.out.println("5." + set2.add("첫 번째"));
		java.util.Iterator ite3=set2.iterator();
		while(ite3.hasNext()) {
			System.out.println(ite3.next());
		}
		java.util.Iterator ite4=set2.iterator();
		
		/*
		이전의 중복확인 방법
		0에서 부터 length까지 반복문을 통해 같은 지를 판단
		
		해쉬셋 -> 숫자를 가지고 정렬(해쉬함수를 사용하기 때문에 항상 일정한 순서를 갖는다)
				  자료구조에 자료가 들어갈땐 항상 캐스팅 되서 Object 객체로 들어가짐
				  이전의 중복확인과 달리 들어가기 전에 데이터가 존재하는지를 판단
		
		트리셋 -> 별도의 순서를 가지고 있지 않으며 중복확인을 위해 add당시에 중복 여부를 확인
				  따라서 정렬이 자동으로 요구되어지며 정렬이 되어진다.(이진트리방식의 정렬을 사용)
		
		 */
		
		
		
		
		
	}

}
