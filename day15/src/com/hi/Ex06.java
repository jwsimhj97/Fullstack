package com.hi;

interface Inter{
	void func02();
}
class Lec05{
	public static Inter func(){
		// �͸�Ŭ���� (�̸��� ���� Ŭ����)
		return new Inter(){
			public void func02(){		// ����Ŭ������ ȣ��
				System.out.println("�͸�Ŭ���� ���");
			}
		};
	}
}
public class Ex06 {

	public static void main(String[] args) {
		Inter inter=Lec05.func();
		inter.func02();
	}

}


//���� ���� �ܼ��ϰ� ����
//interface Inter{
//	void func02();
//}
//public class Ex06 {
//
//	// �͸�Ŭ���� (�̸��� ���� Ŭ����)
//	public static void main(String[] args) {
//		Inter inter=new Inter(){
//			public void func02(){		// ����Ŭ������ ȣ��
//				System.out.println("�͸�Ŭ���� ���");
//			}
//		};
//		inter.func02();
//	}
//
//}




//interface Inter{
//	void func02();
//}
//abstract class Lec06{
//	public void func01(){}
//	public abstract void func02();		// �������̵�
//}
//
//public class Ex06 {
//
//	// �͸�Ŭ���� (�̸��� ���� Ŭ����)
//	public static void main(String[] args) {
//		Lec06 inter=new Lec06(){
//			public void func02(){		// �������̵�
//				System.out.println("�͸�Ŭ���� ���");
//			}
//		};
//		inter.func01();
//		inter.func02();
//	}
//
//}
