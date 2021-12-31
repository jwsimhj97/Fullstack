package com.hi;
// ���������� public > protected >= default > private 

class Lec10{
	public static int su1=1111;		// public  - ��� �������
	static int su2=2222;			// default - ������Ű�� ���ο����� �������
	private static int su3=3333;	// private - (�ش�Ŭ�������ο����� ���)
	protected static int su4=4444;	// protected - �ٸ���Ű���̴��� ����� ���ؼ��� �������/������Ű�� ���ο����� �������(default�� ����)

	// ���������� (�̱��� ����)
	private static Lec10 me=new Lec10();
	
	private Lec10(){}				// ��ü���� x
	
//	public static Lec10 getInstance(){	// getInstance
//		return new Lec10();
//	}
	
	public static Lec10 newInstance(){	// newInstance
		return me;
	}
	
	public static void func1(){
		System.out.println(su3);
	}
	static void func02(){}
	private static void func03(){}
}

public class Ex10 extends com.bit.Ex10{

	public static void main(String[] args) {
		// ����������
		Ex10 me=new Ex10();
		System.out.println(me.su1);
//		System.out.println(me.su2);
//		System.out.println(me.su3);
		System.out.println(me.su4);

		System.out.println("--------------------------------------");
		System.out.println(Lec10.su1);
		System.out.println(Lec10.su2);
//		System.out.println(Lec10.su3);
		System.out.println(Lec10.su4);

		System.out.println("--------------------------------------");
		System.out.println(com.bit.Ex10.su1);
//		System.out.println(com.bit.Ex10.su2);
//		System.out.println(com.bit.Ex10.su4);
		
		System.out.println("--------------------------------------");
		com.bit.Ex10 you;
		Lec10 you2;
//		you2=new Lec10();
		you2=Lec10.newInstance();
		System.out.println(you2);
//		you2=new Lec10();
		you2=Lec10.newInstance();
		System.out.println(you2);
	}

}


