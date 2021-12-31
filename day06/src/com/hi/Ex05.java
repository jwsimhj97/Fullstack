package com.hi;

public class Ex05 {
	public static void func01(){
		System.out.println("func01 start");
		func02();
		System.out.println("func01 end");
		return;
	}
	public static void main(String[] args) {
		System.out.println("main start");
		System.exit(0);
		func01();
		System.out.println("main end");
		return;
	}
	public static void func02(){
		System.out.println("func02()");
		return;
	}
}
