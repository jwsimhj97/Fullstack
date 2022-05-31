package com.hi;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.Scanner sc = new Scanner(System.in);
		
		int input = 0;
		input=sc.nextInt();
		
		for(int i=1; i<=9; i++){
			System.out.println(input+" * "+i+" = "+input*i);
		}
	}

}
