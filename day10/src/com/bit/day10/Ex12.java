package com.bit.day10;

//와일드 예제
class Lec12{
	/*
	//case 1
	public Box<? extends Pen> func() {
		return new Box<>();
	}
	*/
	
	
	/*
	//case 2 super BallPen을 통해 BallPen 제네릭의 위의 애들만 상속할 수 있도록 제네릭을 설정
	public Box<? super BallPen> func() {
		return new Box<>();
	}
	*/
	
	/*
	정리
	extends 를 통해 하위 상속요소들만 제네릭으로 들어올 수 있도록 제약을 걸며
	super를 통해 상위 상속요소들만 제네릭으로 들어올 수 있도록 제약을 건다	
	 */
	 
}


public class Ex12 extends Lec12{
	//와일드 예제
	/*
	위의 Lec12에서 Box 제네릭의 결정시점을 미룸
	이를 오버라이드를 통해 밑에서 제네릭을 결정함
	이것이 바로 와일드의 예제이며 제약을 걸 수 있음
	와일드(아무거나) 에서 BallPen으로 제약을 위해 -> Box<? extends Pen>를 쓰면 됨
	와일드를 통해 제약이 없어지지만 <? extends Pen>을 통해
	Pen을 상속받는 애들만 제네릭으로 들어오도록 제약을 한다!
	 */
	
	/*
	//case 1
	@Override
	public Box<BallPen> func(){
		return new Box<>();
	}
	*/
	
	
	/*
	//case 2
	@Override
	public Box<Pen> func(){
		return new Box<>();
	}
	*/
	
	/*
	<? extends Pen>으로 인해 Ex12는 제네릭으로 들어올 수 없다
	
	@Override
	public Box<Ex12> func(){
		return new Box<>();
	}
	*/
	

	public static void main(String[] args) {
		Box<Pen> box1=new Box();//new Box();객체는 제네릭이 안붙은것
		//그러나 Box<Pen> 캐스팅을 통해 제네릭이 붙은것과 같은 기능을 부여!
		//하지만
		Box box2=new Box<Pen>();
		//ㄴ>와 같이 new Box<Pen>();객체는 제네릭을 가지고 있지만
		//Box box2는 제네릭이 없는 상태로 캐스팅을 한것이기 때문에 제네릭을 넣으면 에러가 난다
		//box2.setSu(new Ex12());//box2는 제네릭이 없는 상태에 setsu를 썻기 때문에 안좋은 코드
		
		Box<Pen> box3=new Box<>(); 
		//ㄴ> 제네릭 추론을 통해 쓸수 있도록 사용한 코딩 => 제네릭을 사용한 코드!
		//ㄴㄴ>전자정부 프로그램에선 컴파일 버전이 낮기때문에 쓰면 에러가 발생함
		//jdk1.7버전 이상부터 가능한 기능
		//정상적인 문법이라 쓰면 좋음! 하지만 버전제약 생각하기
		
		//와일드
		Box<?> box4=new Box<>();
		//제네릭을 지금 결정하지 않겠다. -> 제네릭 결정을 미룬다
		//box4.setSu(new BallPen());//안됨
		//ㄴ> 현시점에서는 캐스팅해야만함
		//와일드 예제 참조하기

	}

}
