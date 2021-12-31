package com.hi;

public class Ex06 {
	public static void func01(){
		System.out.println("매개변수가 없는 func01 실행");
	}
	
	public static void func01(int a){
		System.out.println("매개변수가 없는 또다른 메서드");
	}

	public static void main(String[] args) {
		// 메서드 오버로드 - (매개변수 유무, 갯수, 타입, 순서 달리하며 메서드명을 동일하게)
//		func01(12);
		System.out.println();
		System.out.println(1);
		System.out.println(3.14);
		System.out.println(true);
		System.out.println("문자열");
	}

}
