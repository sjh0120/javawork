package com.bit.tcp.test1;

import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client extends Frame implements Runnable{
	static BufferedReader br=null;
	static TextArea ta;
	
	public Client() {
		ta=new TextArea();
		add(ta);
		setSize(400,500);
		setLocation(100,100);
		setVisible(true);
		//beforeTa=ta.getText();
		addWindowListener(listener);
	}
	
	WindowAdapter listener=new WindowAdapter() {
		@Override
		public void windowClosing(WindowEvent e) {
			dispose();
		}
	};
	
	@Override
	public void run() {
		while(true) {
			try {
				while(true) {
					String msg=ta.getText() +"\n" +br.readLine();
					ta.setText(msg);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Client me=new Client();
		Socket sock=null;
		InputStream is=null;
		OutputStream os=null;
		InputStreamReader isr=null;
		OutputStreamWriter osw=null;
		//br뺌
		BufferedWriter bw=null;
		
		
		try {
			sock=new Socket("192.168.128.132", 5000);
			is=sock.getInputStream();
			os=sock.getOutputStream();
			isr=new InputStreamReader(is);
			osw=new OutputStreamWriter(os);
			br=new BufferedReader(isr);
			bw=new BufferedWriter(osw);
			
			Thread thr=new Thread(me);
			thr.start();
			
			while(true) {
				String msg=sc.nextLine();
				bw.write(msg);
				bw.newLine();
				bw.flush();
				//읽으면 안됨
				//ui의 쓰레드를 통해서 읽는다?
				//->ui쓰레드는 ui가 작동하도록 냅둬야함
			}
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bw!=null)bw.close();
				if(br!=null)br.close();
				if(osw!=null)osw.close();
				if(isr!=null)isr.close();
				if(os!=null)os.close();
				if(is!=null)is.close();
				if(sock!=null)sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		ta.setText("채팅1");
		ta.setText(ta.getText() + "\n" + "채팅2");
		ta.setText(ta.getText() + "\n" + "채팅2");
		ta.setText(ta.getText() + "\n" + "채팅2");
		ta.setText(ta.getText() + "\n" + "채팅2");
		
	}
}
