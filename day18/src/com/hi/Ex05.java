package com.hi;

public class Ex05 extends java.lang.Thread{

	public static void main(String[] args) {
		System.out.println("main start");
		Ex05 me=new Ex05();
		me.run();
		System.out.println("main end...");
	}
	
	public void run(){
		System.out.println("thread start...");
		try{
			Thread.sleep(5000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}// 5�� ����
		System.out.println("thread end...");		
	}

}
