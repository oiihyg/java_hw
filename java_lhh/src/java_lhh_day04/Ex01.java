package java_lhh_day04;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1~100사이의 랜덤한 수를 생성하여 해당 숫자를 맞추는 게임을 작성하세요
		 * 예 랜던한 수가 30
		 * DOWN
		 * 정수 입력 : 20
		 * up
		 * ~ 진행 하면서 정답을 맞추는 게임
		 */
		
		int min = 1, max = 100;
		int random = (int)(Math.random()*(max - min + 1)+min);
		System.out.println("랜덤한 수 : "+random);
		
		Scanner scan = new Scanner(System.in);
		int num;
		//최소 한번은 입력 받는건 do while 문 작성
		do {
			//정수 입력이라는 안내 문구 출력
			System.out.println("정수 입력 : ");
			//정수 입력, 변수는 밖에서 선언 진행
			num = scan.nextInt();
			// DOWN인지 UP인지 정답인지 판별
			/*
			 * num가 random 보다 크다면 DOWN 출력
			 * num가 random 보다 작으면 UP으로 출력
			 * num가 random이 같으면 정답입니다 출력
			 */
			if(num>random) {
				System.out.println("DOWN");
			}else if(num<random) {
				System.out.println("UP");
			}else {
				System.out.println("정답");
			}
		}while(random != num); // 랜덤한수가 입력한 정수와 같지 않을 때 반복 진행
	}

}
