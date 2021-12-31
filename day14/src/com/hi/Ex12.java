package com.hi;

public class Ex12 {

	public static void main(String[] args) {
		// crud
		StringBuilder msg=new StringBuilder("abcd");	//StringBuffer = StringBuilder 거의 똑같다
		System.out.println(msg.append("efg"));			//msg에 efg를 붙인다
		System.out.println(msg.insert(3, "ABC"));		//msg에 3의 자리에 ABC를 넣는다
		System.out.println(msg.replace(3, 6, "123"));	//msg에 3자리부터 6자리까지 123을 넣는다
		System.out.println(msg.delete(3, 6));			//msg에 3자리부터 6자리까지를 삭제한다
	}

}
