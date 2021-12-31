package com.hi;

import java.util.Scanner;

public class Ex13t2 {

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
		System.out.println("메모장 만들기(ver 0.1.0)");
		Scanner sc=new Scanner(System.in);
		String input=null;
		HiList list=new HiList();
		while(true){
			System.out.print("1.작성 2.보기 3.삭제 0.종료 >");
			input=sc.nextLine();
			if(input.equals("1")){
				System.out.print(">> ");
				input=sc.nextLine();
				list.add(input);
			}else if(input.equals("2")){
				for(int i=0; i<list.size(); i++){
					System.out.println(list.get(i));
				}
			}else if(input.equals("3")){
				input=sc.nextLine();
				list.remove(Integer.parseInt(input));
			}else if(input.equals("0")){
				
			}
		}
	}

}
