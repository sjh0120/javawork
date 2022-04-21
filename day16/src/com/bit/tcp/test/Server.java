package com.bit.tcp.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server extends Thread{
	Socket sock;
	static ArrayList<BufferedWriter> list=new ArrayList<>();
	
	public Server(Socket sock){
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
			list.add(bw);
			
			while(true) {
				String msg=br.readLine();
				String msg2="";
				String[] msgArr=msg.split("/");
				if(sock.getInetAddress().getHostAddress().equals(msgArr[0])) {
					is=sock.getInputStream();
					os=sock.getOutputStream();
					isr=new InputStreamReader(is);
					osw=new OutputStreamWriter(os);
					br=new BufferedReader(isr);
					bw=new BufferedWriter(osw);
					for(int i=1; i<msgArr.length; i++) msg2+=msgArr[i];
					bw.write("귓속말 : " + msg2);
					bw.newLine();
					bw.flush();
				}else {
					for(int i=0; i<list.size(); i++) {
						bw=list.get(i);
						bw.write(msg);
						bw.newLine();
						bw.flush();
					}
				}
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
		Socket sock=null;
		try {
			serv=new ServerSocket(5000);
			System.out.println("서버 개설 완료");
			while(true) {
				sock=serv.accept();
				Server thr=new Server(sock);
				thr.start();
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
