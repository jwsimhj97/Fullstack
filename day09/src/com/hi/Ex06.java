package com.hi;

public class Ex06 {

	public static void main(String[] args) {
		// �ֹι�ȣ �˻��
//		int age=0;
		int age=2021;
		char gender='��';
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("�ֹι�ȣ �˻��");
		System.out.print(">>>");
		String msg=sc.nextLine();
		
		
		char[] arr=msg.toCharArray();
		int year=2000+(arr[0]-'0')*10+(arr[1]-'0');
		if(arr[7]=='1'||arr[7]=='2'){
			year-=100;
		}
//		age=2021-year+1;
		age=age-year+1;
		if(arr[7]=='1'||arr[7]=='3'){
			gender='��';
		}
		if(arr[6]!='-'){
			System.out.println("'-'�� �ְ� �ٽ��Է��ϼ���!");
		}else{
			System.out.println("����� "+age+"��"+gender+"���Դϴ�");
		}
	}

}
