package com.bit.day08;

public class Ex02 {

	public static void main(String[] args) {
		StringBuffer st1=new StringBuffer(1); //capacity가 10이라는 말
		
		st1.append("1");
		System.out.println(st1.capacity());
		st1.append("2");//사이즈가 4까지 늘어남
		st1.trimToSize();//그러나 2까지만 쓰고 다른 버퍼를 안쓸 것 같다!
		//안쓰는 버퍼를 삭제하자!
		//현재까지 쓴것만 냅두고 나머지를 삭제한다!
		System.out.println(st1.capacity());
		
		
//		for(int i=0;i<16;i++) {
//			//기존의 capacity인 10까지 사용하다가 buffer양이 부족하다면 더 늘려서 자동으로 사용한다.
//			//10까지이면 못넣게되는 11의 2배인 22크기로 형성
//			//나중엔 기하급수적으로 늘어나게되어 메모리의 엄청난 낭비를 발생할 수 있다
//			st1.append("a");
//			System.out.println(st1.capacity() +">>"+st1);
//		}
	
		//System.out.println(st1); //문자열을 넣은 값이 없기 때문에""이다.

	}
}
