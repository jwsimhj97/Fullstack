package com.hi;
// �л������������α׷�(ver 0.4.1)
// �ѿ�:3
// 1.�Է� 2.��� 0.���� >
//// ����߰�
// 1.�Է� 2.��� 0.���� >a(���ڿ��Է½�)
// �޴��� ���ð� �ٽ� �������ּ���
// ����,����,�������� �� 3����
// �й������� ���

public class Ex01_1 {
	public static void main(String[] args){
		System.out.println("�л������������α׷�(ver 0.4.1)");
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String bar="-----------------------------------------";
		System.out.print("�ѿ� : ");
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
				System.out.print("1.�Է� 2.��� 0.���� >");
				input=sc.nextLine();
				su=Integer.parseInt(input);					
				
				if(input.equals("0")){			//����
					boo=false;
				}else if(input.equals("1")){	//�Է�
					if(trun<total){
						System.out.print("����: ");
						kor[trun]=Integer.parseInt(sc.nextLine());
						System.out.print("����: ");
						eng[trun]=Integer.parseInt(sc.nextLine());
						System.out.print("����: ");
						math[trun]=Integer.parseInt(sc.nextLine());
					}else{
						System.out.println("�Է��� �Ϸ�Ǿ����ϴ�");
					}
	
					trun++;
				}else if(input.equals("2")){	//���
					System.out.println(bar);
					System.out.println("�й�\t����\t����\t����");
					System.out.println(bar);
					for(int i=0; i<total; i++){
						System.out.println((i+1)+"\t"+kor[i]+"\t"+eng[i]+"\t"+math[i]);
					}
					System.out.println(bar);
				}else{
					System.out.println("�޴��� ���ð� �ٽ� �������ּ���");
				}
			}catch(java.lang.NumberFormatException e){
				System.out.println("���ڸ� �Է��ϼ���");
			}
		}
		System.out.println("���α׷��� �����մϴ�");
	}
}
