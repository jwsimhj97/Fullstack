package com.hi;

public class Ex01t {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("학생성적관리프로그램 (ver 0.3.0)");
		System.out.print("총원 >");
		String input=sc.nextLine();
		int tot=changeSu(input);
		int[] kor=new int[tot];
		int[] eng=new int[tot];
		int[] math=new int[tot];
		boolean boo=true;
		int cnt=0;
		while(boo){
			System.out.print("1.입력 2.보기 0.종료 >");
			input=sc.nextLine();	//위에 기존 input을 재활용 -> 효율적
			int su=changeSu(input);
			if(su==0){
				boo=false;
			}else if(su==1&&cnt!=tot){
				//입력
				kor[cnt]=inputSu("국어 >");
				eng[cnt]=inputSu("영어 >");
				math[cnt]=inputSu("수학 >");
				cnt++;				
			}else if(su==1){
				System.out.println("더이상 입력하실 학생이 없습니다");
			}else if(su==2){
				//출력
				System.out.println("-------------------------------");
				System.out.println("국어\t| 영어\t| 수학");
				System.out.println("-------------------------------");
				for(int i=0; i<tot; i++){
					System.out.println(kor[i]+"\t| "+eng[i]+"\t| "+math[i]);
				}
				System.out.println("-------------------------------");
			}else{
				System.out.println("입력이 잘못되었습니다");
			}
		}

	}
	
	//모듈화
	//학점을 입력받고 숫자로 전달해주는 기능
	public static int inputSu(String title){
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.print(title);
		String msg=sc.nextLine();
		int su=changeSu(msg);
		boolean boo=true;
		//점수의 범위는 0 ~ 100 사이의 값만 가능
		while(boo){
			if(su<0 || su>100){
				System.out.print("점수는 0 ~ 100 사이의 값만 가능\n 재입력 >");
				msg=sc.nextLine();
				su=changeSu(msg);
			}
			if(su>=0&&su<=100){
				boo=false;
			}
		}
		return su;
	}

	//문자열을 숫자로 바꿔주는 기능
	public static int changeSu(String msg){
		int su=Integer.parseInt(msg);
		return su;
	}

}
