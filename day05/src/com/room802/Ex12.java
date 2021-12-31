package com.room802;

public class Ex12 {

	public static void main(String[] args) {
//		for(int i=1; i<10; i++){
//			for(int j=2; j<10; j++){
//				System.out.print(j+"x"+i+"\t");
//			}
//			System.out.println();
//		}
		
		
		int i=1; 
		int j=0; 
		while(i<10){
			j=2; 
			while(j<10){
				System.out.print(j+"x"+i+"\t");
				j++;
			}
			i++;
			System.out.println();
		}
	}

}
