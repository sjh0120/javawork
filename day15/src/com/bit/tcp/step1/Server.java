package com.bit.tcp.step1;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		ServerSocket serve=null; //서버 소켓은 소켓아님
		//소켓은 IO가 찍히지만 서버 소켓은 IO가 안찍힘
		Socket sock=null;
		/*
		//client로 부터 받은 메세지 출력
		InputStream is=null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		*/
		
		//client로 메세지 보내기
		OutputStream os=null;
		PrintStream ps=null;
		
		try {
			serve=new ServerSocket(5000);//5000은 포트
			System.out.println("접속대기...");
			sock=serve.accept();//서버로 신호 오는 것을 대기
			System.out.println("누군가 들어옴...");
			
			InetAddress addr=sock.getInetAddress();
			System.out.println(addr.getHostAddress());
			
			//client로 메세지 보내기
			os=sock.getOutputStream();
			ps=new PrintStream(os);
			ps.println("ip : "+addr.getHostAddress()+"님의 접속을 환영합니다");
			
			/*
			//client로 부터 받은 메세지 출력
			is=sock.getInputStream();
			isr=new InputStreamReader(is);
			br=new BufferedReader(isr);
			System.out.println(br.readLine());
			
			br.close();
			isr.close();
			is.close();
			*/
			
			ps.close();
			os.close();
			sock.close();
			serve.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
