package com.hi;

import java.util.Arrays;

// Class Arrays  -1-
public class Ex10 {

	public static void main(String[] args) {
		String[] arr1={"java", "web", "database", "framework"};
		
		System.out.println(java.util.Arrays.toString(arr1));
		
		//배열의 복사
//		String[] arr2=new String[arr1.length];
//		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
//		arr1[2]="db";
//		System.out.println(java.util.Arrays.toString(arr1));
//		System.out.println(java.util.Arrays.toString(arr2));
		
		
		// copyOf
		String[] arr2=Arrays.copyOf(arr1,  arr1.length);
		arr1[2]="db";
		System.out.println(java.util.Arrays.toString(arr1));
		System.out.println(java.util.Arrays.toString(arr2));
		
		
		// copyOfRange
//		String[] arr2=Arrays.copyOfRange(arr1, 1, 3);		//arraycopy
//		arr1[2]="db";
//		System.out.println(java.util.Arrays.toString(arr1));
//		System.out.println(java.util.Arrays.toString(arr2));
	}

}
