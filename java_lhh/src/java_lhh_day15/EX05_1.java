package java_lhh_day15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class EX05_1 {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {

		// 내가 한거
		HashSet<Integer> ballList = new HashSet<Integer>();
		HashSet<Integer> useBall = new HashSet<Integer>();
		ArrayList<Integer> ball = new ArrayList<Integer>();
		int min = 1, max = 9;
		
		// 반복문
		// 중복되지 않은 1~9사이의 3개의  숫자를 생성
		while(ballList.size()<3) {
			// int r = (int)(Math.random()*(max-min+1)+min);
			Random random = new Random();
			int r = random.nextInt(min,max+1);
			ballList.add(r);
		}
		ball.addAll(ballList);
		Collections.shuffle(ball);
		System.out.println(ball);
		System.out.println("1~9 사이의 숫자를 입력하시오");
		// 사용자가 숫자 3개를 중복되지 않게 1~9사이의 값을 입력
		for(int i=0;i<ball.size();i++) {
			int num = scan.nextInt();
			if(num>9) {
				System.out.println("9보다 큽니다 다시 입력하세요");
				i--;
			}
			else if(useBall.add(num) == false) {
				System.out.println("값이 중복됩니다. 다시 입력하세요.");
				i--;
			}
			useBall.add(num);
		}
		// 입력한 값과 랜덤 값을 이용하여 결과를 출력
		
	}

}
