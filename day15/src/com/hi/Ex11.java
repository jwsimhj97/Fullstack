package com.hi;
// Class Arrays  -2-
import java.util.Arrays;

public class Ex11 {

	public static void main(String[] args) {
		int[] arr1={4,2,1,3,5};
		System.out.println(Arrays.toString(arr1));
		
		// sort
		Arrays.sort(arr1);		// 작은수부터 정렬
		System.out.println(Arrays.toString(arr1));
		
		// binarySearch -> sort선언 후 사용
		System.out.println(Arrays.binarySearch(arr1,4));	// 정렬된 값에서 검색한 값의 인덱스를 알려준다
		
		
		System.out.println("------------------");
		
		// fill
		int[] arr2=new int[5];
		Arrays.fill(arr2, 1234);	// 값을 채우다
		System.out.println(Arrays.toString(arr2));
		

		
	}

}
