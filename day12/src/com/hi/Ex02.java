package com.hi;
//�޼��� �������̵�

class Lec02{
	public int su1=1111;
	public Lec02(){
		System.out.println("�θ�ü ����");
	}
	public void func01(){
		su1++;
		System.out.println("�θ�"+su1);
	}
}

public class Ex02 extends Lec02 {
	public int su1=2222;
	public Ex02(){
		System.out.println("�ڽİ�ü ����");
	}
	// �޼��� �������̵� : ����� ������
	public void func02(){
		System.out.println("�ڽ�");
		func01();
	}

	public static void main(String[] args) {
		Ex02 me=new Ex02();
		System.out.println(me.su1);
		me.func01();
		System.out.println(me.su1);
	}

}
