package com.hi;

public class Ex06 extends Thread{

	public static void main(String[] args) {
		Ex06 me=new Ex06();
		me.start();
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++){
			System.out.println(i);
			try{
				Thread.sleep(1000);	// sleep은 static 메소드이기때문에 앞에 Thread를 붙여줘야한다
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}

}
