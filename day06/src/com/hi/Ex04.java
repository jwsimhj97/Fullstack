package com.hi;

public class Ex04 {

	public static void main(String[] args) {
		// �޼���
		// ���� : �ڵ��� ����
		// public static �������ڷ���(ex:void) �޼����([�Ű�������...]){�����ڵ�;}
		// �޼���� - �����ҹ��ڷ� ����
		// ȣ���� �޾ƾ��� ���� (�ش� �޼���ΰ��� ���� �ϰ� ���ƿ´�)
		// ȣ���� ���� �Ű������� �޴� ���� ���������� ��ġ(����, ����, Ÿ��, ����)
		// �޼����(); - ȣ���
		System.out.println("���� main");
		int c=func01(1,2);
		System.out.println("c="+c);
	}
	//������ ����������Ŭ{}
	public static int func01(int a, int b){
		System.out.println("���Ӱ� ���� func01");
		int c=a+b;
		return c;
	}
	
	public static void func02(int a, String msg){
		System.out.println("���Ӱ� ���� func02"+(a+msg));
	}
}
