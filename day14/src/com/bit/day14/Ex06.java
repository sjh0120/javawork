package com.bit.day14;

public class Ex06 extends Thread {
	int su1, su2;
	static int sum;
	
	//synchronized (동기화)
	//현재 데이터를 사용하고 있는 해당 스레드를 제외하고
	//나머지 스레드들을 데이터에 접근 할 수 없도록 막는 개념
	
	//방법 1
	//synchronized가 꼭 붙어야만함!
	public synchronized static void func(int i) {
		int temp=sum+i;
		sum=temp;
	}
	
	/*
	//방법2
	public synchronized static void func(int su1, int su2) {
		for(int i=su1; i<=su2; i++) {
			int temp=sum+i;
			sum=temp;
			System.out.println(Thread.currentThread().getName());
		}
		//노는 범위
		//-> 메서드가 작동되고 return 되기 전까지
	}
	*/

	@Override
	public void run() {
		//func(su1, su2); //방법 2
		for (int i = su1; i <= su2; i++) {
			func(i); //방법 1
			
			/*
			int temp=sum+i;
			sum =temp;
			//이 과정에서 에러가 발생하므로 func하나로 묶어서 처리하면 됨!
			*/
			//System.out.println(sum); 과같은 작업을 통해서도
			//IO의 느린작업을 처리해서 누락 발생 빈도를 낮출수 있다!
			/*
			try {
				sleep(10);
				//스레드 전환에 있어 sleep(10)을 통해서
				//계산을 완료할 수 있는 시간을 부여
				//이를 통해 스레드 전환으로 인한 데이터 누락 발생 빈도를 낮출 수 있음!
				//sleep(10)이나 최소한의 시간을 통해 누락 발생 빈도 감소!
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			*/
			
			//메서드를 synchronized하는 것이 아닌
			//데이터 처리하는 부분에서 synchronized
			//방법 3
			//synchronized(key) {
//			synchronized(this) {//방법 4
//				//me1 과 me2는 서로 다른 키를 가지고 계산하기 떄문에 잘못된 값이 출력됨!
//				//즉 me1과 me2의 키가 서로 동일키 이도록 설정해야한다!
//				int temp=sum+i;
//				sum=temp;
//				//노는 범위가 synchronized 안
//			}
			System.out.println(Thread.currentThread().getName());
		}
	}
	//static Object key=new Object(); //방법4
//	Object key;//방법 5 static 때기
	/*
	동기화에 있어 Object 객체 key가 들어가게 되는데 이때
	모든 객체를 다 동기화를 할지, 특정 객체 끼리만 동기화를 할지 결정해야함
	화장실 개념으로 생각하면 좋음
	화장실에 들어갈때 key가 있으면 들어가지만, 다른사람이 key를 가지고 화장실을 쓰고 있다면,
	쓰던사람이 key를 반납해야만 사용가능!
	
	이떄 서로 다른 객체가 동기화를 따로 할 때에는
	서로 각각의 다른 key를 가지고 동기화를 진행하면 된다!
	 */

	public static void main(String[] args) {
		// sum=5050;
//		int su1=1;
//		int su2=100;
//		int sum=0;

		Ex06 me1 = new Ex06();
		Ex06 me2 = new Ex06();
		//방법 5
//		me1.key=me1;
//		me2.key=me1;
		//=> key값 동일
		
		
		
		//방법 5 끝
		me1.su1 = 1;
		me1.su2 = 50;
		me2.su1 = 51;
		me2.su2 = 100;

		me1.start();
		me2.start();
		try {
			me1.join();
			me2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("sum=" + sum/*(me1.sum + me2.sum)*/);

		//각각의 스레드가 sum을 가지고 있다면 스레드가 서로의 sum을 덮어 쓸 일이 없기 때문에
		//오류를 해결할 수 있음!
		//이 문제는 static int sum으로 인해 발생하는 문제가 아님!
		//static int 고정객체에 대한 접근을 처리하는데 있어 처리속도의 문제로 인해 발생하는 것!
		//동일객체 접근을 하도록 하고 고정객체 접근을 자제하면 됨!
		
		//static 을 빼버리면 각각의 객체로 인해 각각의 키를 갖기때문에
		//에러가 발생하게 된다
		
	}

}
