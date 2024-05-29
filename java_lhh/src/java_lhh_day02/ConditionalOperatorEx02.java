package java_lhh_day02;

public class ConditionalOperatorEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 조건 연산자 예제2
		// num가 짝수이면 짝수 홀수이면 홀수로 출력
		int num = 3;
		
		String resalt = (num % 2 == 0) ? "짝수" : "홀수";
		
		System.out.println(resalt);
		
	}

}
