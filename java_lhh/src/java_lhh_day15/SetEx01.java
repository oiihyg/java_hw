package java_lhh_day15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class SetEx01 {

	public static void main(String[] args) {

		/*
		 * Set 기본 예제
		 */
		HashSet<Integer> set = new HashSet<Integer>();
		
		// add(객체) : 객체를 set에 추가, 중복된 경우 false를 리턴
		System.out.println(set.add(1));
		System.out.println(set.add(1));
		System.out.println(set.add(2));
		System.out.println(set.add(4));
		System.out.println(set);
		System.out.println("-------------");
		
		// remove(객체) : 객체를 set에서 제거, 없으면 false를 리턴
		System.out.println(set.remove(2));
		System.out.println(set.remove(151));
		System.out.println(set);
		System.out.println("-------------");
		
		// contains(객체) : set에 객체가 있으면 true, 없으면 false를 리턴
		System.out.println(set.contains(11));
		System.out.println(set.contains(1));
		System.out.println(set);
		System.out.println("-------------");
		
		// size() : 저장된 개수
		System.out.println(set);
		System.out.println(set.size());
		System.out.println("-------------");
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		// addAll(컬렉션) : 컬렉션에 있는 원소들을 추가. 컬렉션
		list.addAll(set);
		System.out.println(list);
		list.add(8);
		list.add(9);
		list.add(10);
		System.out.println(list);
		System.out.println("-------------");
		
		// Collection.shuffle(리스트) : 리스트를 섞어 줌
		Collections.shuffle(list);
		System.out.println(list);
		System.out.println("-------------");
		
	}

}
