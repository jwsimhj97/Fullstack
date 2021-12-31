package com.room802;
//1 2 3
//4 5 6
//7 8 9

//1+0 2+0 3+0
//1+3 2+3 3+3
//1+6 2+6 3+6

//1+3*0 2+3*0 3+3*0
//1+3*1 2+3*1 3+3*1
//1+3*2 2+3*2 3+3*2

public class Ex14 {

	public static void main(String[] args) {
		for(int i=0; i<3; i++){
			for(int j=1; j<4; j++){
				System.out.print(j+3*i);
			}
			System.out.println();
		}
	}

}
