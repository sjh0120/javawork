package com.bit.ui;

import java.awt.*;

//스레드, io 평가
//04.06 오전

public class Ex02 extends Frame{
	
	public Ex02() {
		//Font font=new Font("폰트명", 스타일, 크기);
		Font font=new Font(Font.SANS_SERIF, Font.ITALIC,20);
		
		Panel p=new Panel();
		Button btn=new Button();
		btn.setLabel(new String("한글"));//한글 꺠짐 +ui상 그림으로 그려서 깨짐
		//런 컨피규레이션에서 -Dfile.encoding=MS949 입력해도됨
		btn.setFont(font);
		p.add(btn);
		Label la=new Label();
		la.setText("abcd");
		p.add(la);
		TextField tf=new TextField("",20);
		tf.setText("문자열\n다음글자");//내용이라서 한글 안꺠짐
		//텍스트필드에는 \n개행이 들어올 수 없다!
		p.add(tf);
		
		TextArea ta=new TextArea("내용을 작성\n다음글자", 5,10);
		p.add(ta);
		
		/*
		단순 체크박스
		Checkbox box1=new Checkbox("first", true);
		p.add(box1);
		Checkbox box2=new Checkbox("second");
		p.add(box2);
		Checkbox box3=new Checkbox("third");
		p.add(box3);
		*/
		//라디오 박스
		CheckboxGroup cbg=new CheckboxGroup();
		Checkbox box1=new Checkbox("first", cbg, true);
		p.add(box1);
		Checkbox box2=new Checkbox("second",cbg, false);
		p.add(box2);
		Checkbox box3=new Checkbox("third",cbg, false);
		p.add(box3);
		System.out.println(cbg.getCurrent().getState());
		
		Choice cho=new Choice();
		//cho.addItem("item1"); //또한 가능
		cho.add("item1");
		cho.add("item2");
		cho.add("item3");
		cho.add("item4");
		cho.add("item5");
		
		cho.select(2);//기본적으로 2번 인덱스가 설정
		System.out.println(cho.getSelectedIndex()); //선택되어져 있는 항목의 인덱스
		System.out.println(cho.getSelectedItem()); //선택되어져 있는 항목의 내용
		
		p.add(cho);
		
		List list=new List();
		list.add("aaaa");
		list.add("bbbb");
		list.add("cccc");
		list.add("dddd");
		list.add("eeee");
		System.out.println(list.getItem(1));
		System.out.println(list.getSelectedIndex());
		System.out.println(list.getSelectedItem());
		
		
		p.add(list);
		
		
		add(p);
		setSize(500,400);
		setLocation(100,100);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex02();
	}

}
