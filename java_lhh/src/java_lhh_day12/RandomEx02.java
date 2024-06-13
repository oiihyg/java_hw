package java_lhh_day12;

import java.util.Random;

public class RandomEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// min ~ max 사이의 랜덤한 수를 만드는 코드를 작성하세요~
		// r1.nextInt(min,max); ???
		
		Random r2 = new Random(); // 현재 시간을 seed값으로 활용하면 매번 실행마다 다른 패턴의 랜덤수를 생성할 수 있다.
		System.out.println();
		int min =1, max=3;
		for(int i=0;i<100;i++) {
			int num = r2.nextInt(1,3+1);
			System.out.print(num+" "+(i%30==29?"\n":""));
		}
		
		
	}

}
