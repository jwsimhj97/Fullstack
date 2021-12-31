package com.hi;

// 인터페이스
// 변수 - public final static
// 메서드 - public abstract
interface Inter01{
	int su1=1111;		// public final static 생략
	static int su2=2222;
	public static int su3=3333;
	public final static int su4=4444;

//	public Inter01(){}
	public abstract void func01();
	public void func02();
	void func03();		// public 접근제한자 생략가능
}

public class Ex04 {

	public static void main(String[] args) {
		System.out.println(Inter01.su4);
	}

}
