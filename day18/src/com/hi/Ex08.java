package com.hi;

public class Ex08 {

	public static void main(String[] args) {
		System.out.println("main start...");
		Runnable me=new Runnable(){
			public void run(){
				System.out.println("thread start...");
				System.out.println("thread end...");
			}
		};
		Thread thr=new Thread(me);
		thr.start();
		System.out.println("main end...");
	}

}
