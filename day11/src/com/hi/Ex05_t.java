package com.hi;

public class Ex05_t {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("�л������������α׷�(ver 0.6.0)");
		String data="";
		String input=null;
		String grade="*";
		
		while(true){
			System.out.println("1.���� 2.�Է� 3.���� 4.���� 0.���� >");
			input=sc.nextLine();
			if(input.equals("0")){
				return;
			}
			if(input.equals("1")){
				System.out.println("----------------------------------------");
				System.out.println("�й�\t|�̸�\t|����\t|����\t|����");
				System.out.print("----------------------------------------");
				System.out.println(data);
			}else if(input.equals("2")){
				System.out.print("�й� >");
				data+="\n"+sc.nextLine()+"\t|";
				System.out.print("�̸� >");
				data+=sc.nextLine()+"\t|";
				System.out.print("���� >");
				data+=sc.nextLine()+"\t|";
				System.out.print("���� >");
				data+=sc.nextLine()+"\t|";
				System.out.print("���� >");
				data+=sc.nextLine()+"\n";
			}else if(input.equals("3")){
				System.out.print("������ �й�>");
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
				System.out.print("������ �й�>");
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
				System.out.print("�̸�>");
				input+=sc.nextLine()+"\t|";
				System.out.print("����>");
				input+=sc.nextLine()+"\t|";
				System.out.print("����>");
				input+=sc.nextLine()+"\t|";
				System.out.print("����>");
				input+=sc.nextLine();
				
				data=data.replace(target,input);
			}
		}

	}

}
