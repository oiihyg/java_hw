package java_lhh_day19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		/* 리스트에 문자열을 5개 입력받아 저장하는 예제
		 * */
		final int MAX = 5;
		List<String> list = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<MAX;i++) {
			System.out.print("문자열 입력 : ");
			String str = scan.nextLine();
			list.add(i, str);
		}
		
		System.out.println(list);
		
		/* 문자열 A를 입력받아 리스트에 A를 포함하는 문자열들을 출력하는 예제
		 * */
		System.out.print("검색할 문자열 입력 : ");
		String keyWord = scan.next();
		
		for(String tmp : list) {
			if(tmp.contains(keyWord)) {
				System.out.println(tmp);
			}
		}
	}
	
}
