package day24;

public class Ex03 {

	public static void main(String[] args) {
		
		/*
		 * 원인 : if문에 ; 들어감
		 */
		
		int num = 2;
		
		if(num%2==0); {
			System.out.println("짝수");
			
		}
		
		if(num%2!=0); {
			System.out.println("홀수");
		}
		
		
	}

}
