package com.hi;

public class Ex10 {

	public static void main(String[] args) {
		// 
		double su1=Math.random();
//		0<=su1<1;
//		0*3+1<=su1*3+1<1*3+1
//		0<=su1<4; -> 1,2,3
		int su3=(int)(su1*3)+1;
		System.out.println("su3="+su3);
		
		
//		int su2=(int)(su1*10); //0~9
//		boolean boo=true;
//		while(boo){
//			if(su2<1 || su2>3){
//				su1=Math.random();
//				su2=(int)(su1*10);
//			}else{
//				boo=false;
//			}
//		}
//		System.out.println(su2);
	}

}
