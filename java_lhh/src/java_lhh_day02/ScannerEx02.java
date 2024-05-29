package java_lhh_day02;

import java.util.Scanner; // 스캔 설정

public class ScannerEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 두 정수와 연산자를 입력 받고 입력받은 결과를 콘솔에 출력
		 */
		// Scanner scan 입력 후 ctrl+shift+o -> import 자동 설정
		Scanner scan = new Scanner(System.in); //scan 설정 
		
		
		int num1 = scan.nextInt(); // 정수 입력
		String str1 = scan.next(); // 연산자 입력
		int num2 = scan.nextInt(); // 정수 입력
		
		System.out.println(num1+str1+num2); // 출력
		
	}

}
