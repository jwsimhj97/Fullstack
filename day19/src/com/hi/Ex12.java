package com.hi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		// �л������������α׷� (ver 0.7.0)
		// �����ѵ� �Է��� ������ �����ְ�		
		System.out.println("�л������������α׷� (ver 0.7.0)");
		ArrayList<HashMap<String,String>> data=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		String input=null;

		while(true){
			System.out.print("1.���� 2.�Է� 3.���� 4.���� 0.���� >");
			input=sc.nextLine();
			if(input.equals("0")){break;}
			if(input.equals("1")){
				System.out.println("--------------------------------------");
				System.out.println("�й�\t����\t����\t����");
				System.out.println("--------------------------------------");
				for(int i=0; i<data.size(); i++){
					HashMap<String, String> stu=data.get(i);
					System.out.println(stu.get("num")+"\t"+stu.get("kor")+"\t"+stu.get("eng")+"\t"+stu.get("math"));
				}
				System.out.println("--------------------------------------");
			}else if(input.equals("2")){
				HashMap<String, String> stu=new HashMap<>();
				System.out.print("�й� >");
				stu.put("num", sc.nextLine());
				System.out.print("���� >");
				stu.put("kor", sc.nextLine());
				System.out.print("���� >");
				stu.put("eng", sc.nextLine());
				System.out.print("���� >");
				stu.put("math", sc.nextLine());
				
				data.add(stu);
			}else if(input.equals("3")){
				
			}else if(input.equals("4")){
				
			}
		}
		
		File file=new File("test12.txt");
		if(!file.exists()){
			try{
				file.createNewFile();
			}catch(IOException e){
				e.printStackTrace();
			}
		}

		try{
			FileOutputStream out=new java.io.FileOutputStream(file);
			char[] arr=input.toCharArray();
			for(int i=0; i<arr.length; i++){
				out.write(arr[i]);
			}
			out.close();
			System.out.println("�ۼ��Ϸ�");
		}catch(FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
