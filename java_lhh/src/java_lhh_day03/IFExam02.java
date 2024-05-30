package java_lhh_day03;

import java.util.Scanner;

public class IFExam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		// 월을 입력받아 봄, 여름, 가을, 겨울 구분 345 678 91011 1212
		int month=scan.nextInt();
		
		if(month==3 || month==4 || month==5) {
			System.out.println("봄");
		}
		else if(month==6 || month==7 || month==8) {
			System.out.println("여름");
		}
		else if(month==9 || month==10 || month==11) {
			System.out.println("가을");
		}
		else if(month==12 || month==1 || month==2) {
			System.out.println("겨울");
		}
		else {
			System.out.println("잘못된 월");
		}
		
		if(month>=3 && month <=5) {
			System.out.println("봄");
		}
		else if(month>=6 && month<=8) {
			System.out.println("여름");
		}
		else if(month>=9 && month<=11) {
			System.out.println("가을");
		}
		// or and 같이 쓸 때는 이왕이면 () 같이 사용 의도치 않는 에러가 생길 수 있음
		else if(month==12 || (month>=1 && month<=2)) {
			System.out.println("겨울");
		}
		else {
			System.out.println("잘못된 월");
		}

		
	}

}
