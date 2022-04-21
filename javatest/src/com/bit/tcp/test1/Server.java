package com.bit.tcp.test1;

import java.io.*;
import java.util.*;
import java.net.*;

//귓속말 구현
//특정인한테만 보내도록

public class Server extends Thread{
	Socket sock;
	
	static ArrayList<BufferedWriter> list=new ArrayList<BufferedWriter>();
	
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
		//모두가 쓰는 내용이 다 담겨서 모두한테 보여야 한다!
		
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
				for(int i=0; i<list.size(); i++) {
					bw=list.get(i);
					bw.write(msg);
					bw.newLine();
					bw.flush();
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
		
		try {
			serv=new ServerSocket(5000);
			while(true) {
				Socket sock=serv.accept();
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
