package com.bit.tcp.ftest;

import java.awt.Frame;
import java.awt.TextArea;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client extends Frame implements Runnable {
	TextArea ta;
	InputStream is;
	
	public Client(InputStream is) {
		this.is=is;
		ta=new TextArea();
		add(ta);
		setSize(300,400);
		setLocation(100,100);
		setVisible(true);
	}
	@Override
	public void run() {
		BufferedReader br=null;
		
		try {
			br=new BufferedReader(new InputStreamReader(is));
			while(true) {
				String msg=br.readLine();
				ta.append("\n"+msg);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Socket sock=null;
		OutputStream os=null;
		PrintStream ps=null;
		
		try {
			sock=new Socket("localhost", 5000);
			os=sock.getOutputStream();
			ps=new PrintStream(os);
			
			Client me=new Client(sock.getInputStream());
			Thread thr=new Thread(me);
			thr.start();
			
			while(true) {
				System.out.println("모두 : #메세지, 귓말 : 번호#메세지");
				ps.println(sc.nextLine());
				//전체한테 보낼지
				//특정인한테 보낼지 결정해서 보내야함
				ps.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(ps!=null)ps.close();
				if(os!=null)os.close();
				if(sock!=null)sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
