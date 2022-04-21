package com.bit.day06;

class Lec08{
	static Lec08 obj=new Lec08(); //=>밑에 생성자가 private이므로 생성이 안됨
	//따라서 static 선언하고 해야함!
	private Lec08() {}
	
	public void func01() {
		System.out.println("기능");
	}
	
	
}

public class Ex08 {

	public static void main(String[] args) {
		Lec08 you1=Lec08.obj;
		you1.func01();
		Lec08 you2=Lec08.obj;
		you2.func01();
		System.out.println(you1==you2);//=>obj를 같은 주소를 사용한다
		//Lec08생성자가 private이기 때문에
		//Lec08 you1= new Lec08();으로 객체를 생성할 수 없음
		//따라서 Lec08안에 static을 통해 찍어낸 obj를 통해 같은 주소값을 가진 obj로만 작업이 가능하다
		//객체를 무지성으로 찍어내는 상황을 막을 수 있다.
		

	}

}
