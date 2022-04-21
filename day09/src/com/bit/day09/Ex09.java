package com.bit.day09;

import java.util.Stack;

public class Ex09 {

	public static void main(String[] args) {
		java.util.Stack stack=new Stack();
		stack.push("첫 번째");
		stack.push("두 번째");
		stack.push("세 번째");
		stack.push("네 번째");
		
		
//		while(true) {
//			if(stack.peek()==null) break;
//			System.out.println(stack.pop());
//		}
		
		while(!stack.empty()) {
			System.out.println(stack.pop());
		}
		
//		System.out.println(stack.peek());
//		stack.pop();
//		System.out.println(stack.peek());
//		stack.pop();
//		System.out.println(stack.peek());
//		stack.pop();
//		System.out.println(stack.peek());
//		stack.pop();
		
	}

}
