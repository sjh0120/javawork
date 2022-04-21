package com.bit.tcp.step4;

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

public class Server extends Thread {
	Socket sock;
	//
	ArrayList<String> chatLog=new ArrayList<>();
	
	//
	
	/*생성당시 sock를 받아오고, 받아온 sock기반 스레드 생성*/
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
		//PrintWriter pw=null;
		
		try {
			is=sock.getInputStream();
			os=sock.getOutputStream();
			isr=new InputStreamReader(is);
			osw=new OutputStreamWriter(os);
			br=new BufferedReader(isr);
			bw=new BufferedWriter(osw);
			//pw=new PrintWriter(bw);
			
			while(true) {
				String msg=br.readLine();
				chatLog.add(sock.getInetAddress().getHostAddress() + " : " +msg +"\n");
				bw.write(sock.getInetAddress().getHostAddress() + " : " +msg);
				System.out.println(chatLog.toString());
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
		Socket sock=null;
		try {
			while(true) {
				serv=new ServerSocket(5000);
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
