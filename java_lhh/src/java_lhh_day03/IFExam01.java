package java_lhh_day03;

import java.util.Scanner;

public class IFExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		// 나이를 입력받아 성인 미성년자 구분
		int age=scan.nextInt();
		
		if(age>=19) {
			System.out.println("성인");
		}else {
			System.out.println("미성년자");
		}
		
	}

}
