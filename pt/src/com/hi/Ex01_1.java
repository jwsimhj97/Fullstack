package com.hi;
// 학생성적관리프로그램(ver 0.4.1)
// 총원:3
// 1.입력 2.출력 0.종료 >
//// 기능추가
// 1.입력 2.출력 0.종료 >a(문자열입력시)
// 메뉴를 보시고 다시 선택해주세요
// 국어,영어,수학으로 총 3과목
// 학번에따라 출력

public class Ex01_1 {
	public static void main(String[] args){
		System.out.println("학생성적관리프로그램(ver 0.4.1)");
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String bar="-----------------------------------------";
		System.out.print("총원 : ");
		String input=sc.nextLine();
		int total=Integer.parseInt(input);
		
		int[] kor=new int[total];
		int[] eng=new int[total];
		int[] math=new int[total];
		int trun=0;
		int su=0;
		
		boolean boo=true;

		
		while(boo){					
			try{							
				System.out.print("1.입력 2.출력 0.종료 >");
				input=sc.nextLine();
				su=Integer.parseInt(input);					
				
				if(input.equals("0")){			//종료
					boo=false;
				}else if(input.equals("1")){	//입력
					if(trun<total){
						System.out.print("국어: ");
						kor[trun]=Integer.parseInt(sc.nextLine());
						System.out.print("영어: ");
						eng[trun]=Integer.parseInt(sc.nextLine());
						System.out.print("수학: ");
						math[trun]=Integer.parseInt(sc.nextLine());
					}else{
						System.out.println("입력이 완료되었습니다");
					}
	
					trun++;
				}else if(input.equals("2")){	//출력
					System.out.println(bar);
					System.out.println("학번\t국어\t영어\t수학");
					System.out.println(bar);
					for(int i=0; i<total; i++){
						System.out.println((i+1)+"\t"+kor[i]+"\t"+eng[i]+"\t"+math[i]);
					}
					System.out.println(bar);
				}else{
					System.out.println("메뉴를 보시고 다시 선택해주세요");
				}
			}catch(java.lang.NumberFormatException e){
				System.out.println("숫자를 입력하세요");
			}
		}
		System.out.println("프로그램을 종료합니다");
	}
}
