package com.hi;
// ���
import java.net.*;
import java.util.Arrays;

public class Ex16 {

	public static void main(String[] args) {
		InetAddress net=null;
		InetAddress[] nets=null;
		
		try {
//			net=InetAddress.getByName("naver.com");
			nets=InetAddress.getAllByName("naver.com");
			
//			System.out.println(net.getHostName());
//			System.out.println(net.getHostAddress());
//			byte[] arr1=net.getAddress();
//			System.out.println(Arrays.toString(arr1));
			
			for(int i=0; i<nets.length; i++){
				net=nets[i];
				System.out.println(net.getHostName());
				System.out.println(net.getHostAddress());
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
