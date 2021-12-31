package com.room802;

public class Ex09 {

	public static void main(String[] args) {
		int kor, eng, math;
		kor=96;
		eng=69;
		math=73;
		
		int sum=kor+eng+math;
		double avg=sum*100/3/100.0;
		
		System.out.println("--------------------------------------");
		System.out.println("국어:"+kor+"    | 영어:"+eng+"    | 수학:"+math);
		System.out.println("--------------------------------------");
		System.out.println("합계:"+sum);
		System.out.println("평균:"+avg);
		System.out.println("--------------------------------------");

		System.out.print("학점:");
		switch((int)avg/10){
			case 10:
			case 9: System.out.println("A");
			break;
			case 8: System.out.println("B");
			break;
			case 7: System.out.println("C");
			break;
			case 6: System.out.println("D");
			break;
			default: System.out.println("F");
		}
		
		if((int)avg<60){
			System.out.println("재수강하세요");
		}
		
		
		

		System.out.println("\n============================================\n");
		
		
		

		
		String bar="-----------------------------------------";
		int kor2, eng2, math2, sum2;
		double avg2;
		kor2=96;
		eng2=69;
		math2=73;		
		sum2=kor+eng+math;
		avg2=sum2*100/3/100.0;
		
		String msg=bar+"\n국어:"+kor2+"\t\t| 영어:"+eng2+"\t| 수학:"+math2+"\n";
		msg+=bar+"\n합계:"+sum2+"\n평균:"+avg2+"\n"+bar+"\n학점:";
		int su=(int)avg/10;
		if(su==10 || su==9){
			msg+="A";
		}else if(su == 8){
			msg+="B";
		}else if(su == 7){
			msg+="C";
		}else if(su == 6){
			msg+="D";
		}else{
			msg+="F";
		}
		msg+="학점";
		System.out.println(msg);
	}

}
