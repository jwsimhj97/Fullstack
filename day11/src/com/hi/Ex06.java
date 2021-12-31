package com.hi;

public class Ex06 {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("학생성적관리프로그램(ver 0.6.0)");
		String data="";
		String input=null;
		String grade="*";
		
		while(true){
			System.out.println("1.보기 2.입력 3.삭제 4.수정 0.종료 >");
			input=sc.nextLine();
			if(input.equals("0")){
				return;
			}
			if(input.equals("1")){
				System.out.println("----------------------------------------");
				System.out.println("학번\t|이름\t|국어\t|영어\t|수학");
				System.out.println("----------------------------------------");
				System.out.println(data);
			}else if(input.equals("2")){
				System.out.print("학번 >");
				data+="\n"+sc.nextLine()+"\t|";
				System.out.print("이름 >");
				data+=sc.nextLine()+"\t|";
				System.out.print("국어 >");
				data+=sc.nextLine()+"\t|";
				System.out.print("영어 >");
				data+=sc.nextLine()+"\t|";
				System.out.print("수학 >");
				data+=sc.nextLine()+"\n";
			}else if(input.equals("3")){
				System.out.print("삭제>");
				input=sc.nextLine();
				String[] arr=data.split("\n");
				
				data="";
				for(int i=0; i<arr.length-1; i++){
					if(!arr[i].startsWith(input+"\t")){
						data+=arr[i]+"\n";	
					}
				}
			}else if(input.equals("4")){
				System.out.print("수정>");
				input=sc.nextLine();
				String[] arr=data.split("\n");
				
				data="";
				for(int i=0; i<arr.length-1; i++){
					if(!arr[i].startsWith(input+"\t")){
						data+=arr[i]+"\n";	
					}else{
						data+=input;
						System.out.print("이름 >");
						data+=sc.nextLine()+"\t|";
						System.out.print("국어 >");
						data+=sc.nextLine()+"\t|";
						System.out.print("영어 >");
						data+=sc.nextLine()+"\t|";
						System.out.print("수학 >");
						data+=sc.nextLine()+"\n";
					}
				}
			}
		}
	}

}
