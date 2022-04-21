package com.bit.day07;

//3. local클래스
class Outter16{
	static int su3=3333;
	int su4=4444;
	
	public void func01() {//따라서 func01이 매게변수 int a를 받고 실행된다면
		//public void func01(int su5){ 라고 1.8부터 쓰지만
		//int 앞에 final이 생략되어져 있는 것이다!
		
		//int su5=5555;
		//int su5=5555;를 작동하게 하는 예외인 경우
		final int su5=5555;//->항상 예외가 되는 경우는 final!
		//사용하기 위해서는 명시적으로 final을 작성해주는 것이 좋다!
		
		class Local{
			//로컬클래스는 Local까지 와야 작동되기 때문에 static일 수가 없다.
			//static int su1=1111; => 마찬가지로 불가능!
			//예외 -> 상수
			static final int su1=1111; //=>상수 예외!
			int su2=2222;
			
			Local(){}
			
			void func02() {
				System.out.println(su3);
				System.out.println(su4);
				//System.out.println(su5++);//=>정확히 따지면 올 수 없음
				
			}
		}
		//su5++;//=> 전제로 돌리는 클래스가 Outter16->Local->Outter16으로 바뀌기 때문에 말이 안되는 상황
		//따라서 su5++을 final로 선언해야한다!
		Local local=new Local();
		local.func02();//su5++은 위에 Local클래스로 언급 되어져 있지만
		//실질적 실행은 위에 줄에서 실행되기 때문에 안돌아간다.
	}
	
	/*static 경우
	public static void func01() {
		
		class Local{
			//로컬클래스는 Local까지 와야 작동되기 때문에 static일 수가 없다.
			//static int su1=1111; => 마찬가지로 불가능!
			//예외 -> 상수
			static final int su1=1111; //=>상수 예외!
			int su2=2222;
			
			Local(){}
			
			void func02() {
				System.out.println(su3);
				Outter16 outt=new Outter16();
				System.out.println(outt.su4);
			}
		}
	}
	*/

}

public class Ex16 {

	public static void main(String[] args) {
		

	}
}
