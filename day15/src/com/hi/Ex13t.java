package com.hi;

import java.util.Scanner;

public class Ex13t {

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
		System.out.println("�޸��� �����(ver 0.1.0)");
		Scanner sc=new Scanner(System.in);
		String input=null;
		String[]data=new String[0];
		while(true){
			System.out.print("1.�ۼ� 2.���� [3.����] 0.���� >");
			input=sc.nextLine();
			if(input.equals("1")){
				String[] temp=new String[data.length+1];
				System.arraycopy(data, 0, temp, 0, data.length);
				System.out.print(">> ");
				temp[temp.length-1]=sc.nextLine();
				data=temp;
			}else if(input.equals("2")){
				for(int i=0; i<data.length; i++){
					System.out.println(i+1+"\t"+data[i]);
				}
			}else if(input.equals("3")){
				 
			}else if(input.equals("0")){
				
			}
		}
	}

}
