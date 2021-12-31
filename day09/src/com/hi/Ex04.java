package com.hi;

class Car{
	public static final int MORNING=1;
	public static final int K3=1;
	public static final int K5=1;
	public static int number;
	
	public String color;
	public final String name;
	public int speed;
	public int max;
	
	public Car(int mod){
		number+=1111;
		if(mod==1){
			color="";
			name="¸ð´×";
			max=120;
		}else if(mod==2){
			color="";
			name="k3";
			max=150;
		}else if(mod==3){
			color="";
			name="k5";
			max=180;
		}else{
			color="";
			name="ºØºØÀÌ";
			max=100;
		}
	}
	
	public Car(String a, int b){
		color="";
		name=a;
		max=b;
	}
	
	public Car(String a, String b, int c){
		color=a;
		name=b;
		max=c;
	}
	
	public void speedUp(){
		if(speed+10>max){
			speed=max;
		}else{
			speed+=10;
		}
	}
	public void speedDown(){
		if(speed-10<0){
			speed=0;
		}else{
			speed-=10;
		}
	}
	public void speedShow(){
		System.out.println("Â÷·®¹øÈ£"+number+" ³»Â÷ "+name+"Àº "+speed+"km·Î ´Þ¸°´Ù");
	}
}

public class Ex04 {

	public static void main(String[] args) {
		Car mycar=new Car(Car.MORNING);
		mycar.speedShow();
		for(int i=0; i<20; i++){
			mycar.speedUp();
			mycar.speedShow();
		}
		mycar.color="³ë¶û»ö";
		for(int i=0; i<20; i++){
			mycar.speedDown();
			mycar.speedShow();
		}

		mycar=new Car(3);
//		mycar.color="Áã»ö";
//		mycar.name="k3";
//		mycar.max=180;
		mycar.speedShow();
		for(int i=0; i<20; i++){
			mycar.speedUp();
			mycar.speedShow();
		}
		for(int i=0; i<20; i++){
			mycar.speedDown();
			mycar.speedShow();
		}
	}

}
