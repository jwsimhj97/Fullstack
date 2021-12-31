package com.hi;

class Ball{
	private final int num;
	boolean marking;
	String color;
	public Ball(int num){
		this.num=num;
		marking=true;
		if(num<10){
			color="�����";
		}else if(num<20){
			color="�Ķ���";
		}else if(num<30){
			color="������";
		}else if(num<40){
			color="�ʷϻ�";
		}else{
			color="������";
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
			// ���� ������
			int ran=(int)(Math.random()*45)+1;
			Ball ball= box[ran];
			
			// �ߺ����ڸ� Ȯ��
			if(ball.marking){
				// note�� �ۼ�
				note[i]=ball.color+"��"+ball.showNum();
				// marking
				ball.marking=false;
			}else{
				// �ߺ��� ���̸� note--; (�ٽ��ۼ�)
				i--;
			}			
		}
		for(int i=0; i<note.length; i++){
			System.out.println(note[i]);
		}
	}

}
