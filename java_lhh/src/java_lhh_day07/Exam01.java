package java_lhh_day07;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 다음 메뉴를 출력하고 메뉴를  선택하면 안내문구 를 출력하는 코드를 작성
		 * 메뉴
		 * 1. 추가
		 * 2. 검색
		 * 3. 종료
		 * 1 => 추가 했습니다.
		 * 2 => 검색했습니다.
		 * 3 => 프로그램을 종료합니다.
		 * 4 => 잘못된 메뉴입니다.
		 */

		Scanner scan = new Scanner(System.in);
		int num;
		
		do {
			System.out.println("메뉴");
			System.out.println("1. 추가");
			System.out.println("2. 검색");
			System.out.println("3. 종료");
			System.out.print("메뉴 선택 : ");
			num = scan.nextInt();
			switch(num) {
				case 1:
					System.out.println("추가했습니다");
					break;
				case 2:
					System.out.println("검색했습니다.");
					break;
				case 3:
					System.out.println("프로그램을 종료합니다");
					break;
				default :
					System.out.println("잘못된 메뉴입니다");
					break;
			}
		}while(num != 3);
		
	}

}
