package java_lhh_day05;

import java.util.Scanner;

public class ArrayEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 3개의 정수를 입력을 받아 배열에 저장하고,
		 * 역순으로 출력하는 코드를 작성하세요.
		 */
		Scanner scan = new Scanner(System.in);
		int [] num = new int[3];
		
		for(int i=0;i<num.length;i++) {
			num[i] = scan.nextInt();	
		}
		
		// 역순으로 출력
		for(int i=0;i<num.length;i++) {
			// i=0 => 2번지
			// i=1 => 1번지
			// i=2 => 0번지
			//		2-i번지 => 배열의 길이 -1 -i 번지
			System.out.print(num[num.length-1-i]+" ");
		}
		System.out.println();
		// 역순으로 출력 2번째 방법
		for(int i=num.length-1;i>=0;i--) {
			// i=0 => 2번지
			// i=1 => 1번지
			// i=2 => 0번지
			//		2-i번지 => 배열의 길이 -1 -i 번지
			System.out.print(num[i]+" ");
		}
	}

}
