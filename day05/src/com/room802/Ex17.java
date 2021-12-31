package com.room802;

public class Ex17 {

	public static void main(String[] args) {
		// 학생성적관리프로그램(ver 0.1.0)
		// 총 3명
		
		// 학생성적관리프로그램(ver 0.1.0)
		// 
		// 1학번 국어 > 90
		// 1학번 영어 > 80
		// 1학번 수학 > 70
		// 
		// 2학번 국어 > 91
		// 2학번 영어 > 81
		// 2학번 수학 > 71
		// 
		// 3학번 국어 > 92
		// 3학번 영어 > 82
		// 3학번 수학 > 72
		
		// 1. 입력 2.리스트 > 2
		// -----------------------------------
		// 학번		|국어	|영어	|수학
		// -----------------------------------
		// 1		90		80		70
		// 2		91		81		71
		// 3		92		82		72
		// -----------------------------------
		
		System.out.println("학생성적관리프로그램(ver 0.1.0)");
		System.out.println();
		java.util.Scanner sc=new java.util.Scanner(System.in);
//		int[] cla = new int[3];	
//		cla[0] = 국어;
//		cla[1] = 영어;
//		cla[2] = 수학;
//		for(int i=0; i<3; i++){
//			System.out.print("1학번"+"국어"+">");
//			String msg=sc.nextLine();
//			System.out.println(msg);
//		}
		System.out.print("1학번 국어>");
		String msg=sc.nextLine();
		System.out.print("1학번 영어>");
		String msg2=sc.nextLine();
		System.out.print("1학번 수학>");
		String msg3=sc.nextLine();
		System.out.print("2학번 국어>");
		String msg4=sc.nextLine();
		System.out.print("2학번 영어>");
		String msg5=sc.nextLine();
		System.out.print("2학번 수학>");
		String msg6=sc.nextLine();
		System.out.print("3학번 국어>");
		String msg7=sc.nextLine();
		System.out.print("3학번 영어>");
		String msg8=sc.nextLine();
		System.out.print("3학번 수학>");
		String msg9=sc.nextLine();

		System.out.println(msg);
		System.out.println(msg2);
		System.out.println(msg3);
		System.out.println(msg4);
		System.out.println(msg5);
		System.out.println(msg6);
		System.out.println(msg7);
		System.out.println(msg8);
		System.out.println(msg9);
		
		
		
		
		System.out.println("-------------------------------");
		System.out.println("국어   |영어   |수학");
		System.out.println("-------------------------------");
		int[] arr={90,80,70};
		int[] arr2={91,81,71};
		int[] arr3={92,82,72};
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+"\t"); 
		}
		System.out.println();
		for(int i=0; i<arr2.length; i++){
			System.out.print(arr2[i]+"\t"); 
		}
		System.out.println();
		for(int i=0; i<arr3.length; i++){
			System.out.print(arr3[i]+"\t"); 
		}
//		for(int i=0; i<3; i++){
//			System.out.println("1학번"+i);
//		}
		
		
		
	}

}
