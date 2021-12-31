package com.hi;

public class Ex12 {

	public static void main(String[] args) {
		// 
		char[] arr1={'a', 'b', 'c', 'd'};
		String msg1=new String(arr1);
		System.out.println(msg1);
		
		char[] arr3=msg1.toCharArray();		// String => char 변환
		for(int i=0; i<arr3.length; i++){
			System.out.println(arr3[i]);
		}
		
		byte[] arr2={65, 66, 67, 68};
		String msg2=new String(arr2);
		System.out.println(msg2);
		byte[] arr4=msg2.getBytes();		// String => byte 변환
		for(int i=0; i<arr4.length; i++){
			System.out.println(arr4[i]);
		}
	}

}
