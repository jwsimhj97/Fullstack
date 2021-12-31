package com.hi;

class Ball{
	private final int num;
	boolean marking;
	String color;
	public Ball(int num){
		this.num=num;
		marking=true;
		if(num<10){
			color="노랑색";
		}else if(num<20){
			color="파랑색";
		}else if(num<30){
			color="빨강색";
		}else if(num<40){
			color="초록색";
		}else{
			color="검정색";
		}
	}
	int showNum(){
		return num;
	}
}

public class Ex12 {

	public static void main(String[] args) {
		String[] note=new String[6];
		Ball[] box=new Ball[45];
		for(int i=0; i<box.length; i++){
			box[i]=new Ball(i+1);
		}
		
		for(int i=0; i<note.length; i++){
			// 공을 꺼낸다
			int ran=(int)(Math.random()*45)+1;
			Ball ball= box[ran];
			
			// 중복숫자를 확인
			if(ball.marking){
				// note에 작성
				note[i]=ball.color+"공"+ball.showNum();
				// marking
				ball.marking=false;
			}else{
				// 중복된 공이면 note--; (다시작성)
				i--;
			}			
		}
		for(int i=0; i<note.length; i++){
			System.out.println(note[i]);
		}
	}

}
