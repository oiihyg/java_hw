package java_lhh_day15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class EX03 {

	public static void main(String[] args) {

		/*
		 * 1 ~ 10 사이의 랜덤한 수 6개를 중복되지 않게 생성해서 저장하고 출력하는 코드를 작성
		 */
		// 1~10사이 랜덤한 수를 뽑음
		// 그 수를 set.add를 통해 넣음 false가 뜨면 다시 돌려서 넣음
		// 출력
		HashSet<Integer> set = new HashSet<Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		// 10개 set에 입력
		// list로 옮기고 랜덤 돌리기
		// 6개까지 줄이기
		for(int i=1;i<11;i++) {
			set.add(i);
		}
		list.addAll(set);
		for(int i=0;i<10;i++) {
			Collections.shuffle(list);
		}
		System.out.println(list);
		for(int i=list.size()-1;i>5;i--) {
			list.remove((int)i);
		}
		System.out.println(list);
		
		//
		set.clear();
		list.clear();
		
		int min = 1, max = 100;
		
		while(set.size()<6) {
			// int r = (int)(Math.random()*(max-min+1)+min);
			Random random = new Random();
			int r = random.nextInt(min,max+1);
			set.add(r);
		}
		System.out.println(set); // 10이하 숫자는 자동 정렬된다~ 
		
		
		
	}

}
