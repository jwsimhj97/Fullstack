package com.hi;

class Ex33{
	int a=1111;
//	public Ex33(){}  -> default������()�� �ڵ����� �����������
}

class Ex333{
	int b=2222;
	
	public Ex333(){
		System.out.println("������ ȣ��");
	}
}

class Ex3333{
	int c=3333;
	public Ex3333(int su){
		c=su;
		System.out.println(c+"r���� �Ű������� �޴� ������");
	}
}

public class Ex03 {

	public static void main(String[] args) {
		java.io.InputStream is=System.in;
		java.util.Scanner sc;
		// Ŭ������ �������
		// 1. �޼���
		// 2. ��������
		// 3. ������ -> ������ default������()�� �ڵ����� �����
		// public Ŭ������([�Ű�����]){������ �ڵ�;}
		Ex33 ex33;			//������ ����
		ex33=null;			//�ʱ�ȭ
		ex33=new Ex33();	
		
		
		
		Ex333 ex333=new Ex333();
//		Ex3333 ex3333=new Ex3333();
		Ex3333 ex3333=new Ex3333(1234);
	}

}
