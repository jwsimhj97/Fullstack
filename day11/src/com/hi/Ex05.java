package com.hi;

public class Ex05 {

	public static void main(String[] args) {
		// �л������������α׷� (ver 0.6.0)
		// String data;
		// �ڷ����� ��������� �й��� �ߺ����ȵ�
		// 1.���� 2.�Է� 3.���� (4.����) 0.���� >  
		// ����replace �� ����substring
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String input;
//		input=sc.nextLine();
//		inputSu=Integer.parseInt(input);
		
		System.out.println("�л������������α׷� (ver 0.6.0)");
		
		String[] sub=new String[]{"����", "����", "����"};		//����
		String[] result=new String[3];						//�����
		
		boolean boo=true;
		while(boo){
			System.out.print("1.���� 2.�Է� 3.���� 0.���� >");
			input=sc.nextLine();
			
			if(input.equals("0")){
				//����
				boo=false;
			}else if(input.equals("1")){
				//����
				System.out.println("-------------------------");
				System.out.println("����\t����\t����");
				System.out.println("-------------------------");
				System.out.println(result[0]+"\t"+result[1]+"\t"+result[2]);
			}else if(input.equals("2")){
				//�Է�
				System.out.print(sub[0]+"> ");
				input=sc.nextLine();
				result[0]=input;
				System.out.print(sub[1]+"> ");
				input=sc.nextLine();
				result[1]=input;
				System.out.print(sub[2]+"> ");
				input=sc.nextLine();
				result[2]=input;
			}else if(input.equals("3")){
				//����
				         
//				if()
				result[0]=result[0].substring(2);
				
			}else{
				
			}
		}
		System.out.println("���α׷��� �����߽��ϴ�");
	}

}
