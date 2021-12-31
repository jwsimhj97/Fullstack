package com.hi;

public class Ex07 {

	private static String string;

	public static void main(String[] args) {
		// 주민번호 체크기능 (ver0.3.0)
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String input=sc.nextLine();
		char[] arr=input.toCharArray();
		char gender='여';
		int age=2021;
		int year=2000+(arr[0]-'0')*10+(arr[1]-'0');
		if(arr[7]=='1'||arr[7]=='3'){
			gender='남';
		}
		if(arr[7]=='1'||arr[7]=='2'){
			year-=100;
		}
		age=age-year+1;		
		System.out.println(age+"세 "+gender+"입니다");
		
		if(arr[6]!='-'){
			System.out.println("'-'넣어 다시입력하세요");
		}
		
//		int month=13;
//		if(arr[2]+arr[3]>month){
//			System.out.println("입력가능한 달을 초과했습니다");
//		}
	}

}
