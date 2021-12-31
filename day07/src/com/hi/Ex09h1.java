package com.hi;

public class Ex09h1 {

	public static void main(String[] args) {
		// 학생성적관리프로그램(ver 0.2.0)
		// 1.입력 2.출력 0.종료 >
		// 입력은 총 3번
		// 3번의 입력이 끝나면 "입력이 끝났습니다" 문장 전달
		// 과목: 국어, 영어, 수학
		// 출력은 표로 출력
		// 종료하고 싶을 때 종료
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String title="학생성적관리프로그램(ver 0.2.0)";
		String bar="---------------------------------";
		System.out.println(title);
		
		String msg;
		int input=0;
		int trun=0;
		String[] kor=new String[3];
		String[] eng=new String[3];
		String[] math=new String[3];
		
		boolean boo=true;
		while(boo){
			System.out.println("1.입력 2.출력 0.종료 >");
			msg=sc.nextLine();
			input=Integer.parseInt(msg);
			if(input==1){
				if(){
					System.out.print("국어 >");
					sc.nextLine();
					System.out.print("영어 >");
					sc.nextLine();
					System.out.print("수학 >");
					sc.nextLine();
				}else{
					System.out.println("입력을 완료했습니다");
				}
			}else if(input==2){
				
			}else if(input==0){
				boo=false;
			}
		}
		
		
		
	}

}
