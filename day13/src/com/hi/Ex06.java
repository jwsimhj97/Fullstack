package com.hi;

public class Ex06 {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String[] arr={"java", "web", "db", "framework"};
		int su=0;
		
		String input=sc.nextLine();
		try{
			su=Integer.parseInt(input);
			System.out.println(arr[su]);
//		}catch(NumberFormatException e){
//			
//		}catch(ArrayIndexOutOfBoundsException e){
//			
//		}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
