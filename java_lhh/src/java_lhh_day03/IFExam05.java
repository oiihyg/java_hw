package java_lhh_day03;

import java.util.Scanner;

public class IFExam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//정수를 입력받아 2,3,6의 배수인지 아닌지 판별하라
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num=scan.nextInt();
		
		if(num%2==0 && num%3==0) {
			System.out.println("6의 배수 입니다.");
		}else if(num%2==0) {
			System.out.println("2의 배수 입니다.");
		}else if(num%3==0) {
			System.out.println("3의 배수 입니다.");
		}else {
			System.out.println("2,3,6의 배수가 아닙니다~");
		}

		// 이왕이면 숫자가 적은거부터~
		if(num%2==0 && num%3!=0) {
			System.out.println("2의 배수 입니다.");
		}else if(num%3==0 && num%2!=0) {
			System.out.println("3의 배수 입니다.");
		}else if(num%6==0) {
			System.out.println("6의 배수 입니다.");
		}else {
			System.out.println("2,3,6의 배수가 아닙니다~");
		}

	
		
		
		
	}

}
