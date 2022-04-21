package com.bit.day06;

public class Ex15{

	public static void main(String[] args) {
		Object obj=new Object();
		System.out.println(obj.hashCode());
		System.out.println(obj.toString());
		Object obj2=new Object();
		
		Ex15 me=new Ex15();
		Object obj4=me.clone();
		Ex15 you=(Ex15)obj4;
		System.out.println(me.equals(you));
		System.out.println(me.hashCode());
		System.out.println(you.hashCode());
		int[] arr= {1,2};
		Object obj5=arr.clone();
		int[] arr2=(int[])obj5;
		for(int i=0; i<arr2.length; i++)
			System.out.println(arr2[i]);

	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
}
