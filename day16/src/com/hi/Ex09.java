package com.hi;

import java.util.Stack;

public class Ex09 {

	public static void main(String[] args) {
		// LILO (last-in-first-out).
		// Stack 구조 -> 후입선출방식 => ▤ : 맨밑의 막대기가 젤 마지막에 빠져나옴, 맨위의 막대기가 젤 먼저 빠져나옴
		java.util.Stack stack=new Stack();
		stack.push("첫번째");
		stack.push("두번째");
		stack.push("세번째");
		stack.push("네번째");
		
		while(!stack.empty()){		//isEmpty = x
			System.out.println(stack.pop());	// peek - 빼낼 정보의 첫내용
		}
		
	}

}
