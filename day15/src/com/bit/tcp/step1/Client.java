package com.bit.tcp.step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		Socket sock = null;
		InetAddress inet = null;
		/*
		//Server로 메세지 보내기
		OutputStream os = null;
		PrintStream ps = null;
		*/
		
		//Server로 부터 받은 메세지 읽기
		InputStream is=null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		
		try {
			inet = InetAddress.getByAddress(new byte[] { (byte)192,(byte)168,(byte)128,(byte)131 });
			sock = new Socket(inet, 5000);
			
			
			//Server로 부터 받은 메세지 읽기
			is=sock.getInputStream();
			isr=new InputStreamReader(is);
			br=new BufferedReader(isr);
			System.out.println(br.readLine());
			
			/*
			//Server로 메세지 보내기
			os = sock.getOutputStream();
			ps = new PrintStream(os);
			ps.println("내가 왔다...");
			
			ps.close();
			os.close();
			*/
			br.close();
			isr.close();
			is.close();
			sock.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
