package com.bit.tcp.step4;

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

public class Client extends Frame{
	static TextArea ta;
	//String ipStr;
	
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
	
	

	public static void main(String[] args) {
		Socket sock=null;
		Scanner sc=new Scanner(System.in);
		Client me=new Client();
		//보내는 메세지, 받은 메세지
		String sendmsg;
		String recmsg;
		InetAddress inet=null;
		
		
		/*input output*/
		InputStream is=null;
		OutputStream os=null;
		InputStreamReader isr=null;
		OutputStreamWriter osw=null;
		BufferedReader br=null;
		BufferedWriter bw=null;	
		//PrintWriter pw=null;
		
		try {
			sock=new Socket("192.168.128.131", 5000);
			
			//input output 선언//
			is=sock.getInputStream();
			os=sock.getOutputStream();
			isr=new InputStreamReader(is);
			osw=new OutputStreamWriter(os);
			br=new BufferedReader(isr);
			bw=new BufferedWriter(osw);
			//pw=new PrintWriter(pw);
			
			while(true) {
				String before="";
				System.out.print("입력 > ");
				sendmsg=sc.nextLine();
				bw.write(sendmsg);
				bw.newLine();
				bw.flush();
				recmsg=br.readLine();
				before = ta.getText();
				if(before.equals("")) {
					ta.setText(recmsg);
				}else {
					ta.setText(before+"\n"+recmsg);
				}
			}
			
			/*
			while(true) {
				System.out.print("입력 > ");
				sendmsg=sc.nextLine();
				pw.write(sendmsg);
				pw.newLine();
				pw.flush();
				recmsg=br.readLine();
				ta.setText(recmsg);
				
			}
			*/
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
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
