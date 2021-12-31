package com.hi;

public class Ex01 {
	public static void func01(Object a){}

	public static void main(String[] args) {
		// 래퍼 클래스 (랩핑(오토박싱)&언랩핑(언박싱))
		// 기본자료형의 클래스타입
		
		// 자료형    클래스
		// int	  -> Integer
		// double -> Double
		// byte   -> Byte
		
		int a=1;
		Integer b=new Integer(2222);
		System.out.println(b+1);
		
		func01(3333);
	}

}
