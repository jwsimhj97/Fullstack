package com.hi;

public class Ex09 {

	public static void main(String[] args) {
		// 학생성적관리프로그램(ver 0.4.1)
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String input=null;
		
		System.out.println("학생성적관리프로그램(ver 0.4.1)");
		System.out.print("총원 >");
		input=sc.nextLine();
		int tot=Integer.parseInt(input);
		String[] kor=new String[tot];
		String[] eng=new String[tot];
		String[] math=new String[tot];
		
		for(int i=0; i<tot; i++){
			kor[i]="-";
			eng[i]="-";
			math[i]="-";
		}
//		int idx=0;		
		while(true){
			System.out.print("1.입력 2. 보기 0.종료 >");
			input=sc.nextLine();
			
			if(input.equals("0")){
				System.out.println("이용해주셔서 감사합니다");
				return;
			}else if(input.equals("1")){
				//입력
					System.out.print("학번 >");
					input=sc.nextLine();
					int num=Integer.parseInt(input);
					
					if(num<=tot){
						System.out.print("국어 >");
						input=sc.nextLine();
						kor[num-1]=input;
						System.out.print("영어 >");
						input=sc.nextLine();
						eng[num-1]=input;
						System.out.print("수학 >");
						input=sc.nextLine();
						math[num-1]=input;
					}
			}else if(input.equals("2")){
				System.out.println("----------------------------------------");
				System.out.println("국어\t|영어\t|수학t|합계");
				System.out.println("----------------------------------------");
				for(int i=0; i<tot; i++){
					if(!kor[i].equals("-")){
						int a=Integer.parseInt(kor[i]);
						int b=Integer.parseInt(eng[i]);
						int c=Integer.parseInt(math[i]);
						int sum=a+b+c;
						System.out.println(kor[i]+"\t"+eng[i]+"\t"+math[i]+"\t"+sum);
					}
				}
				System.out.println("----------------------------------------");
			}
		}
	}

}
