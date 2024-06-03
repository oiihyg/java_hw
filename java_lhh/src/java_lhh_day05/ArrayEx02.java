package java_lhh_day05;

import java.util.Scanner;

public class ArrayEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 학생 3명의 성적을 저장하는 배열을 생성하고,
		 * 학생 3명의 성적을 콘솔을 통해 입력받고,
		 * 출력하는 코드를 작성하시오.
		 * 입력받은 성적의 평균을 구하는 코드를 작성하세요
		 */

		Scanner scan = new Scanner(System.in);
		
		int [] scores1 = new int[3];
		int sum = 0;
		for(int i=0;i<3;i++) {
			System.out.println("학생"+(i+1)+"의 성적 : ");
			scores1[i] = scan.nextInt();
			sum += scores1[i];
		}
		

		// 배열이름.length 를 사용하면 배열의 크기를 나타낸다 
		for(int i=0;i<scores1.length;i++) {
			System.out.println("학생"+(i+1)+"의 성적 : "+scores1[i]);
		}
		
		// 배열이름.length 를 사용하면 배열의 크기를 나타낸다 
		double avg = sum/(double)scores1.length;
		System.out.println("학생 총점은 : " +sum);
		System.out.println("학생 평균은 : " +avg);
		
		
	}

}
