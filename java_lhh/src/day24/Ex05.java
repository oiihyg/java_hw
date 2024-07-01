package day24;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		/*
		 * 문자열을 입력받아 exit가 아니면 입력한 문자열을 출력하고 exit면 종료하는 코드 작성
		 * 원인 : false, ==, continue 
		 * 해결 : true, equals, break
		 */
		Scanner scan = new Scanner(System.in);
		
		boolean res = false;
		
		while (res) {
			System.out.println("문자열 입력 : ");
			String str = scan.next();
			if(str.equals("exit")) {
				continue;
			}
			System.out.println(str);
		}
		
	}

}
