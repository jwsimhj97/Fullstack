package com.hi;

public class Ex10 {

	public static void main(String[] args) {
		// �ζ�
		// 1.���� (1~45)
		// 2.6�� (�ߺ�x) -> �ߺ����˻�
		// 3.������������
//		int su=(int)(Math.random()*45)+1;
		
		int[] lotto=new int[6];
		
		for(int i=0; i<lotto.length; i++){
			int su=(int)(Math.random()*45)+1;
			lotto[i]=su;
			for(int j=0; j<i; j++){
				if(lotto[i]==lotto[j]){
					i--;
				}
			}
		}
		
		int temp=0;
		for(int i=0; i<lotto.length-1; i++){
			for(int j=i+1; j<lotto.length; j++){
				if(lotto[i]>lotto[j]){
					temp=lotto[i];
					lotto[i]=lotto[j];
					lotto[j]=temp;
				}
			}
		}
		for(int i=0; i<lotto.length; i++){
			System.out.println(lotto[i]);
		}
	}

}
