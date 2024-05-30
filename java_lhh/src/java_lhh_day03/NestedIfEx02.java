package java_lhh_day03;

import java.util.Scanner;

public class NestedIfEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("입력~ : ");
		int num1=scan.nextInt();
		String str=scan.next();
		int num2=scan.nextInt();
		int asd;
		
		
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
