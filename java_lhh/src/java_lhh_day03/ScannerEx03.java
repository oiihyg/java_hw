package java_lhh_day03;

import java.util.Scanner;

public class ScannerEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner 예제 값을 한번에 여러 개의 값을 받는 예제
		Scanner scan = new Scanner(System.in);
		
		// 3명의 학생의 성적을 한번에 입력받는 예제
		
		int score1, score2, score3;
		score1 = scan.nextInt();		
		score2 = scan.nextInt();		
		score3 = scan.nextInt();
		
		// 입력 방법은 spacebar or enter 사용
		System.out.println("세 학생의 성적 : "+score1+", "+score2+", "+score3);
		
	}

}
