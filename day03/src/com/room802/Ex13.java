package com.room802;

public class Ex13 {

	public static void main(String[] args) {
		// �л��������� ���α׷�(ver 0.0.1)
		// kor=96, eng=69, math=73
		// �հ�, ���, ����
		// ����(��� 90�̻� A����, 80�̻� B����, 70�̻� C����, 60�̻� D����, 60�̸� F���� - (������ϼ���))
		// --------------------------------------------------------------------
		// ����:96	| ����:69	| ����:73
		// --------------------------------------------------------------------
		// �հ�:0000
		// ���:00.00	(�Ҽ���°¥������ ���)
		// --------------------------------------------------------------------
		// ����:F
		//		������ϼ���	
		int tkor,teng,tmath;
		double sum;
		double aver;	
				
		tkor=96;
		teng=69;
		tmath=73;
		sum=tkor+teng+tmath;
		aver=sum/3;

		System.out.println("����:"+tkor+"	| ����:"+teng+"	| ����:"+tmath);
		
		System.out.println("----------------------------");
		
		System.out.println("�հ�:"+sum);
		System.out.println("���:"+aver);
		
		System.out.println("----------------------------");

		System.out.print("����:");
		if(aver>=90){
			System.out.println("A����");
		}else if(aver>=80){
			System.out.println("B����");
		}else if(aver>=70){
			System.out.println("C����");
		}else if(aver>=60){
			System.out.println("D����");
		}else{
			System.out.println("F����");
		}		
		if(aver<60){
			System.out.println("������ϼ���");
		}
		
		
		System.out.print("����:");
		switch((int)aver/10){
			case 9:
				System.out.println("A����");
			break;
			case 8:
				System.out.println("B����");
			break;
			case 7:
				System.out.println("C����");
			break;
			case 6:
				System.out.println("D����");
			break;
			default :
				System.out.println("F����");
//			case (aver>=80){
//				System.out.println("B����");
//			}break;
//			case (aver>=70){
//				System.out.println("C����");
//			}break;
//			case (aver>=70){
//				System.out.println("D����");
//			}break;
//			default {
//				System.out.println("F����");
//			}
		}
	}

}
