package com.hi;
// Class scanner

import java.io.FileNotFoundException;

public class Ex08 {

	public static void main(String[] args) {		
		// io -> input�� ���� ���ִ� ��ƿ�̴�
		java.util.Scanner sc=null;
//		sc=new java.util.Scanner(System.in);
//		sc=new java.util.Scanner("abcd\n�ѱ�\n1234");
//		System.out.println(sc.nextInt()+1);	// ���ڷ� �ٷ� �޾Ƽ� ����Ҽ��ִ�(ex. 1234+1=1235) || nextLine()�� ���ڷι޾� ����Ѵ�(ex.1234+1=12341)
//		System.out.println(sc.nextLine());	// nextLine()�� ������ ����(\n)�� �������� �����ؼ� �д´�
//		System.out.println(sc.next());		// next()�� ����Ӿƴ϶� ���� �����κ�(\t, \r, \n, ...)�� �����ؼ� �д´�
		
		
		
		
		
		sc=new java.util.Scanner("111\n�ѱ�1\n2222\n�ѱ�2");
		while(sc.hasNext()){
			System.out.println(sc.nextLine());
		}
	}

}
