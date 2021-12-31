package com.room802;

public class Ex01 {

	public static void main(String[] args) {
		// 제어문(반복문[3가지] - for문)
		
		// ①
		// for(②초기화;③조건문;⑤증감식){
		//	④반복수행할 명령;
		// }
		// ⑥
		// 수행순서 : ①⇒②⇒③⇒④⇒⑤⇒③⇒④⇒⑤⇒③true⇒④...⑤⇒③false⇒⑥
		int i=1000;
		for(i=0; i<5; i++){
			System.out.println("반복");
		}
		System.out.println(i);
	}

}
