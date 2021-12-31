package com.hi;

public class Ex01 {

	public static void main(String[] args) {
		// 학생성적관리프로그램 (ver 0.3.0)
		// 총원 > 3
		// 1.입력 2.보기 0.종료 >
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String title="학생성적관리프로그램 (ver 0.3.0)";
		System.out.println(title);
		
		String bar="-------------------------------------";
		String msg, peo;
		int num=0;
		int turn=0;
		int abc=0;
		int su=0;

		System.out.print("총원 >");
		peo=sc.nextLine();
		su=Integer.parseInt(peo);		

		String[] kor=new String[su];
		String[] eng=new String[su];
		String[] math=new String[su];
		
		boolean boo=true;
		while(boo){			
			System.out.print("1.입력 2.보기 0.종료 >");
			msg=sc.nextLine();
			num=Integer.parseInt(msg);
			
			if(num==1){
				turn++;
				if(turn<=su){
					System.out.print(turn+"학생 국어");
					kor[turn-1]=sc.nextLine();
					System.out.print(turn+"학생 영어");
					eng[turn-1]=sc.nextLine();
					System.out.print(turn+"학생 수학");
					math[turn-1]=sc.nextLine();
				}else{
					System.out.println("입력이 완료되었습니다");
				}
			}else if(num==2){
				System.out.println(bar);
				System.out.println("국어   | 영어   | 수학");
				System.out.println(bar);	
				
				for(int i=0; i<su; i++){
					System.out.println(kor[i]+"\t "+eng[i]+"\t "+math[i]);
				}
				
			}else if(num==0){
				boo=false;
			}else{
				System.out.println("입력이 잘못되었습니다");
			}
			
		}
		System.out.println("종료되었습니다");
	}

}
