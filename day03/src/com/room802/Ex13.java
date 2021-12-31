package com.room802;

public class Ex13 {

	public static void main(String[] args) {
		// 학생성적관리 프로그램(ver 0.0.1)
		// kor=96, eng=69, math=73
		// 합계, 평균, 학점
		// 학점(평균 90이상 A학점, 80이상 B학점, 70이상 C학점, 60이상 D학점, 60미만 F학점 - (재수강하세요))
		// --------------------------------------------------------------------
		// 국어:96	| 영어:69	| 수학:73
		// --------------------------------------------------------------------
		// 합계:0000
		// 평균:00.00	(소수둘째짜리까지 출력)
		// --------------------------------------------------------------------
		// 학점:F
		//		재수강하세요	
		int tkor,teng,tmath;
		double sum;
		double aver;	
				
		tkor=96;
		teng=69;
		tmath=73;
		sum=tkor+teng+tmath;
		aver=sum/3;

		System.out.println("국어:"+tkor+"	| 영어:"+teng+"	| 수학:"+tmath);
		
		System.out.println("----------------------------");
		
		System.out.println("합계:"+sum);
		System.out.println("평균:"+aver);
		
		System.out.println("----------------------------");

		System.out.print("학점:");
		if(aver>=90){
			System.out.println("A학점");
		}else if(aver>=80){
			System.out.println("B학점");
		}else if(aver>=70){
			System.out.println("C학점");
		}else if(aver>=60){
			System.out.println("D학점");
		}else{
			System.out.println("F학점");
		}		
		if(aver<60){
			System.out.println("재수강하세요");
		}
		
		
		System.out.print("학점:");
		switch((int)aver/10){
			case 9:
				System.out.println("A학점");
			break;
			case 8:
				System.out.println("B학점");
			break;
			case 7:
				System.out.println("C학점");
			break;
			case 6:
				System.out.println("D학점");
			break;
			default :
				System.out.println("F학점");
//			case (aver>=80){
//				System.out.println("B학점");
//			}break;
//			case (aver>=70){
//				System.out.println("C학점");
//			}break;
//			case (aver>=70){
//				System.out.println("D학점");
//			}break;
//			default {
//				System.out.println("F학점");
//			}
		}
	}

}
