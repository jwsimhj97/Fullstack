package com.hi;

public class Ex13 {

	public static void main(String[] args) {
		// 주민번호 확인(ver 0.2.0)
		String input;
		int age = 2021;
		char gender='여';
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		input=sc.nextLine();
		char arr[]=input.toCharArray();
		
		int year=2000+(arr[0]-'0')*10+(arr[1]-'0');
		if(arr[7]=='1'||arr[7]=='2'){
			year-=100;
		}
		
		age=age-year+1;		
		if(arr[7]=='1'||arr[7]=='3'){
			gender='남';
		}
		
		System.out.println(age+"세 "+gender+"자입니다");
		
		
		
	}

}
