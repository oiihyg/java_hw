package java_lhh_day03;

import java.util.Scanner;

public class IFExam04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 정수를 입력 받아 3의 배수인지 아닌지 판별하라
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num1=scan.nextInt();
				
		if(num1 % 3 == 0) {
			System.out.println("3의 배수 입니다.");
		}else {
			System.out.println("3의 배수가 아닙니다.");
		}
		
	}

}
