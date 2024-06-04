package java_lhh_day06;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * UpDown 게임에 다음 기능을 추가하세요.
		 * 메뉴
		 * 1. 플레이
		 * 2. 기록확인
		 * 3. 종료
		 * 메뉴 선택 : 
		 * (랜덤이 35라고 가정)
		 * 정수 입력 : 50
		 * Down
		 * 정수 입력 : 30
		 * Up
		 * 정수 입력 : 35
		 * 정답입니다.
		 * 맞힌 횟수는 3회 입니다.
		 * 기록이 등록됩니다.
		 * 메뉴
		 * 1. 플레이
		 * 2. 기록확인
		 * 3. 종료
		 * 메뉴 선택 : 2
		 * 기록 확인
		 * 1. 3회
		 * 메뉴
		 * 1. 플레이
		 * 2. 기록확인
		 * 3. 종료
		 * 메뉴 선택 : 3
		 * 프로그램을 종료 합니다.
		 */
		// 정렬 방법 Array.sort(arr,시작번지,마지막 번지) 시작부터 ~ 마지막 선언까지만 정렬 
		Scanner scan = new Scanner(System.in);
		// 메뉴 선택 변수 선언
		int menu;
		// 입력 변수 선언
		int num;
		// 맞춘 횟수 카운트 변수 선언
		int count = 0;
		// 플레이 기록을 위해 배열 선언 5번까지 기록
		int PlayLog [] = new int[5];
		// 순위 지정하기
		int score[] = new int[5];
		// 순위 저장 변수
		int stp;
		
		// 메뉴 만들기
		for(int i=0;i<PlayLog.length;i++) {
			System.out.println(" ");
			System.out.println("메뉴를 선택해 주세요 ~ ");
			System.out.println("1. 게임 시작");
			System.out.println("2. 기록 확인");
			System.out.println("3. 종료");
			// 메뉴 입력
			menu = scan.nextInt();
			// 메뉴 선택 
			// 게임 시작 메뉴
			if(menu == 1) {
				// 랜덤 함수 선정
				int min = 1, max = 100;
				int random = (int)(Math.random()*(max - min + 1)+min);
				System.out.println("랜덤한 수 : "+random);
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
						count += 1;
					}else if(num<random) {
						System.out.println("UP");
						count += 1;
					}else {
						System.out.println("정답");
						count += 1; // 정답도 카운트 하기
						PlayLog[i] = count;
						count = 0; // 카운트 초기화 
						
					}
				}while(random != num); // 랜덤한수가 입력한 정수와 같지 않을 때 반복 진행
			}
			// 기록 메뉴
			// 기록 템프의 기록 불러오기 선언
			else if(menu==2) {
				for(int tmp : PlayLog) {
					System.out.print(tmp+" ");
				}
				i -= 1; // 계속 반복하게 만들기
			}
			// 종료 메뉴
			// 종료시 플레이 기록에 있는 기록 전부 초기화 후 break
			else if(menu==3){
				System.out.println("플레이를 종료 합니다.");
				for(int j=0;j<PlayLog.length;j++) {
					PlayLog[j] = 0;
				}
				break;
			}else {
				System.out.println("잘못된 입력입니다.");
				i -= 1; // 계속 반복하게 만들기
			}
			
		}
		System.out.println("게임이 종료 되었습니다. 다시 시작해 주세요 ");
		System.out.println("5판 게임 기록");
		for(int tmp : PlayLog) {
			System.out.print(tmp+" ");
		}


		// 추가 보완점
		// 1. 계속 반복하게 할 것
		// 2. 메뉴에서 3이상의 숫자를 입력 하면 잘못된 입력 방식이라고 한다
	}

}
