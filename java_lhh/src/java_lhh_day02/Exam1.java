package java_lhh_day02;

public class Exam1 {

	public static void main(String[] args) {

		/*
		 * 자료 형변환
		 * - 상수 변수 리터럴의 자료형을 일시적으로 변환시키는 것
		 */
		
		double num1 =3; // 자동형변환이 동작. 정수를 실수를 변환하여 저장
		long num2 = 3; // 자동 자료형변환 동작 정수 리터럴은 int
		int num3 = 3; // 형변환X
		long num4 = num3; // 자동 자료형변환 동작 정수 리터럴은 int
		int num5 = (int)3.14; // 명시적 자료형변환을 통해 실수를 정수로 변환(일시적)
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		
		byte num6 = (byte)num5;
		System.out.println(num6); //명시적 자료형변환을 했지만 짤리는 값이 없는 경우
		byte num7 = (byte)123456;
		System.out.println(num7); //명시적 자료형변환을 했지만 짤리는 값이 있는 경우

		//자동 자료형변환이 일어나지만 명시적 자료형변환이 필요한 경우
		double res =1/2; // 1/2의 결과인 0이 자동자료형변환을 통해 0.0으로 변환
		System.out.println(res);
		
		res = 1 / (double)2; // 2를 명시적 자료형변환으로 변환하여 1/2.0을 계산해서 0.5계산
		System.out.println(res);
		
		
	}

}
