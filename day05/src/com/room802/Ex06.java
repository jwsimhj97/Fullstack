package com.room802;

public class Ex06 {

	public static void main(String[] args) {
		// 1
		// 2 3
		// 4 5 6
		int su=0;
		for(int i=1; i<=3; i++){
			for(int j=1; j<=i; j++){
				su++;
				System.out.print(su);
			}
			System.out.println();
		}
		
		for(int j=1; j<=3; j++){
			for(int i=1; i<=j; j++){
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
