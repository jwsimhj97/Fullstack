package com.hi;

public class Ex07 {

	public static void main(String[] args) {
		// �л������������α׷�(ver 0.5.0)
		// �ѿ�>3
		// 1.�Է� 2.���� 0.���� > 1
		// �й�>
		// �̸�>
		// ���� >
		// ���� >
		// ���� >
		// 1.�Է� 2.���� 0.���� > 1
		
		java.util.Scanner sc=new java.util.Scanner(System.in);		
//		String[] info=new String[]{"�й�", "�̸�", "����", "����", "����"};
		int tot=0;
		int btn=0;
		int turn=0;
		int su=0;
		String msg;
		
		//���߹迭
		String[][] arr1;
		arr1=new String[5][];	
		arr1[0]=new String[]{"�й�"};
		arr1[1]=new String[]{"�̸�"};
		arr1[2]=new String[]{"����"};
		arr1[3]=new String[]{"����"};
		arr1[4]=new String[]{"����"};
		
		
		System.out.println("�л������������α׷�(ver 0.5.0)");		
		System.out.print("�ѿ� >");
		tot=Integer.parseInt(sc.nextLine());
		
		boolean boo=true;
		while(boo){
			System.out.print("1.�Է� 2.���� 0.���� >");
			btn=Integer.parseInt(sc.nextLine());
			
			if(btn==0){
				boo=false;
			}else if(btn==1){
				turn++;
				if(turn<=tot){					
					for(int i=0; i<arr1.length; i++){
						for(int j=0; j<arr1[i].length; j++){
							System.out.print(arr1[i][j]+" ");
							msg=sc.nextLine();
						}
					}
				}else{
					System.out.println("������ �Ϸ�Ǿ����ϴ�");
				}
			}else if(btn==2){
//				System.out.println(msg());
//				for(int i=0; i<su; i++){
//					System.out.println(msg(i));
//				}
			}
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�");
		
		
	}

}
