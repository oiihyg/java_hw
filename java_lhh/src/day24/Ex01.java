package day24;

public class Ex01 {

	public static void main(String[] args) {
		
		int num1 = 4;
		double num2 = num1;
		
		/*
		 * 에러 발생
		 * 원인 : num2가 double라 / 실수를 정수로 자동 자료형변환 하려 했기 때문에 
		 * 해결 방법 : num3를 double나 num2를 int로 변경
		 */
		
		//double num3 = num2;
		//int num3 = num2;
		int num3 = (int)num2;
		System.out.println(num3);
		
	}

}
