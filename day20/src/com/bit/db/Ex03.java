package com.bit.db;

import java.lang.reflect.Field;

//java reflection

class Lec03{
	int su=12345;
}

public class Ex03 {

	public static void main(String[] args) {
//		Lec03 obj=new Lec03();
//		System.out.println(obj.su);
		
		//1번 case
		try {
			//java reflection
			//오직 클래스의 정보만 가지고 new를 통한 객체 생성없이 객체 사용
			//Class clz=Class.forName("com.bit.db.Lec03"); // 밑과 같음
			Class <?> clz=Class.forName("com.bit.db.Lec03");
			Lec03 obj=(Lec03) clz.newInstance();
			System.out.println(obj.su);
			Field[] fields=clz.getDeclaredFields();
			System.out.println(fields[0].getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Class<Lec03> clz=Lec03.class;
			Lec03 obj=clz.newInstance();
			System.out.println(obj.su);
		} catch (InstantiationException e ) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		//최종적으로 클래스에 대한 이름 정보만 가지고,
		//클래스 안에 어떤 필드가 있는지,
		//어떤 메서드가 있는지를 추출해 낼 수 있다!
		try {
			Class <?> clz=Class.forName("com.bit.db.Lec03");
			Field[] fields=clz.getDeclaredFields();
			System.out.println(fields[0].getName());
		}  catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	
		
	}

}
