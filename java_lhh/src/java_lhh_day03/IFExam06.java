package java_lhh_day03;

import java.util.Scanner;

public class IFExam06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//성적을 입력받아 성적에 맞는 학점을 출력하는 코드를 작성하라
		Scanner scan = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int score = scan.nextInt();
		
		if(score < 0 || score > 100) {
			System.out.print("잘못된 성적입니다.");
		}else if(score>=90) {
			System.out.print("A");
		}else if(score>=80) {
			System.out.print("B");
		}else if(score>=70) {
			System.out.print("C");
		}else if(score>=60) {
			System.out.print("D");
		}
		else {
			System.out.print("F");
		}
		
		
		
	}

}
