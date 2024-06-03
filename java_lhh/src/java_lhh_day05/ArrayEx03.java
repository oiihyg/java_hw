package java_lhh_day05;

public class ArrayEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1~10사이의 랜덤한 수 3개를 저장하고 출력하는 코드를 작성하시오
		 */
		int [] scores = new int[3];
		int min =1, max=10;
		//
		for(int i=0;i<scores.length;i++) {
			int random=(int)(Math.random()*(max-min+1)+min);
			System.out.println("랜덤 수 : " + random);
			scores[i] = random;
		}
		
		for(int i=0;i<scores.length;i++) {
			System.out.println(scores[i]);
		}
		
		
	}

}
