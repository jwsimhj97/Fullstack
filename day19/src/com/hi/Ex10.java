package com.hi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		System.out.println("학생성적관리프로그램 (ver 0.5.1)");
		ArrayList<HashMap<String,String>> data=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		String input=null;
		
		while(true){
			System.out.print("1.보기 2.입력 3.수정 4.삭제 0.종료 >");
			input=sc.nextLine();
			if(input.equals("0")){break;}
			if(input.equals("1")){
				System.out.println("--------------------------------------");
				System.out.println("학번\t국어\t영어\t수학");
				System.out.println("--------------------------------------");
				for(int i=0; i<data.size(); i++){
					HashMap<String, String> stu=data.get(i);
					System.out.println(stu.get("num")+"\t"+stu.get("kor")+"\t"+stu.get("eng")+"\t"+stu.get("math"));
				}
				System.out.println("--------------------------------------");
			}else if(input.equals("2")){
				HashMap<String, String> stu=new HashMap<>();
				System.out.print("학번 >");
				stu.put("num", sc.nextLine());
				System.out.print("국어 >");
				stu.put("kor", sc.nextLine());
				System.out.print("영어 >");
				stu.put("eng", sc.nextLine());
				System.out.print("수학 >");
				stu.put("math", sc.nextLine());
				
				data.add(stu);
			}else if(input.equals("3")){
				
			}else if(input.equals("4")){
				
			}else{
				
			}
		}
	}

}
