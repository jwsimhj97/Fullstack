package com.hi;

public class Ex01_1 {
	public static void main(String[] args){
		// �ζ� ��ȣ ������(ver 0.0.1)
		// 1 ~ 45 ������ ��ȣ�� �������� �ߺ�x
		// 6�� ���
//		int ran=0;
//		int[] data={0,0,0,0,0,0};
//		boolean boo=true;
//		int i=0;
//		while(boo && i<6){
//			ran= (int)(Math.random()*45)+1;
//			data[i]=ran;
//			if(data[i] == ran){
//				ran= (int)(Math.random()*45)+1;
//			}else{
//				boo=false;
//			}
//			i++;
//		}
		
		
		
		
		// �˻� �ȿ� 6��
		
		
		final int LOTTO=6;
		int result[] = new int[LOTTO];
		int ran=0;
		int cnt=0;
		
		for(int i=0; i<LOTTO; i++){
			int j=0;
			ran=(int)(Math.random()*45)+1;
			while(j<cnt){				// result �迭�� �� �ֵ鸸 ��
				if(ran==result[j]){
					ran=(int)(Math.random()*45)+1;
					j=0;
					continue;
				}
				j++;
			}
			result[i]=ran;		// while�� ���������� ����
			cnt++;				// ���� ������ ����
		}
		for(int i=0; i<LOTTO; i++){
			System.out.print(result[i]+" ");
		}
		
		
		
		
		
		
		
		
	}
}