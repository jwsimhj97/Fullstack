package com.hi;

public class Ex01 {

	public static void main(String[] args) {
		// �ζ� ��ȣ ������(ver 0.0.1)
		// 1 ~ 45 ������ ��ȣ�� �������� �ߺ�x
		// 6�� ���
//		double ran=Math.random()*45;	
		int[] data=new int[6];
		data[0]=22;
		
		for(int i=0; i<6; i++){
			int ran=(int)(Math.random()*45)+1;
			data[i]=ran;
			System.out.println(ran);
			
			// ���� ran ��°��� data�� ���ִ� ���̸� �ٽ� ����Ѵ�
		}
	}

}
