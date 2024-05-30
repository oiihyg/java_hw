package java_lhh_day03;

import java.util.Scanner;

public class IFExam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//산술연산자와 두 정수를 입력받아 산술연산자에 맞는 연산 결과를 출력하는 코드를 작성하세요
		
		Scanner scan = new Scanner(System.in);
		
		int num1=scan.nextInt();
		String str=scan.next();
		int num2=scan.nextInt();
		int asd;
		System.out.println("입력~ : "+num1+str+num2);
		
		if(str.equals("+")) {
			asd = num1+num2;
			System.out.println(num1+str+num2+"="+asd);
		}else if(str.equals("-")) {
			asd = num1-num2;
			System.out.println(num1+str+num2+"="+asd);
		}
		else if(str.equals("/")) {
			asd = num1/num2;
			System.out.println(num1+str+num2+"="+asd);
		}
		else if(str.equals("*")) {
			asd = num1*num2;
			System.out.println(num1+str+num2+"="+asd);
		}else {
			System.out.println(str+" 산술연산자가 아닙니다.");
		}
		
			

	}

}
