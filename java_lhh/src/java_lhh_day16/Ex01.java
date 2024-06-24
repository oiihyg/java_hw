package java_lhh_day16;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Ex01 {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		/*
		 * UP Down 게임 예제를 구하세요
		 * 랜덤으로 숫자를 마들고(1~100) 만들어진 숫자를 맞추는 게임
		 * 랜덤 : 33
		 * 입력 : 50
		 * Down!
		 * 입력 : 25
		 * Up!
		 * 입력 : 33
		 * 정답~
		 */
		ArrayList<Integer> list = new ArrayList<Integer>();
		HashSet<Integer> set = new HashSet<Integer>();
		int min = 1, max = 100;
		int r = (int)(Math.random()*(max-min+1)+min);
		
		System.out.println(r);
		
		int num;
		do {
			System.out.println("입력 : ");
			num = scan.nextInt();
			printResulr(r,num);
		}while(r!=num);		
		
	}
	public static void printResulr(int r, int num) {
		
		if(r>num) {
			System.out.println("up");
		}else if(r<num) {
			System.out.println("down");
		}
		else {
			System.out.println("정답");
		}
		
		
	}

}
