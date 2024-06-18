package java_lhh_day15;

import java.util.ArrayList;
import java.util.Scanner;

public class EX02 {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {

		/*
		 * 다음 기능을 가진 프로그램을 작성하세요
		 * 메뉴
		 * 1. 번호 추가
		 * 2. 번호 삭제
		 * 3. 번호 조회
		 * 4. 종료
		 */
		ArrayList<String> list = new ArrayList<String>();
		int num;
		
		do {
			System.out.println("메뉴 선택해라");
			System.out.println("1. 추가 2. 삭제 3. 조회 4. 종료");
			num = scan.nextInt();
			switch (num) {
			case 1:
				System.out.println("추가할거? 추가해");
				list.add(scan.next());
				break;
			case 2: 
				System.out.println("삭제할거? 뭐 삭제할거?");
				list.remove(scan.next());
				System.out.println(list + " 잘가");
				break;
			case 3:
				System.out.println("뭐 검새할거? 싫어 내가 왜");
				list.contains(scan.next());
				System.out.println(list + " 잘가");
				break;
			case 4:
				System.out.println("끌거? 응 꺼져");
				break;
			default:
				System.out.println("다시 선택해");			
				break;
			}
		}while(num !=4 );
		
		
		
		
		
	}

}
