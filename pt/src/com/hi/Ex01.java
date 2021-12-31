package com.hi;

public class Ex01 {

 public static void main(String[] args) {
  // 학생성적관리프로그램을 작성하세요
  // 프로그램시작 > 총원:??
  // 1.입력 2.출력 0.종료 >
  // 국어, 영어, 수학 총3과목
  // 출력시 표로 출력
  // 프로그램실행은 콘솔
  // 입력받을시 에러없도록 입력값 확인을 진행한다
  // 실행모습은 첨부한다
  
  java.util.Scanner sc=new java.util.Scanner(System.in);
  String title="학생성적관리프로그램 (ver 0.4.1)";
  String bar="------------------------------";
  int total=0; // 학생총인원
  int button=0; // 선택한 메뉴버튼
  int turn=0;  // 입력 반복횟수
    
  System.out.println(title);
  System.out.print("총원 : ");
  total=Integer.parseInt(sc.nextLine());
  
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
