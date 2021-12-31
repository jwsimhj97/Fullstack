package com.hi;

public class Ex08 {

	public static void main(String[] args) {
		// 가위 바위 보 게임(ver 0.1.0)
//		게임을 시작합니다
//		1.가위 2.바위 3.보 0.종료 >1
//		당신:가위, 컴:바위
//		졌습니다
//		1.가위 2.바위 3.보 0.종료 >2
//		당신:바위, 컴:가위
//		이겼습니다
//		1.가위 2.바위 3.보 0.종료 >3
//		당신:보, 컴:보
//		비겼습니다
//		전적 1승 1무 1패
//		이용해주셔서 감사합니다
//		public static void main(String[] args) {
	      // 가위바위보 게임
	      java.util.Scanner sc=new java.util.Scanner(System.in);
	      String title="가위 바위 보 게임 (ver 0.1.0)";
	      System.out.println(title);
	      System.out.println("게임을 시작합니다");
	      System.out.println();
	      
	      String[] game= {"가위", "바위" ,"보"};
	      int win, lose, draw;
	      win = 0;
	      lose = 0;
	      draw = 0;
	      
	      int gameMsg;
	      int su;
	      int com;
	      for(int i=0; i<3; i++) {
	         System.out.print("1.가위 2.바위 3.보 0.종료 >");
	         gameMsg=Integer.parseInt(sc.nextLine());
	         
	         su=gameMsg-1;
	         double comSu=Math.random();   
	         com=(int)(comSu * 3)+1;   
	         
	         
	         if(su==0) {
	            if(com==1) {
	               System.out.println("당신:"+game[0]+" 컴퓨터:"+game[com-1]);
	               System.out.println("비겼습니다");
	               draw++;
	            }else if(com==2) {
	               System.out.println("당신:"+game[0]+" 컴퓨터:"+game[com-1]);
	               System.out.println("졌습니다");
	               lose++;
	            }else if(com==3) {
	               System.out.println("당신:"+game[0]+" 컴퓨터:"+game[com-1]);
	               System.out.println("이겼습니다");
	               win++;
	            }
	         }else if(su==1) {
	            if(com==1) {
	               System.out.println("당신:"+game[1]+" 컴퓨터:"+game[com-1]);
	               System.out.println("이겼습니다");
	               win++;
	            }else if(com==2) {
	               System.out.println("당신:"+game[1]+" 컴퓨터:"+game[com-1]);
	               System.out.println("비겼습니다");
	               draw++;
	            }else if(com==3) {
	               System.out.println("당신:"+game[1]+" 컴퓨터:"+game[com-1]);
	               System.out.println("졌습니다");
	               lose++;
	            }
	         }else if(su==2) {
	            if(com==1) {
	               System.out.println("당신:"+game[2]+" 컴퓨터:"+game[com-1]);
	               System.out.println("졌습니다");
	               lose++;
	            }else if(com==2) {
	               System.out.println("당신:"+game[2]+" 컴퓨터:"+game[com-1]);
	               System.out.println("이겼습니다");
	            
	            }
	         }
	      }

	      
	      System.out.println();
	      System.out.println("전적 > "+win+"승"+draw+"무"+lose+"패");
	      System.out.println("이용해주셔서 감사합니다");
		
	}

}
