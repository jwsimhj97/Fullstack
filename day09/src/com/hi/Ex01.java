package com.hi;

public class Ex01 {

	public static void main(String[] args) {
		// �л������������α׷�(ver 0.4.1)
		// �ѿ�:3
		// 1.�Է� 2.���� 0.���� >
		//// ����߰�
		// 1.�Է� 2.���� 0.���� >a(���ڿ��Է½�)
		// �޴��� ���ð� �ٽ� �������ּ���
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String title="�л������������α׷� (ver 0.3.0)";
		System.out.println(title);
		
		String bar="-------------------------------------";
		String msg, total;
		int num=0;
		int turn=0;
		int abc=0;
		int su=0;

		System.out.print("�ѿ� >");
		total=sc.nextLine();
		su=Integer.parseInt(total);		

		String[] kor=new String[su];
		String[] eng=new String[su];
		String[] math=new String[su];
		String[] cnt={"a", "b", "c", "d"};
		
		boolean boo=true;
		while(boo){			
			System.out.print("1.�Է� 2.���� 0.���� >");
			msg=sc.nextLine();
			char[] abcd = msg.toCharArray();
			
			// msg -> char��ȯ 'a' = false
			// ����(0~9)�� ������ ������ = false
			if((abcd[0]=='0')){
				boo=false;
				System.out.println("�޴��� ���ð� �ٽ� �������ּ���");
			}
			
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
			}//else if(){
				//System.out.println("�޴��� ���ð� �ٽ� �������ּ���");
			//}
				else{
				System.out.println("�Է��� �߸��Ǿ����ϴ�");
			}
			
		}
		System.out.println("����Ǿ����ϴ�");

	}

}
