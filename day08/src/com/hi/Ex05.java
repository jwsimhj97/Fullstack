package com.hi;

public class Ex05 {

	public static void main(String[] args) {
		// �迭 - �迭������ ��������
//		int[] arr1;					// [�迭]������ ����
		int[] arr1=null;			// �������� �ʱ�ȭ	
		arr1=new int[3];			// [�迭]�� �ʱ�ȭ
		System.out.println(arr1);
//		Ex05 me=new Ex05();
//		System.out.println(me);
		arr1[0]=2;					// ����Ʈ������(o) �����ʱ�ȭ(x) - ����: ����Ʈ���� �̹� ������
		arr1[1]=4;
		arr1[2]=6;
		int[] arr2;					// ����
		arr2=new int[]{2,4,6};		// �ʱ�ȭ : []�ȿ� ���� �̸� �־���� �ʾ����Ƿ� {}�� ������ ������ ���´�
		int[] arr3;
		arr3=new int[3];
		
		for(int i=0; i<arr1.length; i++){//length - ��ü�� �ɹ�����
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
