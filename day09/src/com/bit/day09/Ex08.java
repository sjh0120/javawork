package com.bit.day09;

import java.util.LinkedList;

public class Ex08 {

	public static void main(String[] args) {
		java.util.Queue que=new LinkedList();
		que.offer("첫 번째");
		que.offer("두 번째");
		que.offer("세 번째");
		que.offer("네 번째");
		
//		System.out.println(que.peek());
//		que.poll();
//		System.out.println(que.peek());
//		que.poll();
//		System.out.println(que.peek());
//		que.poll();
//		System.out.println(que.peek());
//		que.poll();
//		System.out.println(que.peek());
//		que.poll();
//		System.out.println(que.peek());
//		que.poll();
		
		//위의 주석과 아래의 while은 같은 의미
		while(que.peek()!=null) {
			System.out.println(que.poll());
		}
		
//		while(true) {
//			Object obj=que.poll();
//			if(obj==null) break;
//			System.out.println(obj);
//		}	
	}
}
