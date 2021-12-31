package com.hi;
// Class Number ���� �ֻ���

interface Ball{
	void play();
}

class Baseball implements Ball{
	public void play(){
		System.out.println("������ ���");
	}
}
class BowlingBall implements Ball{
	public void play(){
		System.out.println("������ ���");
	}
}

class Box<T>{
	T obj;		// T�ڸ����� ���������� Ÿ���� ���� �ڸ��̴�
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
		Baseball ball1=new Baseball();			// baseball �϶�
		BowlingBall ball2=new BowlingBall();	// bowlingball �϶�
		
		box.setObj(ball2);
		BowlingBall obj=(BowlingBall) box.getObj();
		obj.play();
	}

}
