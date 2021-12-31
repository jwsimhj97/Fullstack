package com.hi;

class Lec06 implements Runnable{
	public void run(){
		System.out.println("new Thread start...");
		System.out.println("thread end...");
	}
}

public class Ex06 {

	public static void main(String[] args) {
		System.out.println("main start...");
		Lec06 lec=new Lec06();
		Thread thr=new Thread(lec);
		thr.start();
		System.out.println("main end...");
	}

}
