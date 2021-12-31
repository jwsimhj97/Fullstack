package com.hi;

public class Ex06 {

	public static void main(String[] args) {
		// 배열의 복사
		int[] arr1=new int[]{1,3,5,7,9};
		int[] arr2=new int[]{1,3,5,7,9};
		System.out.println(arr1==arr2);
		
		// 1.배열의 얕은복사
		int[] arr3=arr1;
		System.out.println(arr1==arr3);
		
		// 2.배열의 깊은복사
		int[] arr4=new int[arr1.length];
		for(int i=0; i<arr1.length; i++){
			arr4[i]=arr1[i];
		}
		for(int i=0; i<arr4.length; i++){
			System.out.print(arr4[i]+",");
		}
	}

}
