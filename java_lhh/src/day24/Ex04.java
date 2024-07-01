package day24;

public class Ex04 {

	public static void main(String[] args) {
		
		int score = 90;
		
		/*
		 * A를 판별하는 코드를 작성해라~ A가 아닌 경우에도 A가 출력
		 * 원인 : || 
		 * 해결 : &&
		 */
		if(score >= 90 || score <= 100) {
			System.out.println("A");
		}
		
	}

}
