package com.room802;

public class Ex15 {

	public static void main(String[] args) {
		int kor, eng, math, sum;
		kor=96;
		eng=69;
		math=73;
		sum=kor+eng+math;
		double avg=sum*100/3/100.0;
		
		System.out.println("---------------------------------");
		System.out.println("����:"+kor+"	| ����:"+eng+"	| ����:"+math);
		System.out.println("---------------------------------");
		System.out.println("�հ�:"+sum);
		System.out.println("���:"+avg);
		System.out.println("---------------------------------");
		System.out.print("if�� - ");		
		System.out.print("����:");		
		if(avg>=90){
			System.out.println("A");
		}else if(avg<90&&avg>=80){
			System.out.println("B");
		}else if(avg<80&&avg>=70){
			System.out.println("C");
		}else if(avg<70&&avg>=60){
			System.out.println("D");
		}else{
			System.out.println("F");
		}
		System.out.println("---------------------------------");
		System.out.print("switch�� - ");		
		System.out.print("����:");		
		switch((int)avg/10){
		// 300~270 A 100   ~ 90.0
		// 269~240 B 89.99 ~ 80.0
		// 239~210 C 79.99 ~ 70.0
		// 209~180 D 69.99 ~ 60.0
		// 179~0 F   59.99 ~ 0
			case 10:
			case 9:
				System.out.println("A");
				break;
			case 8: 
				System.out.println("B");
				break;
			case 7: 
				System.out.println("C");
				break;
			case 6: 
				System.out.println("D");
				break;
			default: 
				System.out.println("F");
		}

	}

}
