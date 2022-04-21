package com.bit.tcp.test2;

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
import java.util.Scanner;

public class Server extends Thread{
	
	static ArrayList<String> ipList=new ArrayList<>();
	
	Socket sock;
	
	static ArrayList<BufferedWriter> chatLog=new ArrayList<>();
	
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
			chatLog.add(bw);
			
			while(true) {
				String msg=br.readLine();
				if(msg.startsWith(sock.getInetAddress().getHostAddress()+ " : " + "/r")){
					bw.write("귓속말 할 사람의 ip를 입력하세요");
					bw.newLine();
					bw.flush();
					msg=br.readLine();
					String[] arr=msg.split(" : ");
					if(ipList.contains(arr[1])) {
						bw.write("메세지>");
						bw.newLine();
						bw.flush();
					}else {
						bw.write("존재하지 않습니다");
						bw.newLine();
						bw.flush();
					}
					
				}else {
					for(int i=0; i<chatLog.size(); i++) {
						bw=chatLog.get(i);
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
				Socket sock=serv.accept();
				
				ipList.add(sock.getInetAddress().getHostAddress());
				Server me=new Server(sock);
				me.start();
				
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
