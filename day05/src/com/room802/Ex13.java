package com.room802;

public class Ex13 {

	public static void main(String[] args) {
		// �迭
		// �ڷ���[] �迭��=new �ڷ���[����];
		// ȣ�� �迭��[�ε���];
		// �ε��� - 0���� ����, +1�� ����, max=����-1
		
		
		int[] arr = new int[5];	//�迭 �������
		arr[0] = 1;				//���� ����
		arr[1] = 3;
		arr[2] = 5;
		arr[3] = 7;
		arr[4] = 9;
		
//		System.out.println(arr[4]);	//���� ȣ��
//		System.out.println(arr[3]);	//���� ȣ��
//		System.out.println(arr[2]);	//���� ȣ��
//		System.out.println(arr[1]);	//���� ȣ��
//		System.out.println(arr[0]);	//���� ȣ��
		
		for(int i=0; i<5; i++){
			System.out.println(arr[i]);	//���� ȣ��
		}
	}

}
