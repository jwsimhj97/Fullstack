package com.hi;

public class Ex05 {

	public static void main(String[] args) {
		// �ֹι�ȣ �˻��
		// �ֹι�ȣ�� �Է��ϼ���
		// >>>020501-4123456
		// ����� ���� 20�� �����Դϴ�.
		//////////////////////
		// �ֹι�ȣ�� �Է��ϼ���
		// >>>990501-1123456
		// ����� ���� 23�� �����Դϴ�.
		//////////////////////
		// �ֹι�ȣ�� �Է��ϼ���
		// >>>9905011123456
		// �Է��� �ٽ�Ȯ���ϼ��� (000000-0000000)
		//////////////////////
		// �ֹι�ȣ�� �Է��ϼ���
		// >>>990501-112345
		// �Է��� �����մϴ�(000000-0000000)
		//////////////////////
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		String num;
		String[] gender={"����", "����"};
		String userAge="";
		int year=2021;
		char changeY=2;
		int age=0;
		
		System.out.println("�ֹι�ȣ�� �Է��ϼ���");
		System.out.print(">>>");
		num = sc.nextLine();
		char[] arr=num.toCharArray();
		
//		userAge=arr[0];
//		if(arr[7]>2){
//			
//		}
		if(arr[0]>='2'){
			if(arr[7]>changeY){
				userAge="20"+arr[0]+arr[1];
			}else if(arr[7]<changeY){
				userAge="19"+arr[0]+arr[1];
			}
		}
//		age = Integer.parseInt(userAge);
//		System.out.println(year-age);
		System.out.println(userAge+"�� �Դϴ�");
		
//		System.out.println("����� ���� "+userAge+"�� �Դϴ�");
//		System.out.println("����� ���� "+age+"�� "+gender+"�Դϴ�");
		
		
	}

}
