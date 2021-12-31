package com.hi;
// Class scanner

import java.io.FileNotFoundException;

public class Ex08 {

	public static void main(String[] args) {		
		// io -> input을 쉽게 해주는 유틸이다
		java.util.Scanner sc=null;
//		sc=new java.util.Scanner(System.in);
//		sc=new java.util.Scanner("abcd\n한글\n1234");
//		System.out.println(sc.nextInt()+1);	// 숫자로 바로 받아서 계산할수있다(ex. 1234+1=1235) || nextLine()은 문자로받아 계산한다(ex.1234+1=12341)
//		System.out.println(sc.nextLine());	// nextLine()은 무조건 개행(\n)을 기준으로 구분해서 읽는다
//		System.out.println(sc.next());		// next()은 개행뿐아니라 띄어쓰기 같은부분(\t, \r, \n, ...)도 구분해서 읽는다
		
		
		
		
		
		sc=new java.util.Scanner("111\n한글1\n2222\n한글2");
		while(sc.hasNext()){
			System.out.println(sc.nextLine());
		}
	}

}
