package com.hi;
// 
public class Ex07 {

	public static void main(String[] args) {
 		for(int i=0; i<10; i++){
			if(i>4){
				return;
//				return;		- 해당메서드의 종료(반복조건을 만족하면 실행을 끝내고 호출한 측으로 돌아간다, 스택빼내기) - 메서드 어디서나
//				continue;	- 해당 반복문의 상단으로 돌아간다(반복문내에서만 존재)
//				break;		- 해당 switch문||반복문에서 탈출(반복문내, switch문에서만 존재)
			}
			System.out.println(i);
		}
		System.out.println("main 종료");
	}
}
