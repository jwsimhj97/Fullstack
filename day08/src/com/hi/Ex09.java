package com.hi;

public class Ex09 {

	public static void main(String[] args) {
		// 깊은복사
		int[] arr1={1,3,5,7};
		int[] arr2;
		arr2=new int[arr1.length];
		
//		for(int i=0; i<arr2.length; i++){
//			arr2[i]=arr1[i];
//		}
		// 배열의 깊은복사 기능제공
		// System.arraycopy(원본참조변수, 원본시작index, 복사해갈대상변수, 대상의 시작index, 복사해갈갯수)
		System.arraycopy(arr1,  0, arr2, 0, arr2.length);
		
//		arr1[1]=10;
		for(int i=0; i<arr2.length; i++){
			System.out.print(arr2[i]+",");
		}
	}

}
