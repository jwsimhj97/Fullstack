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
		System.out.println("����:"+kor+"    | ����:"+eng+"    | ����:"+math);
		System.out.println("--------------------------------------");
		System.out.println("�հ�:"+sum);
		System.out.println("���:"+avg);
		System.out.println("--------------------------------------");

		System.out.print("����:");
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
			System.out.println("������ϼ���");
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
		
		String msg=bar+"\n����:"+kor2+"\t\t| ����:"+eng2+"\t| ����:"+math2+"\n";
		msg+=bar+"\n�հ�:"+sum2+"\n���:"+avg2+"\n"+bar+"\n����:";
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
		msg+="����";
		System.out.println(msg);
	}

}
