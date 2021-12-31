package com.hi;

public class Ex06 {

	public static void main(String[] args) {
		// 주민번호 검사기
//		int age=0;
		int age=2021;
		char gender='여';
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("주민번호 검사기");
		System.out.print(">>>");
		String msg=sc.nextLine();
		
		
		char[] arr=msg.toCharArray();
		int year=2000+(arr[0]-'0')*10+(arr[1]-'0');
		if(arr[7]=='1'||arr[7]=='2'){
			year-=100;
		}
//		age=2021-year+1;
		age=age-year+1;
		if(arr[7]=='1'||arr[7]=='3'){
			gender='남';
		}
		if(arr[6]!='-'){
			System.out.println("'-'를 넣고 다시입력하세요!");
		}else{
			System.out.println("당신은 "+age+"세"+gender+"성입니다");
		}
	}

}
