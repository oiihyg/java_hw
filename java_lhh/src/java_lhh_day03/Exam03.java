package java_lhh_day03;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		//2개의 과목 성적을 입력하고 평균 60점이 넘으면 합격 아니면 불합격 단 각점수 과락(40점) 없을경우
		
		//성적 입력
		int score1 = scan.nextInt();
		int score2 = scan.nextInt();
		
		//성적 평균
		double avg=(score1+score2)/2.0;
		
		if(avg>=60) {
			if(score1<40 || score2<40) {
				System.out.println("불합격");
			}else {
				System.out.println("합격");
			}	
		}else {
			System.out.println("불합격");
		}
		
		//boolean 방법
		// 평균이 60이고 과락이 아닌걸 확인
		// avg가 60이상 이고 isFail이 아닐때
		boolean isFail = score1 < 40 || score2 <40;
		String res = (avg >= 60 && !isFail) ? "합격" : "불합격";
		
		System.out.println(res);
		
		
		
	}

}
