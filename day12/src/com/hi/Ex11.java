package com.hi;
// 예외처리

public class Ex11 {

	public static void main(String[] args) {
		int[] arr={1,3,5};
		try{
			System.out.println(arr[0]);
			System.out.println(arr[1]);
			System.out.println(arr[2]);
			System.out.println(arr[3]);		// 에러 발생 -> catch문으로 들어감
			System.out.println(arr[1]);		// 이후 실행 x
			System.out.println(arr[2]);
			System.out.println(arr[0]);
		}catch(java.lang.ArrayIndexOutOfBoundsException e){		// 매개변수
			
		}
		System.out.println("main end ...");
	}

}
