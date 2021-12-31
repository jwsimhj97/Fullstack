package com.room802;

public class Ex02 {

	public static void main(String[] args) {
		for(int i=1; i<10; i++){
			System.out.print(i);
			if(i%3==0){
				System.out.println();
			}
		}
		
		System.out.println("--------------");
		
		int su=1;
		for(int i=1; i<12; i++){
			if(i%4==0){
				System.out.print('\n');
			}else{
				System.out.print(su);
				su++;
			}
		}
		
		System.out.println("\n--------------");
		
		int su1=1;
		for(int i=1; i<12; i++){
			if(i%4==0){
				System.out.print('\n');
				su1-=2;
			}else{
				System.out.print(su1);
				su1++;
			}
		}
		
	}

}
