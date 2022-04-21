package com.bit.day05;

public class Ex06 {

	public static void main(String[] args) {
		String msg1="java world";
		String msg2=new String(msg1);
		String msg3="java world";
		String msg4="java";
		String msg5="World";
		
		System.out.println(msg1==msg2);
		System.out.println(msg1.equals(msg2));
		System.out.println(msg1.equals(msg3));
		System.out.println(msg1.length());
		System.out.println(msg4+msg5=="JavaWorld");
		System.out.println("Java"+"World"=="JavaWorld");
		System.out.println(msg4.concat(msg5)=="JavaWorld");
		//=>+와 concat은 다르다!
		
		for(int i=0; i<msg1.length(); i++)
			System.out.println(msg1.charAt(i));
		System.out.println("--------------------");
		System.out.println(msg1.indexOf('a'));
		System.out.println(msg1.indexOf('a',2));
		System.out.println(msg1.indexOf(10));//char 10 -> \n
		System.out.println(msg1.indexOf('\n'));
		System.out.println(msg1.indexOf("va"));
		System.out.println(msg1.indexOf('-'));
		System.out.println(msg1.indexOf("spring"));
		System.out.println("--------------------");
		System.out.println(msg1==""||msg1.equals(""));
		System.out.println(msg1.isEmpty());
		System.out.println(msg1.lastIndexOf('a'));
		System.out.println(msg1.startsWith("java"));
		System.out.println(msg1.endsWith("world"));
		System.out.println(msg1.substring(5));
		System.out.println(msg1.substring(1,3));
		System.out.println(msg1.substring(5,msg1.length()));
		System.out.println(msg5.toUpperCase());
		System.out.println(msg5.toLowerCase());
		System.out.println("--------------------");
		System.out.println(msg1.contains("java"));
		System.out.println(msg1.replace('j','J'));
		System.out.println(msg1.replace('a','A'));
		System.out.println(msg1.replace("va","vA"));
		System.out.println(msg1.replace("a w","aw"));
		//타겟팅을 잘하는 것이 중요하다
		System.out.println("***" + "    java world    "+"***");
		System.out.println("***" + "    java world    ".trim()+"***");		
		
	}

}
