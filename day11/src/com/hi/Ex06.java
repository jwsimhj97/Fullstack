package com.hi;

public class Ex06 {

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
				System.out.println("----------------------------------------");
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
				System.out.print("����>");
				input=sc.nextLine();
				String[] arr=data.split("\n");
				
				data="";
				for(int i=0; i<arr.length-1; i++){
					if(!arr[i].startsWith(input+"\t")){
						data+=arr[i]+"\n";	
					}
				}
			}else if(input.equals("4")){
				System.out.print("����>");
				input=sc.nextLine();
				String[] arr=data.split("\n");
				
				data="";
				for(int i=0; i<arr.length-1; i++){
					if(!arr[i].startsWith(input+"\t")){
						data+=arr[i]+"\n";	
					}else{
						data+=input;
						System.out.print("�̸� >");
						data+=sc.nextLine()+"\t|";
						System.out.print("���� >");
						data+=sc.nextLine()+"\t|";
						System.out.print("���� >");
						data+=sc.nextLine()+"\t|";
						System.out.print("���� >");
						data+=sc.nextLine()+"\n";
					}
				}
			}
		}
	}

}
