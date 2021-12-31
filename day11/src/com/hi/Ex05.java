package com.hi;

public class Ex05 {

	public static void main(String[] args) {
		// 학생성적관리프로그램 (ver 0.6.0)
		// String data;
		// 자료형이 살아있으면 학번이 중복허용안됨
		// 1.보기 2.입력 3.삭제 (4.수정) 0.종료 >  
		// 수정replace 과 삭제substring
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String input;
//		input=sc.nextLine();
//		inputSu=Integer.parseInt(input);
		
		System.out.println("학생성적관리프로그램 (ver 0.6.0)");
		
		String[] sub=new String[]{"국어", "영어", "수학"};		//과목
		String[] result=new String[3];						//결과값
		
		boolean boo=true;
		while(boo){
			System.out.print("1.보기 2.입력 3.삭제 0.종료 >");
			input=sc.nextLine();
			
			if(input.equals("0")){
				//종료
				boo=false;
			}else if(input.equals("1")){
				//보기
				System.out.println("-------------------------");
				System.out.println("국어\t영어\t수학");
				System.out.println("-------------------------");
				System.out.println(result[0]+"\t"+result[1]+"\t"+result[2]);
			}else if(input.equals("2")){
				//입력
				System.out.print(sub[0]+"> ");
				input=sc.nextLine();
				result[0]=input;
				System.out.print(sub[1]+"> ");
				input=sc.nextLine();
				result[1]=input;
				System.out.print(sub[2]+"> ");
				input=sc.nextLine();
				result[2]=input;
			}else if(input.equals("3")){
				//삭제
				         
//				if()
				result[0]=result[0].substring(2);
				
			}else{
				
			}
		}
		System.out.println("프로그램을 종료했습니다");
	}

}
