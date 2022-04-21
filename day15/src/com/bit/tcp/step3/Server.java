package com.bit.tcp.step3;

import java.io.*;
import java.net.*;

public class Server extends Thread {
	//방법 1thr.sock=sock;
	Socket sock;
	
	//방법 2 Server 생성자 생성 당시 accept() 되어진 sock 받아오기
	public Server(Socket sock) {
		this.sock=sock;
	}
	
	@Override
	public void run() {
		InputStream is=null;
		OutputStream os=null;
		InputStreamReader isr=null;
		OutputStreamWriter osw=null;
		BufferedReader br=null;
		BufferedWriter bw=null;
		
		try {
			is=sock.getInputStream();
			os=sock.getOutputStream();
			isr=new InputStreamReader(is);
			osw=new OutputStreamWriter(os);
			br=new BufferedReader(isr);
			bw=new BufferedWriter(osw);
			
			while(true) {
				String msg=br.readLine();
				bw.write(sock.getInetAddress().getHostAddress() + " : " +msg);
				bw.newLine();
				bw.flush();
				
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

	public static void main(String[] args) {
		
		ServerSocket serv=null;
		
		try {
			serv=new ServerSocket(5000);
			while(true) {
				//몇명이 서버에 들어오는지 모르니까 accept를 무한 반복
				Socket sock=serv.accept();
				System.out.println(sock.getInetAddress().getHostAddress());
				//하나의 소켓당 하나의 스레드에서 작업을 해야만함
				//하나의 스레드는 accept를 해야하고
				//다른 스레드는 accept 되어진 정보를 처리해야함
				
				//접속이 들어올때 마다 스레드 객체 생성하고 스타트
				Server thr=new Server(sock);
				//thr.sock=sock;//방법1
				//생성전에 스레드의 소켓 필드에 accept된 소켓을 전달
				thr.start();
				//접속한 인원 수 만큼 스레드 생성
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(serv!=null)serv.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
