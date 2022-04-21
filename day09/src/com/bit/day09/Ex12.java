package com.bit.day09;

import java.util.LinkedList;

public class Ex12 {

	public static void main(String[] args) {
		java.util.Deque deq=new LinkedList();
		//링크드리스트는 되도록 인터페이스를 통해서 상속받아서 사용하는게 좋다!
		//Deque -> 큐와 스택의 개념을 둘 다 가지고 있는 
		//앞으로 넣어서 앞으로 빼고, 뒤로 넣을 때는 뒤로 넣는 구조!
		//중간에서 뽑을 수는 없다!
		
//		//앞으로 넣기
//		deq.offerFirst(1111);
//		deq.offerFirst(2222);
//		deq.offerFirst(3333);
//		deq.offerFirst(4444);
		
//		//뒤로 넣기
//		deq.offerLast(1111);
//		deq.offerLast(2222);
//		deq.offerLast(3333);
//		deq.offerLast(4444);
		
//		while(true) {
//			if(deq.peekFirst()==null) break;
//			System.out.println(deq.pollFirst());
		//스택
//		}//앞으로 집어넣어서 앞으로 뺴기
		
//		while(true) {
//			if(deq.peekLast()==null)break;
//			System.out.println(deq.pollLast());
//			//큐
//		}//앞으로 집어넣어서 뒤로 빼기
		
//		while(true) {
//			if(deq.peekLast()==null)break;
//			System.out.println(deq.pollLast());
//			//스택
//		}//뒤로 집어넣어서 뒤로 빼기
		
	}
}
