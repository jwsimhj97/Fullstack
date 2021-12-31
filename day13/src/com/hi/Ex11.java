package com.hi;

public class Ex11 {

	public static void main(String[] args) {
		int[] lotto=new int[45];
		for(int i=0; i<lotto.length; i++){
			lotto[i]=i+1;
		}
		
		int temp=0;
		for(int i=0; i<10000; i++){
			int ran=(int)(Math.random()*45);
			temp=lotto[0];
			lotto[0]=lotto[ran];
			lotto[ran]=temp;
		}
		
		for(int i=0; i<6; i++){
			System.out.println(lotto[i]);
		}
	}

}
