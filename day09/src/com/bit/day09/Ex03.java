package com.bit.day09;

public class Ex03 {

	public static void main(String[] args) {
		BitStack queue=new BitArray();
		
		//BitArray queue=new BitArray();
		//를 쓴다면 BitArray에 있는 모든 함수를 쓸 수 있음
		//따라서 제약을 주기 위해 인터페이스 상속을 하며
		//강제성을 부여한다!
		
		queue.add("첫번째");
		queue.add("두번째");
		queue.add("세번째");
		queue.add("네번째");
		
		//BitQueue에서 선언되어져 있는 것 제외하곤 안됨
//		while(queue.size()!=0) {
//			System.out.println(queue.poll());
//		}
		while(true) {
			Object obj=queue.pop();
			if(obj==null) break;
			System.out.println(obj);
		}

	}

}
