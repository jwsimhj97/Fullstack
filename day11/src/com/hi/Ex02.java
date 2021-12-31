package com.hi;

public class Ex02 {

	public static void main(String[] args) {
		String msg="abcdefg";		
		String msg2="abcabcd";
		//equals
		//getBytes
		//toCharArray
		
		//charAt		
		char ch1=msg.charAt(1);						// 결과값 b; charAt(x) - 인덱스x번째의 값
		System.out.println(ch1);
		
		//concat
		String result1=msg.concat("\\|"+msg);			// int su=1+2;의 식과는 다른 더함이다. int->1+2=3 / String->1+2=12
		String result2=msg+"ABCD";
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(msg);
		
		//indexOf
		System.out.println(msg.indexOf('c'));
		System.out.println(msg2.indexOf('c',0));	// indexOf('char', 시작점?)
		System.out.println(msg2.indexOf("cd"));		// 결과값 5; ""의 시작인덱스번호
		
		//length
		System.out.println(msg2.length());			// 갯수
		for(int i=0; i<msg2.length(); i++){
			System.out.print(msg2.charAt(i));
		}
		
		System.out.println();
		
		//replace
		String result3=msg2.replace('d','D');		// 앞의값을 뒤의 값으로 변경
		String result4=msg2.replace('b','B');
		String result5=msg2.replace("b","B");
		String result6=msg2.replace("cab", "cb");	// 문자열을 추가하거나 더해서 넣을수있다 ex) String msg="abcd"; => msg.replace("ab","acdb"); => acdbcd
		System.out.println(result3);
		System.out.println(result6);
		
		//substring
		String result7=msg2.substring(2);			// ()인덱스값의 앞의 갚을 날린다
		String result8=msg2.substring(2,5);			// 앞의 인덱스 값부터 뒤의 인덱스값이 시작되기전의 지점을 제외한 나머지값을 날린다
		System.out.println(result7);
		System.out.println(result8);
		
		//toString
		System.out.println(msg.toString());			// 셀프 리턴
		
		//valueOf 
		String result9=String.valueOf(3.14);
		String result10=String.valueOf(true);		// 모든것을 문자열(String)으로 바꿔준다
		System.out.println(result9);
		System.out.println(result10);
	}

}
