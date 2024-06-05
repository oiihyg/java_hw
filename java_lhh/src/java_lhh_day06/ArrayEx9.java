package java_lhh_day06;

import java.util.Scanner;

public class ArrayEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] list = {"dog","cat","java","cup","computer"};
		
		/*
		 * 문자열을 입력받아 입력받은 문자열이 있는지 없는지 알려주는 코드 작성
		 */
		
		// 입력 스캔 준비 완료! 
		Scanner scan = new Scanner(System.in);
		// 문자열 입력 받기
		System.out.println("찾을 문자열 입력 : ");
		String str = scan.next();
		// 문자열이 있는지 없는지 확인하기
		boolean res = false;
		for(String tmp : list) {
			if(str.equals(tmp)) {
				res = true;
				break;
			}
		}
		if(res) {
			System.out.println(str+"가 있습니다.");
		}else {
			System.out.println(str+"가 없습니다.");
		}
		
		
	}

}
