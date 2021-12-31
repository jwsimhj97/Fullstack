package com.hi;

public class Ex04 {

	public static void main(String[] args) {
		// 메서드
		// 의의 : 코드의 재사용
		// public static 리턴의자료형(ex:void) 메서드명([매개변수들...]){구현코드;}
		// 메서드명 - 영문소문자로 시작
		// 호출을 받아야지 실행 (해당 메서드로가서 일을 하고 돌아온다)
		// 호출한 측의 매개변수와 받는 측의 변수선언이 일치(유무, 갯수, 타입, 순서)
		// 메서드명(); - 호출식
		System.out.println("기존 main");
		int c=func01(1,2);
		System.out.println("c="+c);
	}
	//변수의 라이프사이클{}
	public static int func01(int a, int b){
		System.out.println("새롭게 만든 func01");
		int c=a+b;
		return c;
	}
	
	public static void func02(int a, String msg){
		System.out.println("새롭게 만든 func02"+(a+msg));
	}
}
