package com.hi;

public class Ex06 {

	public static void main(String[] args) {
		// �迭�� ����
		int[] arr1=new int[]{1,3,5,7,9};
		int[] arr2=new int[]{1,3,5,7,9};
		System.out.println(arr1==arr2);
		
		// 1.�迭�� ��������
		int[] arr3=arr1;
		System.out.println(arr1==arr3);
		
		// 2.�迭�� ��������
		int[] arr4=new int[arr1.length];
		for(int i=0; i<arr1.length; i++){
			arr4[i]=arr1[i];
		}
		for(int i=0; i<arr4.length; i++){
			System.out.print(arr4[i]+",");
		}
	}

}
