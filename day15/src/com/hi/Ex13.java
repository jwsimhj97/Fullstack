package com.hi;

import java.util.Arrays;

// String 배열 이용
public class Ex13 {

	public static void main(String[] args) {
		// 메모장 만들기(ver 0.1.0)
		// 1.작성 2.보기 [3.삭제] 0.종료 >1
		// >> 안녕하세요
		// 1.작성 2.보기 [3.삭제] 0.종료 >1
		// >> 두번째 글
		// 1.작성 2.보기 [3.삭제] 0.종료 >2
		// ---------------------------------
		// 	글번호 | 내용
		// ---------------------------------
		// 1		안녕하세요
		// 2		두번째 글
		// ---------------------------------
		// 1.작성 2.보기 [3.삭제] 0.종료 >
		String input;
		System.out.println("메모장 만들기(ver 0.1.0)");
		java.util.Scanner sc=new java.util.Scanner(System.in);		
		
		String[] arr={"종료", "작성", "보기", "삭제"};
		String[] arr2=new String[10];
		int su;

//		System.arraycopy(arr, 0, arr2, 0, arr.length);
		
		while(true){			
			System.out.println("1.작성 2.보기 [3.삭제] 0.종료 >");
			input=sc.nextLine();
			su=Integer.parseInt(input);
			
			System.out.println(arr[su]);
			
			
			if(su==1){	//작성
				System.out.print(">> ");
				input=sc.nextLine();
				
			}else if(su==2){
				System.out.println(input);
			}
			
			
			
			
//			if(input==arr[0]){			//종료
//				break;
//			}else if(input==arr[1]){	//작성
//				System.out.println(">> ");
//				input=sc.nextLine();
//			}else if(input==arr[2]){	//보기
//				
//			}else if(input==arr[3]){	//삭제
//				
//			}
		}
		
		
		
		
//		try{
//			su=Integer.parseInt(input);
//			System.out.println(arr[su]);
//		}catch(Exception e){
//			e.printStackTrace();
//		}
		
		
		
	}

}
