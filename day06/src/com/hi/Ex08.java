package com.hi;

public class Ex08 {

	public static void main(String[] args) {
		// ���� ���� �� ����(ver 0.1.0)
//		������ �����մϴ�
//		1.���� 2.���� 3.�� 0.���� >1
//		���:����, ��:����
//		�����ϴ�
//		1.���� 2.���� 3.�� 0.���� >2
//		���:����, ��:����
//		�̰���ϴ�
//		1.���� 2.���� 3.�� 0.���� >3
//		���:��, ��:��
//		�����ϴ�
//		���� 1�� 1�� 1��
//		�̿����ּż� �����մϴ�
//		public static void main(String[] args) {
	      // ���������� ����
	      java.util.Scanner sc=new java.util.Scanner(System.in);
	      String title="���� ���� �� ���� (ver 0.1.0)";
	      System.out.println(title);
	      System.out.println("������ �����մϴ�");
	      System.out.println();
	      
	      String[] game= {"����", "����" ,"��"};
	      int win, lose, draw;
	      win = 0;
	      lose = 0;
	      draw = 0;
	      
	      int gameMsg;
	      int su;
	      int com;
	      for(int i=0; i<3; i++) {
	         System.out.print("1.���� 2.���� 3.�� 0.���� >");
	         gameMsg=Integer.parseInt(sc.nextLine());
	         
	         su=gameMsg-1;
	         double comSu=Math.random();   
	         com=(int)(comSu * 3)+1;   
	         
	         
	         if(su==0) {
	            if(com==1) {
	               System.out.println("���:"+game[0]+" ��ǻ��:"+game[com-1]);
	               System.out.println("�����ϴ�");
	               draw++;
	            }else if(com==2) {
	               System.out.println("���:"+game[0]+" ��ǻ��:"+game[com-1]);
	               System.out.println("�����ϴ�");
	               lose++;
	            }else if(com==3) {
	               System.out.println("���:"+game[0]+" ��ǻ��:"+game[com-1]);
	               System.out.println("�̰���ϴ�");
	               win++;
	            }
	         }else if(su==1) {
	            if(com==1) {
	               System.out.println("���:"+game[1]+" ��ǻ��:"+game[com-1]);
	               System.out.println("�̰���ϴ�");
	               win++;
	            }else if(com==2) {
	               System.out.println("���:"+game[1]+" ��ǻ��:"+game[com-1]);
	               System.out.println("�����ϴ�");
	               draw++;
	            }else if(com==3) {
	               System.out.println("���:"+game[1]+" ��ǻ��:"+game[com-1]);
	               System.out.println("�����ϴ�");
	               lose++;
	            }
	         }else if(su==2) {
	            if(com==1) {
	               System.out.println("���:"+game[2]+" ��ǻ��:"+game[com-1]);
	               System.out.println("�����ϴ�");
	               lose++;
	            }else if(com==2) {
	               System.out.println("���:"+game[2]+" ��ǻ��:"+game[com-1]);
	               System.out.println("�̰���ϴ�");
	            
	            }
	         }
	      }

	      
	      System.out.println();
	      System.out.println("���� > "+win+"��"+draw+"��"+lose+"��");
	      System.out.println("�̿����ּż� �����մϴ�");
		
	}

}
