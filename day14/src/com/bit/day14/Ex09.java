package com.bit.day14;

import java.net.*;

public class Ex09 {

	public static void main(String[] args) {
		String host = "naver.com";
		// byte[] arr= {(byte)223, (byte) 130, (byte) 200, 107};
		// byte[] arr= {};
		try {
//			InetAddress addr=InetAddress.getByName(host);
			// InetAddress addr=InetAddress.getByAddress(arr);
			InetAddress[] addrs = InetAddress.getAllByName(host);
			for (int i = 0; i < addrs.length; i++) {
				InetAddress addr = addrs[i];
				System.out.println(addr.getHostName());
				System.out.println(addr.getHostAddress());
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
