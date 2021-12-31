package com.hi;

public class Ex07_t {

	public static void main(String[] args) {
		// 주민번호 체크기 (ver0.3.0)
		String msg="020501-4123456";
		for(int i=0; i<msg.length(); i++){
			char ch=msg.charAt(i);
			if(i==6){
				continue;
			}
			if(Character.isDigit(ch)){		// 숫자인지 아닌지
				
			}else{
				
			}
		}
	}

}
