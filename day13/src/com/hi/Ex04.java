package com.hi;

// �������̽�
// ���� - public final static
// �޼��� - public abstract
interface Inter01{
	int su1=1111;		// public final static ����
	static int su2=2222;
	public static int su3=3333;
	public final static int su4=4444;

//	public Inter01(){}
	public abstract void func01();
	public void func02();
	void func03();		// public ���������� ��������
}

public class Ex04 {

	public static void main(String[] args) {
		System.out.println(Inter01.su4);
	}

}
