package com.room802;

public class Ex07 {

	public static void main(String[] args) {
		// Q4. 1+3+5+7+9=000 를 출력하시오
		System.out.println("1+3+5+7+9=000");

		System.out.println("-----------------------");

		System.out.print('+');
		System.out.print(1);
		System.out.print('+');
		System.out.print(3);
		System.out.print('+');
		System.out.print(5);
		System.out.print('+');
		System.out.print(7);
		System.out.print('+');
		System.out.print(9);
		System.out.print('=');
		System.out.print(1+3+5+7+9);

		System.out.println("\n-----------------------");
		
		int sum=0;
		for(int i=1; i<10; i+=2){
			sum+=i;
			if(i!=1){System.out.print('+');}
			System.out.print(i);
		}
		System.out.print('=');
		System.out.print(1+3+5+7+9);

		System.out.println("\n-----------------------");
		
		sum=0;
		for(int i=1; i<=10; i++){
			if(i%2!=0){
				System.out.print(i);
			}else if(i!=10){
				System.out.print('+');
			}else{
				System.out.print('=');
			}
		}
		System.out.println(sum);

		System.out.println("-----------------------");
		
		String msg="";
		sum=0;
		for(int i=1; i<10; i++){
			if(i%2!=0){
				msg+=i;
				sum+=i;
			}else{
				msg+='+';
			}
		}
		msg+="="+sum;
		System.out.println(msg);
	}

}
