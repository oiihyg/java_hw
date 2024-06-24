package java_lhh_day15;

import java.util.ArrayList;
import java.util.Scanner;

public class EX01 {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {

		/*
		 * 전화번호를 5번 입력받아 리스트에 저장하는 코드를 작성하세요
		 * 단, 전화번호는 올바르게 입력했다고 가정
		 */
		
		ArrayList<String> list = new ArrayList<String>();
		for(int i=0;i<5;i++) {
			System.out.print("입력해");
			String number = scan.next();
			list.add(number);
		}
		System.out.println(list);
		
		// 삭제할 전화 번호를 입력 받아 삭제하는 코드를 작성
		System.out.println("1 삭제 2 끄기");
		int num = scan.nextInt();
		switch (num) {
		case 1: 
			System.out.println("삭제할거? 뭐 삭제할거?");
			list.remove(scan.next());
			System.out.println(list + " 잘가");
			break;
		case 2:
			System.out.println("삭제안해? 잘가");
			break;
		default:
			System.out.println("다시 선택해");			
		}
		
	}

}
