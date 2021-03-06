package com.bit.web;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server01 {
	static Logger log=Logger.getGlobal();
	
	public static void main(String[] args) {
		log.setLevel(Level.INFO);
		ServerSocket serv=null;
		Socket sock=null;
		OutputStream os=null;
		PrintStream ps=null;
		try {
			serv=new ServerSocket(8080);
			sock=serv.accept();
			InetAddress addr=sock.getInetAddress();
			log.info(addr.getHostAddress()+"님 접속이 들어왔습니다!");
			
			os=sock.getOutputStream();
			ps=new PrintStream(os);
			
			ps.print("HTTP/1.1 200 ok\n"); // HTTP 버전 1.1로 문서가 존재한다!(200 OK)
			ps.print("\n");
			ps.print("document content...");
			
			sock.close();
			
			/*
			ps.println("문서의 정보"); //문서 존재, 글자타입, 인코딩 유형 과 같은 다양한 정보들
			// ㄴ> 헤더정보(Header info) => 통신에서의 규칙(통신이 됐는지) 문서에대한 정보(문자 포맷, 인코딩 유형)
			ps.println(); // 문서의 정보와 문서의 내용을 구분하는 요소는 개행
			ps.println("document content...");
			*/
			
			sock=serv.accept();
			addr=sock.getInetAddress();
			log.info(addr.getHostAddress()+"님 접속이 들어왔습니다!");
			
			ps.close();
			os.close();
			sock.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
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
