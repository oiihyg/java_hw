package java_lhh_day03;

import java.util.Scanner;

public class IFEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// if, else if, else 사용~~~~~~~~~
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		if(num==0) {
			System.out.println("0");
		}else if(num>0){
			System.out.println("양수");
		}else {
			System.out.println("음수");
		}
		
		
		
	}

}
