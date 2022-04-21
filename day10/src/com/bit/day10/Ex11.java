package com.bit.day10;
//static 일 경우!
class Lec11{
	/*
	public static <T>Box<T> func(T obj) {//오브젝트가 아닌 T를 받을때
		Box<T> box=new Box<T>(); //new Box<T>에서 코드에서
		//제네릭 선언을 하지 않고 이후에 밑에 객체 생성 
		//당시 제네릭을 결정하고자 한다
		//Box<T> box를 통해서 <T>의 지정을 미룬다.
		//이후 static Box<T>를 통해 box의 선언을 미루고,
		//메서드 호출 당시에 <T>를 지정해야 하기 때문에
		//Box<T>메서드 앞에 <T>를 선언해서 지정하라고 코드를 짜야한다.
		box.setSu(obj);
		return box;
	}
	*/
	
	public static <T>Box<T> func(T obj){
		Box<T> box=new Box<>();
		return box;
	}
	
}

public class Ex11 {

	public static void main(String[] args) {
		Box<BallPen> box=Lec11.<BallPen>func(new BallPen()); //fucn(new BallPen())의 <T>가 선언이 안되었기 때문에
		//Lec11.뒤에 <BallPen>으로 제네릭 선언을 해야하며
		//Box box의 제네릭은 위의 메서드에서 제네릭 선언을 하였기 때문에
		//Box<BallPen> box로 제네릭 지정을 해야한다
		
		//++
		//Box<BallPen> box=Lec11.func(new BallPen()); 또한 가능
		BallPen pen=box.getSu();
		pen.drow();

	}

}
