package com.hi;
// Class Number 숫자 최상위

interface Ball{
	void play();
}

class Baseball implements Ball{
	public void play(){
		System.out.println("던지고 논다");
	}
}
class BowlingBall implements Ball{
	public void play(){
		System.out.println("굴리고 논다");
	}
}

class Box<T>{
	T obj;		// T자리에는 참조변수의 타입이 오는 자리이다
	public void setObj(T obj){
		this.obj=obj;
	}
	public T getObj(){
		return this.obj;
	}
}

public class Ex02 {

	public static void main(String[] args) {
		Box<BowlingBall> box=new Box<BowlingBall>();
		Baseball ball1=new Baseball();			// baseball 일때
		BowlingBall ball2=new BowlingBall();	// bowlingball 일때
		
		box.setObj(ball2);
		BowlingBall obj=(BowlingBall) box.getObj();
		obj.play();
	}

}
