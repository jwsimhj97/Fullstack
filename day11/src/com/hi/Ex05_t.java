package com.hi;

public class Ex05_t {

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
				System.out.print("----------------------------------------");
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
				System.out.print("삭제할 학번>");
				input=sc.nextLine();
				int startIndex=data.indexOf("\n"+input+"\t");
				int endIndex=data.indexOf("\n",startIndex+1);
				String target;
				if(endIndex==-1){
					target=data.substring(startIndex);
				}else{
					target=data.substring(startIndex,endIndex);
				}				
				data=data.replace(target,"");
			}else if(input.equals("4")){
				System.out.print("수정할 학번>");
				input=sc.nextLine();
				int startIndex=data.indexOf("\n"+input+"\t");
				int endIndex=data.indexOf("\n",startIndex+1);
				String target;
				if(endIndex==-1){
					target=data.substring(startIndex);
				}else{
					target=data.substring(startIndex,endIndex);
				}
				input="\n"+input+"\t|";
				System.out.print("이름>");
				input+=sc.nextLine()+"\t|";
				System.out.print("국어>");
				input+=sc.nextLine()+"\t|";
				System.out.print("영어>");
				input+=sc.nextLine()+"\t|";
				System.out.print("수학>");
				input+=sc.nextLine();
				
				data=data.replace(target,input);
			}
		}

	}

}
