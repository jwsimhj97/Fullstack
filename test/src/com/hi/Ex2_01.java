package com.hi;

import java.net.InetAddress;


public class Ex2_01 {

	public static void main(String[] args) {
		 try{
	            // �ڽ��� IP ���
	            InetAddress local = InetAddress.getLocalHost();
	            System.out.println("�� IP ���� :" + local.getHostAddress());
	             
	        }catch(Exception e){
	            // ���ܰ� �߻����� �� ������ ������ ���
	            System.out.println(e.getMessage());
	        }
	}

}