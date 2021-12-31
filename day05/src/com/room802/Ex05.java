package com.room802;

public class Ex05 {

	public static void main(String[] args) {
		// 1
		// 1 2
		// 1 2 3
		System.out.println(1);
		System.out.println(12);
		System.out.println(123);
		System.out.println("----------------");

		for(int i=1; i<=1; i++){
			System.out.print(i);
		}
		System.out.println();
		
		for(int i=1; i<=2; i++){
			System.out.print(i);
		}
		System.out.println();
		for(int i=1; i<=3; i++){
			System.out.print(i);
		}
		System.out.println();
		System.out.println("----------------");
		
		for(int i=1; i<=3; i++){
			for(int j=1; j<=i; j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
