package java_lhh_day16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import lombok.Data;

public class Ex02 {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {

		/*
		 * UP Down 게임 예제를 구하세요
		 * - 최대 5등까지 저장하며, 먼저 등록된 순으로 저장
		 * - 아이디를 입력받아 저장
		 * 메뉴
		 * 1. 플레이
		 * 2. 기록확인
		 * 3. 종료
		 * 메뉴 선택 :
		 */
		int menu;
		List<Record> list = new ArrayList<Record>();
		
		do {
			// 메뉴 출력
			printMenu();
			// 메뉴 선택
			menu = scan.nextInt();
			// 선택한 메뉴에 따른 기능
			runMenu(menu, list);
			
		}while(menu!=3);
		
		
	}
	
	private static void runMenu(int menu, List<Record> list) {
		switch (menu) {
		case 1:
			int count = play();
			record(list, count);
			break;
		case 2:
			printRecord(list);
			break;
		case 3:
			System.out.println("종료합니다.");
			break;
		default:
			System.out.println("잘못된 메뉴입니다.");
		}
	}

	private static void printRecord(List<Record> list) {
		// 기록이 없으면 등록된 기록이 없습니다.
		if(list.size()==0) {
			System.out.println("등록된 기록이 없습니다.");
			return;
		}
		// 기록이 있으면 등수. 아이디 ?횟수 형태로 출력
		for(int i=0;i<list.size();i++) {
			System.out.println(i+1+". "+list.get(i));
		}
		
	}

	private static void record(List<Record> list, int count) {
		// 저장된 기록이 5명 미만이면
		if(list.size()<5) {
			// 아이디를 입력 받고
			System.out.println("ID : ");
			String id = scan.next();
			// 아이디와 횟수를 이용해서 객체를 생성
			Record record = new Record(count, id);
			// 리스트에 생성된 객체를 추가
			list.add(record);
			// Collections.sort를 이용하여 정렬
			Collections.sort(list);
			// 종료
			return;
		}
		// 5등 기록과 내 기록을 비교해서 내 기록이 좋으면
		final int Max_Record_count = 5;
		if(count < list.get(Max_Record_count -1).getCount()) {
			System.out.println("ID : ");
			String id = scan.next();
			Record record = new Record(count, id);
			list.set(Max_Record_count -1, record);
			Collections.sort(list);
		}
		
		System.out.println(list);
		
		
	}

	private static int play() {
		int min=1 ,max=100;
		int random = random(min,max);
		int num, count =0;
		System.out.println("플레이");
		System.out.println("정답 : "+random);
		do {
			System.out.println("입력 : ");
			num = scan.nextInt();
			printResulr(random,num);
			count++;
		}while(random!=num);
		// 저장 방식을 만
		return count;
	}

	private static void printMenu() {
		System.out.print("메뉴\r"
				+ "1. 플레이\r"
				+ "2. 기록확인\r"
				+ "3. 종료\r"
				+ "메뉴 선택 : ");		
	}

	public static int random(int min, int max) {
		if(min > max) {
			int tmp = min;
			min = max;
			max = tmp;
		}
		return (int)(Math.random()*(max-min+1)+min);
	}
	
	public static void printResulr(int random, int num) {
		
		if(random>num) {
			System.out.println("up");
		}else if(random<num) {
			System.out.println("down");
		}
		else {
			System.out.println("정답");
		}		
	}

}

@Data
class Record implements Comparable<Record>{
	
	private int count;
	private String ID;
	
	@Override
	public int compareTo(Record o) {
		return count - o.count;
	}

	@Override
	public String toString() {
		return ID + ", " + count+"회";
	}

	public Record(int count2, String id2) {
		// TODO Auto-generated constructor stub
	}

	
	
	
	
}
