package com.hi;

public class Ex03 {
	public static String model="모닝";
	public static int speed=0;
	public static int max=100;
	
	public static void speedUp(){
		if(speed+12>150){
			speed=max;
		}else{
			speed+=12;
		}
	}
	
	public static void speedDown(){
		if(speed-13<=0){
			speed=0;
		}else{
			speed-=13;
		}
	}
	
	public static void show(){
		System.out.println("내차 "+model+"의 현재 속도는 "+speed+"km입니다");
	}

	public static void main(String[] args) {
		show();
		for(int i=0; i<30; i++){
			speedUp();
			show();
		}
		for(int i=0; i<40; i++){
			speedDown();
			show();
		}
		
		model="레이";
		max=150;
		show();
		for(int i=0; i<30; i++){
			speedUp();
			show();
		}
		for(int i=0; i<40; i++){
			speedDown();
			show();
		}
	}

}
