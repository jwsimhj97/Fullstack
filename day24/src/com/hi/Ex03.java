package com.hi;

public class Ex03 implements Runnable{

	public static void main(String[] args) {
		Ex03 me=new Ex03();
		Thread thr=new Thread(me,"1번째");
//		thr.setName("첫번째");
		thr.start();
	}

	@Override
	public void run() {
		String name=Thread.currentThread().getName();
		System.out.println(name+" run...");
	}

}
