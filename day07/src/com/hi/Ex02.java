package com.hi;

//call method
//static -> static				Ŭ������.�޼����();
//static -> non-static			��������.�޼����();
//non-static -> non-static		this.�޼����();
//non-static -> static			Ŭ������.�޼����();


public class Ex02 {
	public static void func01(){
		System.out.println("static method func01...");
		Ex02 me=new Ex02();
		me.func02();
	}
	public void func02(){
		System.out.println("non-static method func02...");
		this.func03();
		func01();
		return;
	}
	public void func03(){
		System.out.println("non-static method func03...");
	}

	public static void main(String[] args) {
		func01();
		Ex02 me;		//������ ���� 
		me=new Ex02();	//�������� - ��ü����
		me.func02();		//��������.�޼����() ȣ��
		Ex02 me2=new Ex02();
		me2.func03();
		me2.func02();
	}

}
