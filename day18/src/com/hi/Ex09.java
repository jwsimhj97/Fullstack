package com.hi;

public class Ex09 extends Thread{

	public static void main(String[] args) {
		Ex09 me=new Ex09();
		me.start();		
		me=new Ex09();
		me.start();
		
		Thread thr1=new Thread();
		thr1.start();
		Thread thr2=new Thread();
		thr2.start();
	}
	
	public void run(){
		System.out.println("new Thread...");
	}

}
