package com.hi;
// Class Arrays  -2-
import java.util.Arrays;

public class Ex11 {

	public static void main(String[] args) {
		int[] arr1={4,2,1,3,5};
		System.out.println(Arrays.toString(arr1));
		
		// sort
		Arrays.sort(arr1);		// ���������� ����
		System.out.println(Arrays.toString(arr1));
		
		// binarySearch -> sort���� �� ���
		System.out.println(Arrays.binarySearch(arr1,4));	// ���ĵ� ������ �˻��� ���� �ε����� �˷��ش�
		
		
		System.out.println("------------------");
		
		// fill
		int[] arr2=new int[5];
		Arrays.fill(arr2, 1234);	// ���� ä���
		System.out.println(Arrays.toString(arr2));
		

		
	}

}
