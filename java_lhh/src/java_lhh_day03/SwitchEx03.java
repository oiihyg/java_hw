package java_lhh_day03;

import java.util.Scanner;

public class SwitchEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 산술연산자와 두 정수를 입력받아 입력값과 값을 출력
		Scanner scan = new Scanner(System.in);
		
		System.out.print("두 정수와 산술 연산자를 입력하세요");
		int num1 = scan.nextInt();
		char operator = scan.next().charAt(0);
		int num2 = scan.nextInt();
		
		switch(operator) {
		case '+':
			System.out.println(""+num1+operator+num2+"="+(num1+num2));
			break;
		case '-':
			System.out.println(""+num1+operator+num2+"="+(num1-num2));
			break;
		case '*':
			System.out.println(""+num1+operator+num2+"="+(num1*num2));
			break;
		case '%':
			System.out.println(""+num1+operator+num2+"="+(num1%num2));
			break;
		case '/':
			System.out.println(""+num1+operator+num2+"="+(num1/(double)num2));
			break;
		default:
			System.out.println(operator+"는 산술 연산자가 아닙니다.");
		
		}
		
		
	}

}
