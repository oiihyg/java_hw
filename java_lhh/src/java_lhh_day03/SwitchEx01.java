package java_lhh_day03;

public class SwitchEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * switch(변수){
		 * case 값1:
		 * 		실행문1;
		 * 		break;
		 * 
		 */
		int num=3;
		
		switch(num%2) {
		case 0:
			System.out.println(num+"는 짝수");
			break;
		default:
			System.out.println(num+"는 홀수");
		}
		
	}

}
