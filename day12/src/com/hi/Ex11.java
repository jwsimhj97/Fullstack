package com.hi;
// ����ó��

public class Ex11 {

	public static void main(String[] args) {
		int[] arr={1,3,5};
		try{
			System.out.println(arr[0]);
			System.out.println(arr[1]);
			System.out.println(arr[2]);
			System.out.println(arr[3]);		// ���� �߻� -> catch������ ��
			System.out.println(arr[1]);		// ���� ���� x
			System.out.println(arr[2]);
			System.out.println(arr[0]);
		}catch(java.lang.ArrayIndexOutOfBoundsException e){		// �Ű�����
			
		}
		System.out.println("main end ...");
	}

}
