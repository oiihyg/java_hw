package java_lhh_day07;

import java.util.Scanner;

public class ArrayEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 3명의 학생의 국어, 영어, 수학 성적을 입력 받고
		 * 각 학생의 평균을 구하는 코드를 작성하세요
		 */
		// 문득 생각난 이중배열 하는 방법 알아봄
		int[][] aaa = new int[3][3];
		
		for(int i=0;i<aaa.length;i++) {
			for(int j=0;j<aaa.length;j++) {
				//System.out.print(aaa[i][j]);
				//System.out.println();
			}
		}

		// 반복문을 이용하여 학생 성적을 입력
		// i = 0 i < 3 i++		
		// 학생(i+1)의 성적 입력 문구를 출력
		// 국어, 영어, 수학 점수를 입력 => 배열에 저장
		int [] kor, eng, mth;
		int StudentCount = 3;
		kor = new int[StudentCount];
		eng = new int[StudentCount];
		mth = new int[StudentCount];
		int sum;
		double avg;
		Scanner scan = new Scanner(System.in);
		
		// 학생 점수 입력하는 문제 
		for(int i=0;i<StudentCount;i++) {
			System.out.println("학생"+(i+1)+"의 성적을 입력하세요(국,영,수 순) : ");
			
			kor[i] = scan.nextInt();
			eng[i] = scan.nextInt();
			mth[i] = scan.nextInt();
		}
		// 학생 평균 구하는 문제 
		for(int i=0;i<StudentCount;i++) {
			sum = kor[i] + eng[i] + mth[i];
			avg = sum/3.0;
			System.out.println("학생"+(i+1)+"의 평균은 : "+avg);
		}
		
		// 각 과목의 평균 구하는 문제
		for(int i=0;i<StudentCount;i++) {
			if(i==0) {
				sum = kor[i] + kor[i+1] + kor[i+2];
				avg = sum/3.0;
				System.out.println("국어의 평균은 : "+avg);
			}else if(i==1) {
				sum = eng[0] + eng[1] + eng[2];
				avg = sum/3.0;
				System.out.println("영어의 평균은 : "+avg);
			}else {
				sum = mth[0] + mth[1] + mth[2];
				avg = sum/3.0;
				System.out.println("수학의 평균은 : "+avg);
			}
		}
		

	}

}
