package java_lhh_day02;

import java.util.Scanner;

public class ScannerEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		
		/*
		 * println -> 값을 출력하고 자동으로 줄바꾸기
		 * print -> 값을 출력
		 */
		System.out.print("점수를 입력하세요 : ");
		int num = scan.nextInt(); // 정수 입력
		System.out.println(num);
		
		System.out.print("실수를 입력하세요 : ");
		double num2 = scan.nextDouble(); // 실수입력
		System.out.println(num2);
		
		System.out.print("단어를 입력 : ");
		String str1 = scan.next(); // 단어 입력
		System.out.println(str1);
		
		scan.nextLine(); // scan.nextLine(); 사용시 앞에 입력한 공백 제거용 
		System.out.print("문장를 입력 : ");
		// 앞에 입력된 공백을 제거 해야 정상 작동 (scan.nextLine();) 
		String str2 = scan.nextLine(); // 엔터까지 한 문장을 가져옴 
		System.out.println(str2);
		
		/*
		 *  next()를 통해서 문자열을 가져오고,
		 *  String 클래스에서 제공하는 charAt(번지) 기능을 통해 번지 글자를 가져오는 기능
		 *  ex) 이문장의 3번지는? -> charAt(3) -> '의' p.s. 0부터 시작  
		 */
		System.out.print("문자를 입력 : ");
		char ch = scan.next().charAt(0);
		System.out.println(ch);
		
	}

}
