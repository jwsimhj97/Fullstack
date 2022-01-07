package com.hi;
//스레드의 라이프사이클

public class Ex11 extends Thread{
	
	@Override
	public void run() {
		System.out.println(getName()+"start...");
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// e.printStackTrace();
		}
		System.out.println(getName()+"end...");
		
	}

	public static void main(String[] args) {
		Ex11 me=new Ex11();
		me.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		me.interrupt();
	}

}
