package com.hi;

// �߻�Ŭ����
// �߻� �޼��带 0�� �̻� ���� Ŭ����
// ����� ���ؼ��� ��밡���ϰ� �ϰ���� Ŭ������ ����� ���
abstract class Lec01{
	int su=1111;
	
	// �߻�޼��� - ����(o), ����(x)
	// ��ü������ �ȵ�
	abstract void func01();
//	void func02(){}
	void func03(){
		System.out.println("func03 run...");
	}
}
public class Ex01t extends Lec01 { 
	void func01(){
		System.out.println("�������̵�� �޼���");
	}

	public static void main(String[] args) {
//		Lec01 lec=new Lec01();
//		lec.func01();
		Ex01t me=new Ex01t();
		me.func03();
		me.func01();
		
	}

}
