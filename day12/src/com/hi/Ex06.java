package com.hi;

class Lec06{
	public int su=1111;
	public Lec06(int a){
		super();
		System.out.println("�θ����"+a);
	}
	
	public void func(){
		System.out.println("�θ�Ŭ������ ���");
	}
}

public class Ex06 extends Lec06{
	public int su=2222;
	public Ex06(){
		super(1234);		// this�� �����ڿ� �Ű��������� ��� default���� �ڵ����� �����µ�, super�� �ݵ�� default���� �����־���Ѵ�.
		System.out.println("�ڽĻ���");
	}
	public void func(){
		System.out.println("�ڽ�Ŭ������ ���"+super.su);
		super.func();	// super(=this���� ���) - �θ��� ��������
	}

	public static void main(String[] args) {
		Ex06 me=new Ex06();
		me.func();
	}

}
