package java_lhh_day06;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 4과목의 성적을 입력받아 배열에 저장하고,
		 * 과락(40점)이 없고 평균이 60점이 넘으면 Pass,
		 * 아니면 Fail라고 출력하세요.
		 */
		
		// 입력 하기 위한 Scanner 설정
		Scanner scan = new Scanner(System.in);
		// 배열 선언
		System.out.print("몇 과목인지 입력 하시오 : ");
		int arr[] = new int[scan.nextInt()];
		// 평균을 구하기 위한 sum 변수 선언
		int sum=0;
		// 점수를 배열에 입력
		for(int i=0; i<arr.length;i++) {
			System.out.print("점수를 입력 하시오 : ");
			arr[i]=scan.nextInt();
			// 점수 입력하면서 sum 같이 구하기
			sum += arr[i];
		}
		System.out.println(Arrays.toString(arr));
		
		// 평균 구하기 avg 평균 변수 선언 및 계산
		double avg = sum/(double)arr.length;
		// pass fail 을 구하기 위한 boolean 선언
		boolean asd = true;
		// 과락 확인을 위한 boolean을 이용한 반복문 선언
		for(int i=0; i<arr.length;i++) {
			if(arr[i]<=40) {
				asd = false;
			}
		}
		
		// 과락이 아니고 평균이 60점 이상이면 Pass 아니면 Fail
		if(asd==true && avg >= 60) {
			System.out.println("Pass : " +avg);
		}else {
			System.out.println("Fail");
		}

	}

}


