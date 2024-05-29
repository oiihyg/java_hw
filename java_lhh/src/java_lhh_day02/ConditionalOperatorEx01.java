package java_lhh_day02;

public class ConditionalOperatorEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 조건 연산자 예제
		
		//주어진 나이에 따라 성인, 미성년자를 출력하는 예제
		//나이 주어짐
		int age=20;
		
		//문자열로 출력 할거니까 String
		// ? 뒤 참이면 전자 거짓이면 후자
		String result=(age >= 19) ? "성인":"미성년자";
		
		// 출력
		System.out.println(result);
	}

}
