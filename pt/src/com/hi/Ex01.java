package com.hi;

public class Ex01 {

 public static void main(String[] args) {
  // �л������������α׷��� �ۼ��ϼ���
  // ���α׷����� > �ѿ�:??
  // 1.�Է� 2.��� 0.���� >
  // ����, ����, ���� ��3����
  // ��½� ǥ�� ���
  // ���α׷������� �ܼ�
  // �Է¹����� ���������� �Է°� Ȯ���� �����Ѵ�
  // �������� ÷���Ѵ�
  
  java.util.Scanner sc=new java.util.Scanner(System.in);
  String title="�л������������α׷� (ver 0.4.1)";
  String bar="------------------------------";
  int total=0; // �л����ο�
  int button=0; // ������ �޴���ư
  int turn=0;  // �Է� �ݺ�Ƚ��
    
  System.out.println(title);
  System.out.print("�ѿ� : ");
  total=Integer.parseInt(sc.nextLine());
  
  int kor[]=new int[total];
  int eng[]=new int[total];
  int math[]=new int[total];
  
  boolean boo=true;  
  while(boo) {   
   System.out.print("1.�Է� 2.���� 0.���� >");
   button=Integer.parseInt(sc.nextLine());
   
   if(button==0) {
    boo=false;
   }else if(button==1) {
    turn++;
    if(turn<=total) {
     System.out.print(turn+"���л� ���� : ");
     kor[turn-1]=Integer.parseInt(sc.nextLine());
     System.out.print(turn+"���л� ���� : ");
     eng[turn-1]=Integer.parseInt(sc.nextLine());
     System.out.print(turn+"���л� ���� : ");
     math[turn-1]=Integer.parseInt(sc.nextLine());
    }else {
     System.out.println("�Է��� �Ϸ�Ǿ����ϴ�");
    }
   }else if(button==2) {
    System.out.println(bar);
    System.out.println("����\t����    | ����    | ����");
    System.out.println(bar);
    for(int su=0; su<total; su++) {
     System.out.println((su+1)+"���л�\t"+kor[su]+"\t"+eng[su]+"\t"+math[su]);
    }
   }else {
    System.out.println("�޴��� ���ð� �ٽ� �������ּ���");
   }
  }
  System.out.println("���α׷��� �����Ͽ����ϴ�");
  
  
 }

}
