package com.room802;

public class Ex03 {

	public static void main(String[] args) {
		//	A B C
		//	D E F
		//	G H I
		char alp='A';
		for(int i=1; i<12; i++){
			if(i%4==0){
				System.out.print('\n');
			}else{
				System.out.print(alp);
				alp++;
			}
		}
		
		System.out.println("\n----------------");
		
		char ch='A';
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				System.out.print(ch++);
			}
			System.out.println();
		}
		
		System.out.println("\n----------------");
		
		int su=0;
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				su++;
				System.out.print((char)(su+64));
			}
			System.out.println();
		}
	}

}
