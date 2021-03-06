package com.bit.web;

import java.io.*;
import java.net.*;

public class Server02 extends Thread {
	Socket sock;
	
	@Override
	public void run() {
		OutputStream os=null;
		BufferedOutputStream bos=null;
		//테스트 3
		InputStream is=null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		
		try {
			//테스트 3
			is=sock.getInputStream(); // <- 이거로 ex01.html이 안넘어 온다
			isr=new InputStreamReader(is);
			br=new BufferedReader(isr);
			
			/*
			while(true) {
				
				if(msg==null)break;
				System.out.println(msg);
			}
			br.close();
			isr.close();
			is.close();
			*/
			
			//많이 읽지말고 한줄만 읽어오기
			String msg=br.readLine();
			System.out.println("msg:" + msg);
			String[] arr=msg.split(" ");
			
			os=sock.getOutputStream();
			bos=new BufferedOutputStream(os);
			
			//header
			bos.write("HTTP/1.1 200 OK\r\n".getBytes()); // <- 여기서 추가인가?
//			bos.write("Content-Type: image/jpg; charset=utf-8\r\n".getBytes());
			bos.write("Content-Type: text/html; charset=utf-8\r\n".getBytes());
			
			// partition
			bos.write("\r\n".getBytes());
			// content
//			bos.write("<h1>hello web site~~</h1> <p>ㅁㄴㅇㄻㄴㅇㄹ</p>".getBytes());
			
			if(arr[1].contentEquals("/"))arr[1]="/index.html";
			
			FileInputStream is2=new FileInputStream("."+new File(arr[1]));
			
			while(true) {
				int su=is2.read();
				if(su==-1) break;
				bos.write(su);
			}
			
			
//			InputStream is=new FileInputStream(new File("img1.jpg"));
//			while(true) {
//				int su=is.read();
//				if(su==-1) break;
//				bos.write(su);
//			}
//			is.close();
			bos.flush();
			is2.close();
			br.close();
			isr.close();
			is.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bos!=null)bos.close();
				if(os!=null)os.close();
				//if(sock!=null)sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}

	public static void main(String[] args) {
		ServerSocket serv=null;
		Socket sock=null;
		
		try {
			serv=new ServerSocket(8080);
			
			while(true) {
				sock=serv.accept();
				Server02 me=new Server02();
				me.sock=sock;
				me.start();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(sock!=null)sock.close();
				if(serv!=null)serv.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
