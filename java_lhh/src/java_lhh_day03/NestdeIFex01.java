package java_lhh_day03;

public class NestdeIFex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//중첩 if문
		int  num = 6;
		
		if(num%2==0) {
			if(num%3==0) {
				System.out.println("6의 배수입니다.");
			}else {
				System.out.println("6의 배수가 아닙니다.");				
			}
		}else {
			System.out.println("6의 배수가 아닙니다.");
		}
			
	}

}
