package com.room802;

public class Ex14 {

	public static void main(String[] args) {
		// ¹è¿­
		int[] arr1=new int[4];
		arr1[0]=2;
		arr1[1]=4;
		arr1[2]=6;
		arr1[3]=8;
		
		int[] arr2=new int[]{2,4,6,8};
		
		int[] arr3={1,3,5,7};		

		System.out.println(arr3.length);
		System.out.println("-------------------------------------");
//		for(int i=0; i<4; i++){
//			System.out.println(arr3[i]);
//		}

		for(int i=0; i<arr3.length; i++){
			System.out.println(arr3[i]); 
		}
	}

}
