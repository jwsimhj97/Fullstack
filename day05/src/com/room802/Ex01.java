package com.room802;

public class Ex01 {

	public static void main(String[] args) {
		// 1. ¡Ú ¡Ú ¡Ú
		//	  ¡Ú ¡Ú ¡Ú
		//	  ¡Ú ¡Ú ¡Ú
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				System.out.print("¡Ú");
			}
			System.out.println();
		}
		System.out.println("-------------");
		
		
		// 2. 1 2 3
		//	  4 5 6
		//	  7 8 9
//		for(int se1=0; se1<=2; se1++){
//			for(int ga1=1; ga1<=3; ga1++){
//				System.out.print(ga1+(3*se1));
//			}
//			System.out.println();
//		}
		for(int i=0; i<3; i++){
			for(int j=1+3*i; j<=3+3*i; j++){
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("-------------");
		
		
		// 3. 1 2 3
		//	  2 3 4
		//	  3 4 5
//		for(int i=0; i<3; i++){
//			for(int j=1; j<=3; j++){
//				System.out.print(i+(1*j));
//			}
//			System.out.println();
//		}
		
		int su=1;
		for(int i=0; i<3; i++){
			for(int j=1; j<=3; j++){
				System.out.print(su++);
			}
			System.out.println();
			su-=2;
		}
		System.out.println("-------------");
		
		
		// 4. A B C
		//	  D E F
		//	  G H I
		char alp='A';
		for(int i=1; i<12; i++){
			if(i%4==0){
				System.out.print('\n');
			}else{
				System.out.print(alp);
				alp++;
			}
		}
	}

}
