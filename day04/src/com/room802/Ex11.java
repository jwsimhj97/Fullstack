package com.room802;

public class Ex11 {

	public static void main(String[] args) {
		// ***
		// ***
		// ***
//		System.out.print("*"+" ");
//		System.out.print("*"+" ");
//		System.out.print("*");
		
//		for(int su=1; su<=3; su++){
//			for(int dan=1; dan<=3; dan++){
//				System.out.print(su);
//			}
//			System.out.print("\n");
//		}
		
		String star="*";
		for(int su=1; su<=3; su++){
			for(int dan=1; dan<=3; dan++){
				System.out.print(star+" ");
			}
			System.out.print("\n");
		}
		
		System.out.println("-----------------");
		
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
