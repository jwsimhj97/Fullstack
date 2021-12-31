package com.hi;

class Lec03{
	// 안주면 추론 타입
	public static <T> T func(T obj){
//		Object obj;
//		System.out.println(obj.toString());
		System.out.println(obj.getClass());
		return obj;
	}
}

public class Ex03 {

	public static void main(String[] args) {
//		String obj="java";
//		int obj=1234;
		String obj="java";
		String msg=Lec03.func(obj);
		
	}

}
