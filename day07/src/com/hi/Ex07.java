package com.hi;

public class Ex07 {
	//전역은 값이 주어지지 않는 경우 디폴트값을 갖는다
	public static int a=2222;
	public static int b;
	public static String msg=null;

	public static void main(String[] args) {
		// 지역 > 전역
		int a=1111;
		System.out.println(a);
		System.out.println(Ex07.a);
		System.out.println(b);
	}

}
