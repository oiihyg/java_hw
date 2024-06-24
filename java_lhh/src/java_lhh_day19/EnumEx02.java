package java_lhh_day19;

import java.util.Scanner;

public class EnumEx02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("계절을 입력하세요(1봄2여름3가을4겨울) : ");
		int num = scan.nextInt();
		/*
		Season2 = Season2.fromValue(num);
		
		switch (s) {
		case SPRING:
			System.out.println("봄");
			break;
		case SUMMER:
			System.out.println("여름");
			break;
		case FALL:
			System.out.println("가을");
			break;
		case WINTER:
			System.out.println("겨울");
			break;
		}
		
		*/
	}

}


enum Season2{
	SPRING(1),
	SUMMER(2),
	FALL(3),
	WINTER(4);
	
	private final int value; // 1,2,3,4로 했기 때문에 정수인 int
	
	private Season2(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
	
	// 정수를 이용하여 열거형 객체를 선택하는 클래스(정적) 메소드
	public static Season2 fromValue(int value) {
		for(Season2 tmp : Season2.values()) {
			if(tmp.getValue() == value) {
				return tmp;
			}
		}
		throw new IllegalArgumentException("잘못된 계절입니다.");
	}
	
}