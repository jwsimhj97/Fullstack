package com.hi;

// 1. static ����Ŭ����(���� [����]Ŭ����)
class Outter03{
	static class Inner03{
		public static int su1=3333;
		public int su2=4444;
		
		public Inner03(){}
		
		public static void func03(){
			Outter03 outt=new Outter03();
			System.out.println(outt.su2);	//2222	//su2�� ��ü�� ���߸� ��밡��
			System.out.println(su1);		//3333	System.out.println(Inner03.su1);
			System.out.println(Outter03.su1);//1111
			Inner03 inn=new Inner03();
			System.out.println(inn.su2);	//4444
		}
		public void func04(){
			Outter03 outt=new Outter03();
			System.out.println(outt.su2);	//2222
			System.out.println(su1);		//3333 Inner03.su1
			System.out.println(Outter03.su1);//1111
			System.out.println(su2);		//4444
		}
	}
	public static int su1=1111;
	public int  su2=2222;
	
	public Outter03(){}
	public static void func01(){
		System.out.println(su1);			//1111
		System.out.println(Outter03.su1);	//1111	//Outter03 ��������
		System.out.println(Inner03.su1);	//3333
		Inner03 inn=new Inner03();
		System.out.println(inn.su2);		//4444
	}
	public void func02(){
		System.out.println(Inner03.su1);	//3333
		Inner03 inn=new Inner03();
		System.out.println(inn.su2);		//4444
	}
}

public class Ex03 {

	public static void main(String[] args) {
		System.out.println(Outter03.su1);
		Outter03 outt=new Outter03();
		System.out.println(outt.su2);
		System.out.println("-----------");
		System.out.println(Outter03.Inner03.su1);	//Inner03�� Outter03�ȿ� �����Ƿ� �տ� ���� �������Ѵ�
		
		Outter03.Inner03 inn=new Outter03.Inner03();
		System.out.println(inn.su2);
	}

}
