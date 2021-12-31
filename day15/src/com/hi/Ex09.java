package com.hi;
// Class StringTokenizer
public class Ex09 {

	public static void main(String[] args) {
//		String msg="java web db framework";
		String msg="java@web@db@@framework";
		String[] arr1=msg.split("@");
		for(int i=0; i<arr1.length; i++){
			System.out.println(arr1[i]);
		}
		
		System.out.println("-----------------");
		
		java.util.StringTokenizer token=new java.util.StringTokenizer(msg,"@");		// StringTokenizer는 비어있는 내용은 무시한다
		while(token.hasMoreElements()){
			System.out.println(token.nextToken());
		}
	}

}
