package java_lhh_day03;

import java.util.Scanner;

public class SwitchExam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 월을 입력받아 입력받은 월의 계절을 출력하세요.
		 * 3,4,5 : 봄
		 * 6,7,8 : 여름
		 * 9,10,11 : 가을
		 * 12, 1, 2: 겨울
		 * 그 외 : 잘못된 월
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int month=scan.nextInt();
		
		switch(month) {
		case 3,4,5:
			System.out.println("봄");
		break;
		case 6: case 7: case 8:
			System.out.println("여름");
		break;
		case 9: case 10: case 11:
			System.out.println("가을");
		break;
		case 12: case 1: case 2:
			System.out.println("겨울");
		break;
		default:
			System.out.println("잘못된 월");
		}
		
		
	}

}
