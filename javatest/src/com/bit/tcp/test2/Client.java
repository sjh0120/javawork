package com.bit.tcp.test2;

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
import java.net.Socket;
import java.util.ArrayList;
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
				if(!ta.getText().equals("")) {
					String msg = ta.getText() +"\n" +br.readLine();
					ta.setText(msg);
				}else {
					String msg= br.readLine();
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
		BufferedWriter bw=null;
		
		try {
			sock=new Socket("192.168.128.131", 5000);
			is=sock.getInputStream();
			os=sock.getOutputStream();
			isr=new InputStreamReader(is);
			osw=new OutputStreamWriter(os);
			br=new BufferedReader(isr);
			bw=new BufferedWriter(osw);
			
			Thread thr=new Thread(me);
			thr.start();
			
			while(true) {
				String msg="";
				msg=sc.nextLine();
				bw.write(sock.getInetAddress().getHostAddress() + " : " + msg);
				bw.newLine();
				bw.flush();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(sock!=null)sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
