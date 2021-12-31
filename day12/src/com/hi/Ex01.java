package com.hi;
//상속목적 - 코드의 재사용 extends

//부모클래스, super class
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

//자식클래스
public class Ex01 extends Lec01{			// extends class명 - 상속 (Ex01이 Lec01을 상속받았음)
											// 상속받는 자식은 부모의 기능을 사용할수있지만 반대는 불가능
	public static void main(String[] args) {
		// 상속
		Lec01 you=new Lec01();
		System.out.println(you.su2+","+Lec01.su1);
		you.func02();
		Lec01.func01();
		
		Ex01 me=new Ex01();
		System.out.println(me.su2);
//		System.out.println(Ex01.su1);		// 문법상 틀리진않지만 사용x
		System.out.println(Lec01.su1);
		System.out.println(su1);
		me.func02();
//		Ex01.func01();						// 문법상 틀리진않지만 사용x
		Lec01.func01();
		func01();
		me.func03();
	}
	
	public void func03(){
		System.out.println("Ex01 func03():"+su2);
	}
}
