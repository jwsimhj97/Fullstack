package com.hi;

public class Ex05_01 {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("�л������������α׷�(ver 0.6.0)");
		String data="";
		String input=null;
		String grade="*";
		
		while(true){
			System.out.println("1.���� 2.�Է� 3.���� (4.����) 0.���� >");
			input=sc.nextLine();
			if(input.equals("0")){
				return;
			}
			if(input.equals("1")){
				System.out.println("----------------------------------------");
				System.out.println("�й�\t|�̸�\t|����\t|����\t|����");
				System.out.println("----------------------------------------");
				System.out.println(data);
			}else if(input.equals("2")){
				System.out.print("�й� >");
				data+=grade+sc.nextLine()+"\t|";
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
				String del;
				del="*"+sc.nextLine();
				if(data.startsWith(del)==true){
					System.out.println("�й��̴�");
				}
//				data=data.replace(data,"");
			}else if(input.equals("4")){
				
			}
		}
	}

}
