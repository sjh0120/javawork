package com.bit.day10;

class Pen{
	void drow() {
		System.out.println("선을 긋는다");
	};
}

class Pencil extends Pen{
	
	void drow() {
		System.out.println("지워질 수 있는 선을 긋는다");
	}
	
}

class BallPen extends Pen{
	
	void drow() {
		System.out.println("지워지지 않는 선을 긋는다");
	}
}

//class Box{ 제너릭 없어서 에러남
class Box<T>{
	T su;
	
	void setSu(T su) {
		this.su=su;
	}
	T getSu() {
		return su;
	}
}

/*
class Box{
	Pen su;
		
	void setSu(Pen su) {
		this.su=su;
	}
	
	Pen getSu() {
		return su;
	}
}
*/

public class Ex09 {

	public static void main(String[] args) {
		Box<Pencil> box=new Box<Pencil>();//Box에 Pencil만 들어가게하겠다!
		//Box<Pen> box=new Box<Pen>();
		//으로 한다면 밑에 값은 Pen형태만 받게 해야한다.
		
		Pencil myPen1=new Pencil();
		BallPen myPen2=new BallPen();
		box.setSu(myPen1);
		
		Pencil obj=box.getSu();
		obj.drow();
		/*Box에 들어올 수 있는 것에 대한 제한을 Box안에서 하는 것이 아니라 Box에 입력할 때 제약하겠다
		Box box=new Box();
		
		Pen myPen1=new Pencil();
		Pen myPen2=new BallPen();
		//box.setSu(new Box()); Pencil과 BallPen을 둘다 부모타입 Pen으로 선언했기 때문에
		//Pen이 아닌 Box와 같은 다른객체가 오면 안됨!
		box.setSu(myPen1);
		
		Pen obj=box.getSu();
		obj.drow();
		*/
		
		
		/*
		Pencil myPen1=new Pencil();
		BallPen myPen2=new BallPen();
		box.setSu(myPen2);
		//box.setSu(myPen1); => 캐스팅 오류발생!
		
		BallPen obj=(BallPen)box.getSu();
		myPen2.drow();
		*/
		
		
		//제네릭을 사용한다는 것
		//-> 객체 생성 시점에 타입을 정하겠다는 의미!
		
		

	}

}
