package day24;

public class Ex12 {

	public static void main(String[] args) {
		/*
		 * 1+2의 결과를 출력
		 * 원인 : sum 메소드는 리턴 타입이 없기 때문에 정수에 저장 할 수 없습니다
		 * 해결 : 정수에 저장하지 않거나 sum메소드에 리턴타입을 추가
		 */
		//int res = sum(1,2);
		//->sum(1,2);
		
	}
	
	public static void sum(int num1, int num2) {
		System.out.println(num1+num2);
	}

}
