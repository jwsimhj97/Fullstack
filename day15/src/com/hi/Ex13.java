package com.hi;

import java.util.Arrays;

// String �迭 �̿�
public class Ex13 {

	public static void main(String[] args) {
		// �޸��� �����(ver 0.1.0)
		// 1.�ۼ� 2.���� [3.����] 0.���� >1
		// >> �ȳ��ϼ���
		// 1.�ۼ� 2.���� [3.����] 0.���� >1
		// >> �ι�° ��
		// 1.�ۼ� 2.���� [3.����] 0.���� >2
		// ---------------------------------
		// 	�۹�ȣ | ����
		// ---------------------------------
		// 1		�ȳ��ϼ���
		// 2		�ι�° ��
		// ---------------------------------
		// 1.�ۼ� 2.���� [3.����] 0.���� >
		String input;
		System.out.println("�޸��� �����(ver 0.1.0)");
		java.util.Scanner sc=new java.util.Scanner(System.in);		
		
		String[] arr={"����", "�ۼ�", "����", "����"};
		String[] arr2=new String[10];
		int su;

//		System.arraycopy(arr, 0, arr2, 0, arr.length);
		
		while(true){			
			System.out.println("1.�ۼ� 2.���� [3.����] 0.���� >");
			input=sc.nextLine();
			su=Integer.parseInt(input);
			
			System.out.println(arr[su]);
			
			
			if(su==1){	//�ۼ�
				System.out.print(">> ");
				input=sc.nextLine();
				
			}else if(su==2){
				System.out.println(input);
			}
			
			
			
			
//			if(input==arr[0]){			//����
//				break;
//			}else if(input==arr[1]){	//�ۼ�
//				System.out.println(">> ");
//				input=sc.nextLine();
//			}else if(input==arr[2]){	//����
//				
//			}else if(input==arr[3]){	//����
//				
//			}
		}
		
		
		
		
//		try{
//			su=Integer.parseInt(input);
//			System.out.println(arr[su]);
//		}catch(Exception e){
//			e.printStackTrace();
//		}
		
		
		
	}

}
