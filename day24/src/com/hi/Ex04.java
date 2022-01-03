package com.hi;

public class Ex04 extends Thread{

	public Ex04(String name){
		super(name);
	}
	
	public static void main(String[] args) {
		Ex04 thr1=new Ex04("1번째");
//		thr1.setName("첫번째");
		thr1.start();
	}

	@Override
	public void run() {
		System.out.println(getName()+" run...");
	}
}
