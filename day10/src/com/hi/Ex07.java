package com.hi;

public class Ex07 {

	public static void main(String[] args) {
		// 학생성적관리프로그램(ver 0.5.0)
		// 총원>3
		// 1.입력 2.보기 0.종료 > 1
		// 학번>
		// 이름>
		// 국어 >
		// 영어 >
		// 수학 >
		// 1.입력 2.보기 0.종료 > 1
		
		java.util.Scanner sc=new java.util.Scanner(System.in);		
//		String[] info=new String[]{"학번", "이름", "국어", "영어", "수학"};
		int tot=0;
		int btn=0;
		int turn=0;
		int su=0;
		String msg;
		
		//이중배열
		String[][] arr1;
		arr1=new String[5][];	
		arr1[0]=new String[]{"학번"};
		arr1[1]=new String[]{"이름"};
		arr1[2]=new String[]{"국어"};
		arr1[3]=new String[]{"영어"};
		arr1[4]=new String[]{"수학"};
		
		
		System.out.println("학생성적관리프로그램(ver 0.5.0)");		
		System.out.print("총원 >");
		tot=Integer.parseInt(sc.nextLine());
		
		boolean boo=true;
		while(boo){
			System.out.print("1.입력 2.보기 0.종료 >");
			btn=Integer.parseInt(sc.nextLine());
			
			if(btn==0){
				boo=false;
			}else if(btn==1){
				turn++;
				if(turn<=tot){					
					for(int i=0; i<arr1.length; i++){
						for(int j=0; j<arr1[i].length; j++){
							System.out.print(arr1[i][j]+" ");
							msg=sc.nextLine();
						}
					}
				}else{
					System.out.println("기입이 완료되었습니다");
				}
			}else if(btn==2){
//				System.out.println(msg());
//				for(int i=0; i<su; i++){
//					System.out.println(msg(i));
//				}
			}
		}
		System.out.println("프로그램이 종료되었습니다");
		
		
	}

}
