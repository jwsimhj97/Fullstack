package com.hi;

public class Ex10 {

	public static void main(String[] args) {
		// ���ڿ� String
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String msg1;
		msg1="java";
		System.out.println(msg1);
		
		msg1="���ڿ�";
		System.out.println(msg1);
		
		msg1=new String("new String java");
		System.out.println(msg1);
		
		String msg2=new String("java");
		System.out.println(msg2);
		
		System.out.println(msg1==msg2);
		
		String msg3="java";
		String msg4="java";
		System.out.println(msg3==msg4);
		
//		String msg5=sc.nextLine();
//		System.out.println(msg3==msg5);
		int a=1;
		System.out.println("java1"=="java"+a);
		
		System.out.println(msg1);
	}

}
