package com.room802;

public class Ex18 {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String title="�л������������α׷�(ver 0.1.0)";
		System.out.println(title);
//		String kor1, eng1, math1, kor2, eng2, math2, kor3, eng3, math3;
		String[] kor=new String[3];
		String[] eng=new String[3];
		String[] math=new String[3];
		for(int i=0; i<3; i++){
			System.out.print(i+1+"�й� ����>");
			kor[i]=sc.nextLine();
			System.out.print(i+1+"�й� ����>");
			eng[i]=sc.nextLine();
			System.out.print(i+1+"�й� ����>");
			math[i]=sc.nextLine();
		}
		System.out.println("-------------------------------------------");
		System.out.println("�й�    |����    |����    |����");
		System.out.println("-------------------------------------------");
		System.out.println("1\t"+kor[0]+"\t"+eng[0]+"\t"+math[0]);
		System.out.println("1\t"+kor[1]+"\t"+eng[1]+"\t"+math[1]);
		System.out.println("1\t"+kor[2]+"\t"+eng[2]+"\t"+math[2]);
		System.out.println("-------------------------------------------");
	}

}
