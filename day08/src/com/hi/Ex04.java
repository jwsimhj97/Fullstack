package com.hi;

public class Ex04 {
//	public final int su;
	public int su3=4321;
	public static final int su5=5555;
//	public static final int su6;	//final�� ���� ���ٲ�=>�������� �־���Ѵ�.
	
	public Ex04(int su2){	//������
		su3=su2;				//�ʵ尪�� �ʱ�ȭ //su�� Ex04�� �޴� int su2�� ���� �ִ´�
		//su3=3333;				�̷������� �ʵ尪�� �ʱ�ȭ���� ���� �־��ִ°��� ����
	}

	public static void main(String[] args) {
		final int su4;		//final - ���� �ٲ��� ���ϴ� ������ ���	//su4�� ���������
		su4=4444;
//		su4=5555;
		System.out.println(su4);
		
		Ex04 me=new Ex04(1234);		
//		System.out.println(me.su);
		System.out.println(me.su3);
//		me.su3=54321;
//		su5=6666;
	}

}
