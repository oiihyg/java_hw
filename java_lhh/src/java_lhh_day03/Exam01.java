package java_lhh_day03;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 성적을 입력하여 60점 이상이면 pass 미만이면 fail
		
		//입력 변수
		Scanner scan = new Scanner(System.in);
		System.out.print("성적을 입력 : ");
		int score = scan.nextInt();
		
		//60점 이상이면 pass 아니면 fail
		if(score >= 60) {
			System.out.println(score+"점은 Pass");
		}else {
			System.out.println(score+"점은 fail");
		}
		
		// boolean 사용
		boolean isA;
		isA = score >= 60;
		System.out.println(score+"점은 "+isA);
		
		// 조건식 진행
		String str = (score >= 60) ? "Pass" : "Fail";
		System.out.println(score+"점은 "+str);
		
	}

}
