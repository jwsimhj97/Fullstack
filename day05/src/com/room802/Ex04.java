package com.room802;

public class Ex04 {

	public static void main(String[] args) {
		// ��
		// �� ��
		// �� �� ��
		for(int j=1; j<=3; j++){
			for(int i=0; i<j; i++){
				System.out.print("��");
			}
			System.out.println();
		}
		System.out.println("----------------");
		

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
		System.out.println("----------------");
		

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
		System.out.println("----------------");
		

		// �� �� ��
		// �� ��
		// ��
		for(int i=3; i>0; i--){
			for(int j=0; j<i; j++){
				System.out.print('*');
			}
			System.out.println();
		}

	}

}
