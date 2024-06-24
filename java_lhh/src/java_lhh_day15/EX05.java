package java_lhh_day15;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class EX05 {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		/*
		 *  숫자 야구 게임을 구현하세요
		 *  S : 숫자가 있고 위치가 같은 경우
		 *  B : 숫자가 있고 위치가 다른 경우
		 *  O : 일치하는 숫자가 하나도 없는 경우
		 */

		// 중복되지 않은 1~9사이의 3개의  숫자를 생성
		int min = 1, max = 9, count = 3;
		List<Integer> com = createRandom(min,max,count);
		System.out.println(com);
		List<Integer> user;
		int strike, ball;
		
		do {
			strike = ball = 0;
			System.out.println("입력 : ");
			user = inputUser(min, max, count, scan);
			System.out.println(user);
			
			strike = getStrike(com, user);
			ball = getBall(com, user);
			
			if(strike != 0) {
				System.out.print(strike+"S");
			}
			if(ball != 0) {
				System.out.print(" "+ball+"B");
			}
			System.out.println();
		}while(strike != 3);
		System.out.println("프로그램을 종료합니다.");
	}
	
	private static int getBall(List<Integer> com, List<Integer> user) {
		if(com.size() != user.size()) {
			throw new RuntimeException("크기가 달라 판별할 수 없습니다.");
		}
		int ball = 0;
		// 일치하는 숫자가 있는지 개수를 셈 (ball + strike)
		for(int tmp1 : com) {
			if(user.contains(tmp1)) {
				ball++;
			}
		}
		
		return ball - getStrike(com, user);
	}
	
	private static int getStrike(List<Integer> com, List<Integer> user) {
		if(com.size() != user.size()) {
			throw new RuntimeException("크기가 달라 판별할 수 없습니다.");
		}
		int strike = 0;
		for(int i=0;i<com.size();i++) {
			if(com.get(i) == user.get(i)) {
				strike++;
			}
		}
		return strike;
	}
	
	private static List<Integer> inputUser(int min, int max, int count, Scanner scan2) {
		// 1,3이 와야 하는데 3,1이 온 경우 1,3으로 변경
		if(min > max ) {
			int tmp = min;
			min = max;
			max = tmp;
		}
		if(max-min+1<count) {
			String format = "{0}~{1} 사이에서 중복되지 않는 {2}개의 수를 만들 수 없습니다.";
			throw new RuntimeException(MessageFormat.format(format, min,max,count));
		}
		
		List<Integer> tmp = new ArrayList<Integer>();
		while(tmp.size() < count) {
			int num = scan.nextInt();
			if(!tmp.contains(num)) {
				tmp.add(num);
			}
		}
		
		return tmp;
	}
	
	private static List<Integer> createRandom(int min, int max, int count) {
		// 1,3이 와야 하는데 3,1이 온 경우 1,3으로 변경
		if(min > max ) {
			int tmp = min;
			min = max;
			max = tmp;
		}
		if(max-min+1<count) {
			String format = "{0}~{1} 사이에서 중복되지 않는 {2}개의 수를 만들 수 없습니다.";
			throw new RuntimeException(MessageFormat.format(format, min,max,count));
		}
		
		HashSet<Integer> set = new HashSet<Integer>();
		while(set.size()<count) {
			int r = (int)(Math.random()*(max-min+1)+min);
			set.add(r);
		}
		List<Integer> list = new ArrayList<Integer>();
		list.addAll(set);
		
		Collections.shuffle(list);
		
		return list;
	}

}
