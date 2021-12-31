package com.hi;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Ex12_t {

	public static void main(String[] args) {
		// 로또번호생성기 (ver 0.3.0)
		Random ran=new Random();
		Set lotto=new TreeSet();
		while(lotto.size()!=6){
			lotto.add(ran.nextInt(45)+1);
		}
		Iterator card=lotto.iterator();
		while(card.hasNext()){
			System.out.print(card.next()+" ");
		}
	}

}
