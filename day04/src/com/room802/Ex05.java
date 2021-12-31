package com.room802;

public class Ex05 {

	public static void main(String[] args) {
		// Q2. A~Z까지 출력하시오
//		System.out.println('A'); 'A' = (char)65
//		System.out.println('B'); 'B' = (char)66
//		System.out.println('C'); 'C' = (char)67
//		System.out.println('Z');
		
		for(int i='A'; i<='Z'; i++){
			System.out.print((char)i);
		}
		
		System.out.println("\n---------------------");
		
		for(char i='A'; i<='Z'; i++){
			System.out.print(i);
		}
		
		System.out.println("\n---------------------");
		
		int cnt=26;
		for(int i=0; i<cnt; i++){
			System.out.print((char)(i+'A'));
		}
//		'A'='A'+0;
//		'B'='A'+1;
//		'C'='A'+2;
//		...
	}

}
