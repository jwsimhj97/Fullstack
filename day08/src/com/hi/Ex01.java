package com.hi;

public class Ex01 {

	public static void main(String[] args) {
		// �л������������α׷� (ver 0.3.0)
		// �ѿ� > 3
		// 1.�Է� 2.���� 0.���� >
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String title="�л������������α׷� (ver 0.3.0)";
		System.out.println(title);
		
		String bar="-------------------------------------";
		String msg, peo;
		int num=0;
		int turn=0;
		int abc=0;
		int su=0;

		System.out.print("�ѿ� >");
		peo=sc.nextLine();
		su=Integer.parseInt(peo);		

		String[] kor=new String[su];
		String[] eng=new String[su];
		String[] math=new String[su];
		
		boolean boo=true;
		while(boo){			
			System.out.print("1.�Է� 2.���� 0.���� >");
			msg=sc.nextLine();
			num=Integer.parseInt(msg);
			
			if(num==1){
				turn++;
				if(turn<=su){
					System.out.print(turn+"�л� ����");
					kor[turn-1]=sc.nextLine();
					System.out.print(turn+"�л� ����");
					eng[turn-1]=sc.nextLine();
					System.out.print(turn+"�л� ����");
					math[turn-1]=sc.nextLine();
				}else{
					System.out.println("�Է��� �Ϸ�Ǿ����ϴ�");
				}
			}else if(num==2){
				System.out.println(bar);
				System.out.println("����   | ����   | ����");
				System.out.println(bar);	
				
				for(int i=0; i<su; i++){
					System.out.println(kor[i]+"\t "+eng[i]+"\t "+math[i]);
				}
				
			}else if(num==0){
				boo=false;
			}else{
				System.out.println("�Է��� �߸��Ǿ����ϴ�");
			}
			
		}
		System.out.println("����Ǿ����ϴ�");
	}

}
