package java_lhh_day05;

public class LCMEx01 {
	// LCM 최소공배수 약자
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 두 정수의 최소 공배수를 구하는 코드를 작성하세요
		 * A의 배수 B : B를 A로 나누었을 때 나머지가 0인 B를 A의 배수라고 표현.
		 * 6의 배수 : 6 12 18 24 ...
		 * 8의 배수 : 8 16 24 32 ...
		 * 공배수 : 두 수의 배수 중 공통으로 있는 수
		 * 6과 8의 공배수 : 24 48 78 ...
		 * 최소 공배수 : 두 수의 공배수 중 가장 작은 수
		 * 6과 8의 최소 공배수는 : 24
		 * 반복횟수 : 1부터 무한대까지 진행 1씩
		 * 규칙성 : i가 num1의 배수익 i가 num2의 배수이면 i를 출력한 후 반복문 종료
		 * 		=> i를 num1로 나누었을 때 나머지가 0과 같고 i를 num2로 나누었을 때 0rhk rkxekaus
		 * 		   i를 출력한 후 반복문 종료
		 * 반복문 종료 후 : 
		 */
		
		int num1 = 6, num2 = 8;
		int i;
		// for 종료 조건 없이 시작하면 무한으로 진행
		for(i=1;;i++) {
			if(i%num1==0 && i%num2==0) {
				System.out.println(num1+"과 "+num2+"의 최소 공배수 : "+i);
				break;//반복문 종료
			}
		}
		
		// num1이 num2보다 작으면 num1과 num2를 바꾸는 코드(두 수를 바꾸는 코드)
		// num1 = 111 num2 = 30000 이면 num1과 num2를 바꾸는 코드
		int tmp;
		if(num1 < num2) {
			tmp = num1;
			num1 = num2;
			num2 = tmp;
		}
		/*
		 * 반복횟수 : i는 num1부터 무한대까지 num1씩 증가 => i는 num1의 배수만 사용
		 * 규칙성 : i는 num2의 배수이면 i를 출려하고 반복문 종료
		 * 반복문 종료 후 :
		 */

		for(i=num1;;i+=num1) {
			if(i%num2==0) {
				System.out.println(num1+"과 "+num2+"의 최소 공배수 : "+i);
				break;//반복문 종료
			}
		}
		
		
	}

}
