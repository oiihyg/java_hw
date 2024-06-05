package java_lhh_day07;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 입력한 문자열이 배열에 있는지 없는지 확인하는 코드를 작성하세요
		 * 단어입력 (종료:-1) : apple
		 * 단어를 추가했습니다.
		 * 단어입력 (종료:-1) : dog
		 * 단어를 주가햇습니다.
		 * 단어입력 (종료:-1) : dog
		 * 종료합니다. 
		 */
		
		String [] list = new String[] {"cat","dog","banana"};

		String word;
		Scanner scan = new Scanner(System.in);
		boolean res;		
		
		while(true) {
			// 인내문구 출력
			System.out.println("단어 입력 (종료 : -1) : ");
			// 단어를 입력
			word = scan.next();
			// 단어가 -1이면 종료합니다.
			if(word.equals("-1")) {
				System.out.println("종료합니다.");
				break;
			}
			res = false;
			// 리스트에 단어가 있는지 확인
			for(String tmp : list) {
				if(word.equals(tmp)) {
					res = true;
					break;
				}
				
			}
			
			// 있으면 있다고 출력, 없으면 없다고 출력
			if(res) {
				System.out.println("있는 단어 입니다.");
			}else {
				System.out.println("없는 단어 입니다.");
			}
			
		}
		
		
	}

}
