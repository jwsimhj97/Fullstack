package com.hi;

public class Ex12 extends Thread{
	
	@Override
	public void run() {
		System.out.println(getName()+" start...");
		
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(getName()+" end...");
	}

	public static void main(String[] args) {
		Ex12 me=new Ex12();
		Ex12 you=new Ex12();
		me.start();
		you.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		me.notifyAll();
	}

}
