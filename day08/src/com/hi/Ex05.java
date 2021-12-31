package com.hi;

public class Ex05 {

	public static void main(String[] args) {
		// 배열 - 배열변수는 참조변수
//		int[] arr1;					// [배열]변수의 선언
		int[] arr1=null;			// 참조변수 초기화	
		arr1=new int[3];			// [배열]의 초기화
		System.out.println(arr1);
//		Ex05 me=new Ex05();
//		System.out.println(me);
		arr1[0]=2;					// 디폴트값변경(o) 변수초기화(x) - 이유: 디폴트값이 이미 들어가있음
		arr1[1]=4;
		arr1[2]=6;
		int[] arr2;					// 선언
		arr2=new int[]{2,4,6};		// 초기화 : []안에 값을 미리 넣어두지 않았으므로 {}의 값들의 갯수를 갖는다
		int[] arr3;
		arr3=new int[3];
		
		for(int i=0; i<arr1.length; i++){//length - 객체의 맴버변수
			System.out.print(arr1[i]+",");
		}
		System.out.println();
		for(int i=0; i<arr2.length; i++){
			System.out.print(arr2[i]+",");
		}
		System.out.println();
		for(int i=0; i<arr3.length; i++){
			System.out.print(arr3[i]+",");
		}
	}

}
