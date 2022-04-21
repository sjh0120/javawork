package com.bit.tcp.ftest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Server extends Thread{
	static Map<Integer,PrintStream> list=new HashMap<>();
	BufferedReader br;
	
	public Server(InputStream is) {
		br=new BufferedReader(new InputStreamReader(is));
		hashCode();
		//생성 당시 hashCode 할당
	}
	
	public void sayAll(String msg) {
		Iterator<Integer> ite=list.keySet().iterator();
		//전체한테 보내는 기능
		while(ite.hasNext()) {
			PrintStream ps=list.get(ite.next());
			ps.println(msg);
			ps.flush();
		}
		//전체한테 보내는 기능 끝
	}
	
	public void sayOne(String msg) {
		//귓속말
		PrintStream ps=list.get(hashCode());
		ps.println(msg);
		ps.flush();
			
		//귓속말
	}
	
	
	@Override
	public void run() {
		while(true) {
			try {
				String msg=br.readLine();
				if(msg.startsWith("#")) {
					sayAll(hashCode()+":"+msg.substring(1));
				}else {
					sayOne(hashCode()+":"+"귓말:" +msg.substring(msg.indexOf('#') + 1));
				}
				
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
			while(true) {
				sock=serv.accept();
				Server thr=new Server(sock.getInputStream());
				list.put(thr.hashCode(),new PrintStream(sock.getOutputStream()));
				thr.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
