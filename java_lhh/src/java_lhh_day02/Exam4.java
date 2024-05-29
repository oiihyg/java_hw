package java_lhh_day02;

public class Exam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 비교 연산자 예제
		int num1 = 10, num2 = 20;
			
		// 비교연산자 결과는 true or false
		System.out.println(""+num1+'<'+num2+" : "+(num1<num2));
		System.out.println(""+num1+'>'+num2+" : "+(num1>num2));
		System.out.println(""+num1+"<="+num2+" : "+(num1<=num2));
		System.out.println(""+num1+">="+num2+" : "+(num1>=num2));
		System.out.println(""+num1+"=="+num2+" : "+(num1==num2));
		System.out.println(""+num1+"!="+num2+" : "+(num1!=num2));
		
		// 문자열의 비교연산자는 주소를통해 같은지 안같은지 확인
		String str1 ="abc", str2 ="abc", str3 = new String("abc");
				System.out.println("str1==str2 : "+(str1==str2));
		System.out.println("str1==str3 : "+(str1==str3));
		System.out.println("str2==str3 : "+(str2==str3));
		
		// 문자열로 같은지 확인 하려면 .equals()를 통해 확인
		System.out.println("str1==str2 : "+(str1.equals(str2)));
		System.out.println("str1==str3 : "+(str1.equals(str3)));
		System.out.println("str2==str3 : "+(str2.equals(str3)));
		
		
	}

}
