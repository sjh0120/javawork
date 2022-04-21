package com.bit.ui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex03{
	
	public Ex03() {
	}

	public static void main(String[] args) {
		
		Frame f=new Frame();
		
		
		//방법2
		WindowAdapter listener=new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("닫아라");
				f.dispose();
			}
		};
		
		//f.addWindowListener(listener);
		 
		
		//방법3
		//Frame f=new Frame();
		f.addWindowListener(listener);
		f.setSize(500,400);
		f.setLocation(100,100);
		f.setVisible(true);
		
		Panel p=new Panel();
		TextField tf=new TextField(20);
		
		
		ActionListener listener2=new ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent e) {
				//f.dispose();
				System.out.println(tf.getText());
			}
		};
		
		ActionListener listener3=new ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent e) {
				//f.dispose();
				tf.setText(" ");
				tf.setText("");
			}
		};
		tf.addActionListener(listener3);
		p.add(tf);
		Button btn=new Button("exit");
		btn.addActionListener(listener2);
		p.add(btn);
		
		f.add(p);
		//오류로 gui안나올때 다시그리도록 하는 명령어
		//3개 중 1개 넣어서 갱신되는거 쓰면됨
		//f.repaint();
		f.validate();
		//f.revalidate();
		
		
		System.out.println("main 종료예정...");
		
		/*
		//방법 1
		
		try {
			Thread.sleep(3000);
			f.dispose();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		*/
	}
	
	

}
