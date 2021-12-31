package com.hi;
//try{}catch{} == else if
public class Ex12 {

	public static void main(String[] args) {
		String[] msg={"java", "web", "DB", "framework"};
		
		java.util.Scanner sc=new java.util.Scanner(System.in);

		System.out.print("idx >");
		String input=sc.nextLine();
		int idx=0;
		
		try{
			idx=Integer.parseInt(input);
			System.out.println(msg[idx]);
		}catch(java.lang.ArrayIndexOutOfBoundsException e){
			System.out.println("인덱스번호는 0~3까지입니다");
		}catch(java.lang.NumberFormatException e){
			System.out.println("숫자를 입력하세요");
		}
	}

}
