package com.hi;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc=new java.util.Scanner(System.in);
		int me,com,win,draw,lose;
		me=1;
		com=1;
		win=0;
		draw=0;
		lose=0;
		String input;		
		System.out.println("가위 바위 보 게임 (ver 0.1.0)");
		System.out.println("게임을 시작하겠습니다");
		String[] arr={"가위","바위","보"};
		boolean boo=true;
		while(boo){
			System.out.print("1.가위 2.바위 3.보 0.종료 >");
			input=sc.nextLine();
			me=Integer.parseInt(input);
			if(me==0){
				boo=false;
			}else if(me<1||me>3){
				System.out.println("메뉴를 다시 확인하세요");
			}else{
				com=(int)(Math.random()*3)+1;
				System.out.println("me:"+arr[me-1]+",com:"+arr[com-1]);
				if((me==1&&com==3)||(me==2&&com==1)||(me==3&&com==2)){
					System.out.println("이겼음");
					win++;
				}else if(me==com){
					System.out.println("비겼음");
					draw++;
				}else if((me==1&com==2)||(me==2&&com==3)||(me==3&&com==1)){
					System.out.println("졌음");
					lose++;
				}
			}
		}
		
		System.out.println(win+"승"+draw+"무"+lose+"패");
		System.out.println("이용해주셔서 감사합니다");
	}

}
