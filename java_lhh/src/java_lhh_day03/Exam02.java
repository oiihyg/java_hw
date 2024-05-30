package java_lhh_day03;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 3명의 성적을 입력하고 총점과 평균을 구해라
		
		Scanner scan = new Scanner(System.in);
		System.out.print("학생1 성적을 입력 : ");
		int scoreA = scan.nextInt();
		System.out.print("학생2 성적을 입력 : ");
		int scoreB = scan.nextInt();
		System.out.print("학생3 성적을 입력 : ");
		int scoreC = scan.nextInt();
		
		int sum1=scoreA+scoreB+scoreC;
		double avg=sum1/3.0; //형변환
		
		System.out.println("총점 : "+sum1+"점. 평균 : "+avg);
		

	}

}
