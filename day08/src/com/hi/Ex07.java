package com.hi;

public class Ex07 {
	
	public static void func01(int[] arr2){
		arr2[1]=10;
//		arr2=new int[]{5,6,7,8};	새로운 객체를 생성했기때문에 func01(arr1)의 값에 영향을 주지않는다
	}
	
	public static void main(String[] args) {
		// 얕은 복사
		int[] arr1={2,4,6,8};
		
		func01(arr1);
		
		for(int i=0; i<arr1.length; i++){
			System.out.println(arr1[i]);
		}
	}

}
