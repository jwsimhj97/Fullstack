package com.hi;
//��Ӹ��� - �ڵ��� ���� extends

//�θ�Ŭ����, super class
class Lec01{
	public static int su1=1111;
	public int su2=2222;	
	public static void func01(){
		System.out.println("Lec01 func01()...");
	}
	
	public void func02(){
		System.out.println("Lec01 non-static func02()...");
	}
}

//�ڽ�Ŭ����
public class Ex01 extends Lec01{			// extends class�� - ��� (Ex01�� Lec01�� ��ӹ޾���)
											// ��ӹ޴� �ڽ��� �θ��� ����� ����Ҽ������� �ݴ�� �Ұ���
	public static void main(String[] args) {
		// ���
		Lec01 you=new Lec01();
		System.out.println(you.su2+","+Lec01.su1);
		you.func02();
		Lec01.func01();
		
		Ex01 me=new Ex01();
		System.out.println(me.su2);
//		System.out.println(Ex01.su1);		// ������ Ʋ���������� ���x
		System.out.println(Lec01.su1);
		System.out.println(su1);
		me.func02();
//		Ex01.func01();						// ������ Ʋ���������� ���x
		Lec01.func01();
		func01();
		me.func03();
	}
	
	public void func03(){
		System.out.println("Ex01 func03():"+su2);
	}
}
