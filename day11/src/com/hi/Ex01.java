package com.hi;

public class Ex01 {

	public static void main(String[] args) {
		// 문자열
		String st1=null;	// null - 객체가 아니다
		st1="";				// 문자가 없는 문자열도 객체
		st1=new String();
		
		
		// 문자열의 비교 equals메서드		
		st1="java";
		String st2="java";
		System.out.println(st1.equals(st2));
		
		char[] arr1=st2.toCharArray();
		String st3=new String(arr1);

		byte[] arr2=st2.getBytes();
		String st4=new String(arr2);
	}

}
