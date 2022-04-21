package com.bit.tcp.test;

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
import java.util.Scanner;

public class Client extends Frame implements Runnable{
	static TextArea ta;
	static BufferedReader br;
	
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
			String msg=br.readLine();
			if(ta.getText().equals("")) {
				ta.setText(msg);
			}else {
				ta.setText(ta.getText() + "\n" + msg);
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
			sock=new Socket("192.168.128.131",5000);
			is=sock.getInputStream();
			os=sock.getOutputStream();
			isr=new InputStreamReader(is);
			osw=new OutputStreamWriter(os);
			br=new BufferedReader(isr);
			bw=new BufferedWriter(osw);
			
			while(true) {
				String msg=sc.nextLine();
				bw.write(msg);
				bw.newLine();
				bw.flush();
				
				Thread thr=new Thread(me);
				thr.start();
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

	}

}
