package com.bit.ui;

import java.awt.*;

public class Ex01 {

	public static void main(String[] args) {
		// GUI
		// AWT - 운영체제 의존적 => 운영체제가 지원하지 않으면 안됨(ex 버튼에 그림 x)
		// SWING - 운영체제 종속성 없음 => 자바 직접 드로잉
		// 안드로이드와 비슷한 개념이라 앱쪽으로 가면 좋음
		// AWT에서 자체적으로 제공하지 않는 기능을 사용할려면 SWING을 통해 같이 사용할 수 있음
		
		// 배치관리자 - 컴포넌트 요소를 어떻게 화면에 위치시킬지를 위치와 크기를 알아서 결정
		new FlowLayout(); // 1. FlowLayout(); -> 중앙정렬, 컴포넌트 사이즈 내용에 따라 결정
		new GridLayout(); // 2. GridLayout(); 
		new BorderLayout(); // 3. BorderLayout();
		new CardLayout(); // 4. CardLayout();
		new GridBagLayout(); // 5. GridBagLayout();
		//배치 관리자 사용안함 // 6. 배치 관리자 사용
		//배치 관리자를 사용 안해야만 setSize() setLocation이 가능!
		//배치 관리자를 쓰면 컴포넌트의 위치가 상대적
		//				사용하지 않으면 컴포넌트의 위치가 절대적
		
		Frame f=new Frame();
		f.setSize(400,300);
		f.setLocation(300,300);
		f.setVisible(true);
		
		Panel p=new Panel();
		//p.setLayout(new FlowLayout());
		//p.setLayout(new GridLayout(2,1));//첫번째가 세로 라인 수
		//p.setLayout(new BorderLayout()); // 위치(동서남북)를 지정해야함 + 많이 사용함
		//p.setLayout(new CardLayout()); // 패널을 통해 화면전환에 사용함
		//p.setLayout(new GridBagLayout()); // 화면을 잘 사용할 수 있게 도와줌
		//ㄴ> 그러나 6개의 요소를 조절해야만함! 특히 '가중치'에 있어 엄청 중요함
		
		//배치관리자 사용 x
		//p.setLayout(null);
		Button btn1=new Button();
		btn1.setLabel("abcd");
		p.add(btn1);
		
		//보더레이아웃
		//p.add(btn1,BorderLayout.NORTH);
		
		Button btn2=new Button();
		btn2.setLabel("efg");
		p.add(btn2);
		
		//보더레이아웃
		//p.add(btn2,BorderLayout.SOUTH);
		
		f.add(p);
		
		
		/*
		//스윙으로 사용
		JFrame f=new JFrame();
		f.setSize(400,300);
		f.setLocation(300,300);
		f.setVisible(true);
		// X 누른다고 꺼지는거 아님 -> setEnVisible효과임
		// =>콘솔에서 돌아가고 있음
		 */
	}

}
