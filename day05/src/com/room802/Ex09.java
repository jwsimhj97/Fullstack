package com.room802;

public class Ex09 {

	public static void main(String[] args) {
//	  �� �� ��
//	  �� �� ��
//	  �� �� ��
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				if(j<2-i){
					System.out.print('��');
				}else{
					System.out.print('��');
				}
			}
			System.out.println();
		}
		System.out.println("---------------");
		
		
		//     3
		//   2 3
		// 1 2 3
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				if(j<2-i){
					System.out.print(' ');
				}else{
					System.out.print(j+1);
				}
			}
			System.out.println();
		}
	}

}
