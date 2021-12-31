package com.hi;

public class Ex09t {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc=new java.util.Scanner(System.in);
		int[] kor=new int[3];
		int[] eng=new int[3];
		int[] math=new int[3];
		
		String temp;
		String bar="---------------------------------------";
		int input =1;
		int cnt =0;
		
		boolean boo = true;
		while(boo){
			System.out.println("1.입력 2.출력 0.종료 >");
			temp=sc.nextLine();
			input=Integer.parseInt(temp);
			if(input==1){
				cnt++;
				if(cnt<4){
					System.out.print("국어>");
					temp=sc.nextLine();
					kor[cnt-1]=Integer.parseInt(temp);
					System.out.print("영어>");
					temp=sc.nextLine();
					eng[cnt-1]=Integer.parseInt(temp);
					System.out.print("수학>");
					temp=sc.nextLine();
					math[cnt-1]=Integer.parseInt(temp);
				}
			}else if(input==2){
				System.out.println(bar);
				System.out.println("국어    | 영어    | 수학");
				System.out.println(bar);
			}else if(input==0){
				boo=false;
			}
		}

	}

}
