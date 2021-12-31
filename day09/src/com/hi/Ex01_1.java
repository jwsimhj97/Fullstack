package com.hi;

public class Ex01_1 {

	public static void main(String[] args) {
		// 학생성적관리프로그램(ver 0.4.1)
		// 총원:3
		// 1.입력 2.보기 0.종료 >
		//// 기능추가
		// 1.입력 2.보기 0.종료 >a(문자열입력시)
		// 메뉴를 보시고 다시 선택해주세요
	      
      java.util.Scanner sc=new java.util.Scanner(System.in);
      String title="학생성적관리프로그램 (ver 0.4.1)";
      String bar="------------------------------";
      String totalInput;
      int total=0;   // 학생총인원
      int button=0;   // 선택한 메뉴버튼
      int turn=0;      // 입력 반복횟수
            
      System.out.println(title);
      System.out.print("총원 : ");
      totalInput=sc.nextLine();
      total=Integer.parseInt(totalInput);
      
      char[] arr=totalInput.toCharArray();
      char[] apb=new char[25];
      
      
      int kor[]=new int[total];
      int eng[]=new int[total];
      int math[]=new int[total];
      
      boolean boo=true;      
      while(boo) {         
         System.out.print("1.입력 2.보기 0.종료 >");
         button=Integer.parseInt(sc.nextLine());
         
         if(button==0) {
            boo=false;
         }else if(button==1) {
            turn++;
            if(turn<=total) {
               System.out.print(turn+"번학생 국어 : ");
               kor[turn-1]=Integer.parseInt(sc.nextLine());
               System.out.print(turn+"번학생 영어 : ");
               eng[turn-1]=Integer.parseInt(sc.nextLine());
               System.out.print(turn+"번학생 수학 : ");
               math[turn-1]=Integer.parseInt(sc.nextLine());
            }else {
               System.out.println("입력이 완료되었습니다");
            }
         }else if(button==2) {
            System.out.println(bar);
            System.out.println("과목\t국어    | 영어    | 수학");
            System.out.println(bar);
            for(int su=0; su<total; su++) {
               System.out.println((su+1)+"번학생\t"+kor[su]+"\t"+eng[su]+"\t"+math[su]);
            }
         }else {
            System.out.println("메뉴를 보시고 다시 선택해주세요");
         }
      }
      System.out.println("프로그램을 종료하였습니다");
      
      
	}

}
