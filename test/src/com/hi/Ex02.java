package com.hi;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		java.util.Scanner sc = new Scanner(System.in);
		
		double input = 0;
		
		int sum = 0;
		
		String[] subject = {"����", "����", "����"};
				
		for(int i=0; i<subject.length; i++){
			System.out.print(subject[i]+":");
			input=sc.nextInt();
			sum+=input;
			
		}
		
		System.out.println("�� ������ ����� " +(sum/subject.length)+"�� �Դϴ�.");
	}

}