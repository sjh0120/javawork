package com.bit.day10;
//non-static인 경우
class Box2<A,B>{
	A su1;
	B su2;
	
	void setSu1(A su1) {
		this.su1=su1;
	}
	void setSu2(B su2) {
		this.su2=su2;
	}
	A getSu1() {
		return this.su1;
	}
	B getSu2(){
		return this.su2;
	}
	
	
	
}

public class Ex10 {

	public static void main(String[] args) {
		Box2<Pencil,BallPen> box=new Box2<Pencil,BallPen>();
		box.setSu1(new Pencil());
		box.setSu2(new BallPen());
		
		Pencil pen1=box.getSu1();
		BallPen pen2=box.getSu2();
		pen1.drow();
		pen2.drow();

	}

}
