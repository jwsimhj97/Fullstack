package com.hi;

import java.util.Scanner;

public class Ex13t2 {

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
		HiList list=new HiList();
		while(true){
			System.out.print("1.�ۼ� 2.���� 3.���� 0.���� >");
			input=sc.nextLine();
			if(input.equals("1")){
				System.out.print(">> ");
				input=sc.nextLine();
				list.add(input);
			}else if(input.equals("2")){
				for(int i=0; i<list.size(); i++){
					System.out.println(list.get(i));
				}
			}else if(input.equals("3")){
				input=sc.nextLine();
				list.remove(Integer.parseInt(input));
			}else if(input.equals("0")){
				
			}
		}
	}

}
