package com.room802;

public class Ex17 {

	public static void main(String[] args) {
		// �л������������α׷�(ver 0.1.0)
		// �� 3��
		
		// �л������������α׷�(ver 0.1.0)
		// 
		// 1�й� ���� > 90
		// 1�й� ���� > 80
		// 1�й� ���� > 70
		// 
		// 2�й� ���� > 91
		// 2�й� ���� > 81
		// 2�й� ���� > 71
		// 
		// 3�й� ���� > 92
		// 3�й� ���� > 82
		// 3�й� ���� > 72
		
		// 1. �Է� 2.����Ʈ > 2
		// -----------------------------------
		// �й�		|����	|����	|����
		// -----------------------------------
		// 1		90		80		70
		// 2		91		81		71
		// 3		92		82		72
		// -----------------------------------
		
		System.out.println("�л������������α׷�(ver 0.1.0)");
		System.out.println();
		java.util.Scanner sc=new java.util.Scanner(System.in);
//		int[] cla = new int[3];	
//		cla[0] = ����;
//		cla[1] = ����;
//		cla[2] = ����;
//		for(int i=0; i<3; i++){
//			System.out.print("1�й�"+"����"+">");
//			String msg=sc.nextLine();
//			System.out.println(msg);
//		}
		System.out.print("1�й� ����>");
		String msg=sc.nextLine();
		System.out.print("1�й� ����>");
		String msg2=sc.nextLine();
		System.out.print("1�й� ����>");
		String msg3=sc.nextLine();
		System.out.print("2�й� ����>");
		String msg4=sc.nextLine();
		System.out.print("2�й� ����>");
		String msg5=sc.nextLine();
		System.out.print("2�й� ����>");
		String msg6=sc.nextLine();
		System.out.print("3�й� ����>");
		String msg7=sc.nextLine();
		System.out.print("3�й� ����>");
		String msg8=sc.nextLine();
		System.out.print("3�й� ����>");
		String msg9=sc.nextLine();

		System.out.println(msg);
		System.out.println(msg2);
		System.out.println(msg3);
		System.out.println(msg4);
		System.out.println(msg5);
		System.out.println(msg6);
		System.out.println(msg7);
		System.out.println(msg8);
		System.out.println(msg9);
		
		
		
		
		System.out.println("-------------------------------");
		System.out.println("����   |����   |����");
		System.out.println("-------------------------------");
		int[] arr={90,80,70};
		int[] arr2={91,81,71};
		int[] arr3={92,82,72};
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+"\t"); 
		}
		System.out.println();
		for(int i=0; i<arr2.length; i++){
			System.out.print(arr2[i]+"\t"); 
		}
		System.out.println();
		for(int i=0; i<arr3.length; i++){
			System.out.print(arr3[i]+"\t"); 
		}
//		for(int i=0; i<3; i++){
//			System.out.println("1�й�"+i);
//		}
		
		
		
	}

}
