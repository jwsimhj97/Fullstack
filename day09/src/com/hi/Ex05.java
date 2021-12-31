package com.hi;

public class Ex05 {

	public static void main(String[] args) {
		// 주민번호 검사기
		// 주민번호를 입력하세요
		// >>>020501-4123456
		// 당신은 올해 20세 여성입니다.
		//////////////////////
		// 주민번호를 입력하세요
		// >>>990501-1123456
		// 당신은 올해 23세 남성입니다.
		//////////////////////
		// 주민번호를 입력하세요
		// >>>9905011123456
		// 입력을 다시확인하세요 (000000-0000000)
		//////////////////////
		// 주민번호를 입력하세요
		// >>>990501-112345
		// 입력이 부족합니다(000000-0000000)
		//////////////////////
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		String num;
		String[] gender={"여성", "남성"};
		String userAge="";
		int year=2021;
		char changeY=2;
		int age=0;
		
		System.out.println("주민번호를 입력하세요");
		System.out.print(">>>");
		num = sc.nextLine();
		char[] arr=num.toCharArray();
		
//		userAge=arr[0];
//		if(arr[7]>2){
//			
//		}
		if(arr[0]>='2'){
			if(arr[7]>changeY){
				userAge="20"+arr[0]+arr[1];
			}else if(arr[7]<changeY){
				userAge="19"+arr[0]+arr[1];
			}
		}
//		age = Integer.parseInt(userAge);
//		System.out.println(year-age);
		System.out.println(userAge+"생 입니다");
		
//		System.out.println("당신은 올해 "+userAge+"세 입니다");
//		System.out.println("당신은 올해 "+age+"세 "+gender+"입니다");
		
		
	}

}
