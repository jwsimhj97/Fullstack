package com.hi;

// 2. non-static ����Ŭ����(�ν��Ͻ� [����]Ŭ����)
class Outter04{
	public static int su1=1111;
	public int su2=2222;
	public Outter04(){
		
	}
	public static void func01(){
		Outter04 outt=new Outter04();
		Inner04 inn=outt.new Inner04();
		System.out.println(inn.su2);	//4444
	}
	public void func02(){
		Inner04 inn=new Inner04();
		System.out.println(inn.su2);	//4444
	}
	
	class Inner04{		// non-static�ȿ� static��� �Ұ�
		public final static int su3=3333;	//non-staticŬ�������� static ������ ��� - final�� ���̸� ������������ȴ�
		public int su2=4444;
		
		public Inner04(){}
		
//		public static void func03(){}
		
		public void func04(){
			System.out.println(su1);	//1111
			System.out.println(this.su2);	//4444	this.su2
			
		}
	}
}

public class Ex04 {

	public static void main(String[] args) {
		Outter04 outt=new Outter04();
//		Inner04 inn=outt.new Inner04();
//		System.out.println(inn.su2);

	}

}
