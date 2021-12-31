package com.hi;

public class Ex03 {

	public static void main(String[] args) {
		String msg1="abcd";
		String msg2="abcabcda";
		String msg3="";
		String msg4="AaBbCcDd";
		String msg5="              java web    framework    db      ";
		
		//contains
		System.out.println(msg1.contains("bc"));		// 변수.contains(문자값) -> 컨테인스의 문자값이 앞의 변수의 주소값과 같은지 true, false
		
		//startsWith
		System.out.println(msg1.startsWith("ab"));		// 앞부분에 ""값이 들어가면 true, 아니면 false
		System.out.println(msg1.startsWith("AB"));
		
		//endsWith
		System.out.println(msg1.endsWith("cd"));		// 뒷부분에 ""값이 들어가면 true, 아니면 false
		System.out.println(msg1.endsWith("cde"));
		
		//isEmpty
		System.out.println(msg3.length()==0);
		System.out.println(msg3.isEmpty());				// ""안에 값이 비어있으면 true, 아니면 false
		
		//lastIndexOf
		System.out.println(msg2.lastIndexOf('a'));		// ''안의 마지막값이 몇번째 인덱스인지
		System.out.println(msg2.lastIndexOf('a',6));	// ''안의 마지막값이 0부터 ", "의 값 중에 몇번째 인덱스인지 
		
		//toUpperCase
		System.out.println(msg4.toUpperCase());			// 변수의 값을 모두 대문자로
		
		//toLowerCase
		System.out.println(msg4.toLowerCase());			// 변수의 값을 모두 소문자로
		
		//trim
		System.out.println(">>>"+msg5.trim()+"<<<");	// 변수값의 시작과 끝을기준으로 앞뒤의 공백을 없애준다
		
		//hashCode										//해쉬함수의 값을 리턴한다
	}

}
