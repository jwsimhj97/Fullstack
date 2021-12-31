package com.hi;

class Lec08{	// class앞에 final선언은 아래의 자식 class에 상속이 거부된다
	public final void func2(){}	// 메서드의 final은 오버라이드 거부
}

public class Ex08 extends Lec08 {
//	public final static int su1=0;
	public final int su2;	// 초기화를 먼저 하지않았다면 후에 생성자에 필드값의 초기화를 선언해주어야한다.
	
	public Ex08(int su){
		su2=su;
	}

	public static void func(final int a){
		System.out.println(a);
	}
	
//	public void func2(){}
	
	public static void main(String[] args) {
		Lec08 you=new Lec08();
		you.func2();
		Ex08 me=new Ex08(1111);
		me.func2();
		
		// final
		final int a;	// 상수형 변수
		a=1111;
//		a=2222;
//		Ex08 me1=new Ex08(1111);
//		System.out.println(me1.su2);
//		Ex08 me2=new Ex08(2222);
//		System.out.println(me2.su2);
		func(1111);
		func(2222);
	}

}
