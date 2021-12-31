package com.room802;

public class Ex10 {

	public static void main(String[] args) {
		// 1개의 if문은 else if문 else문을 갖을 수 있는데
		// else if문은 0개 이상
		// else문은 0개 또는 1개
		// 1개의 조건을 만족하는 순간 실행을 하고 빠져나간다
		
		// su=5;
		// su가 양수이면 "양수입니다"출력
		// su가 음수이면 "음수입니다"출력
		int su=5;
		if(su>0){
			System.out.println("양수입니다");
		}
		if(!(su>0)){
			System.out.println("음수입니다");
		}
		
		System.out.println("------------------");
		
		int su2=0;
		if(su2>0){
			System.out.println("0보다 큽니다");
		}else{
			System.out.println("0보다 작거나 같습니다");
		}
		
		System.out.println("------------------");
		
		if(su2>0){
			System.out.println("0보다 큽니다");
		}
		if(su2==0){
			System.out.println("0입니다");
		}
		if(su2<0){
			System.out.println("0보다 작습니다");
		}

		System.out.println("------------------");
		
		if(su2>0){
			System.out.println("0보다 큽니다");
		}
		//위의 조건을 만족하지 않고 그리고 su>-1를 만족하는
		if(!(su2>0) && su2>-1){
			System.out.println("0입니다");
		}
		if(su2<0){
			System.out.println("0보다 작습니다");
		}
		
		System.out.println("------------------");
		
		if(su2>0){
			System.out.println("0보다 큽니다");
		}else if(su2==0){
			System.out.println("0입니다");
		}else if(su2<0){
			System.out.println("0보다 작습니다");
		}
	}

}
