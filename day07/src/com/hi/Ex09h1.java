package com.hi;

public class Ex09h1 {

	public static void main(String[] args) {
		// �л������������α׷�(ver 0.2.0)
		// 1.�Է� 2.��� 0.���� >
		// �Է��� �� 3��
		// 3���� �Է��� ������ "�Է��� �������ϴ�" ���� ����
		// ����: ����, ����, ����
		// ����� ǥ�� ���
		// �����ϰ� ���� �� ����
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String title="�л������������α׷�(ver 0.2.0)";
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
			System.out.println("1.�Է� 2.��� 0.���� >");
			msg=sc.nextLine();
			input=Integer.parseInt(msg);
			if(input==1){
				if(){
					System.out.print("���� >");
					sc.nextLine();
					System.out.print("���� >");
					sc.nextLine();
					System.out.print("���� >");
					sc.nextLine();
				}else{
					System.out.println("�Է��� �Ϸ��߽��ϴ�");
				}
			}else if(input==2){
				
			}else if(input==0){
				boo=false;
			}
		}
		
		
		
	}

}
