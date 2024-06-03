package java_lhh_day05;

import java.util.Scanner;

public class ArrayEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1~10사이의 랜덤한 수 3개를 저장하고 출력하는 예제
		 * 숫자를 입력해서 입력한 숫자가 랜덤한 수에 있는지 확인하는 방법
		 */
		
		/*
		 * 방법1 
		 * 반복회수 : i는 0번지 부터 배열의 크기보다 작을 때까지 1씩 증가
		 * 규칙성 : 배열에 있는 값과 입력받은 값이 같으면 반복문을 종료
		 * 반복문 종료 후 : 배열의 크기보다 작으면 ~ 있습니다. 라고 출력 같으면 ~ 은 없습니다라고 출력
		 */
		
		/*
		 * 방법2
		 * 반복횟수 : 향상된 for문을 이용하여 전체 탐색
		 * 규칙성 : 배열의 값과 입력받은 값이 같으면 boolean result를 true로 변경하고, 반복문 종료
		 * 반복문 종료 후 : result가 true면 ~은 있습니다 출력하고 아니면 ~은 없습니다. 라고 출력
		 */
		// 입력을 위한 Scanner 선언
		Scanner scan = new Scanner(System.in);
		// 배열 선언
		int [] arr = new int[3];
		// 랜덤 범위 선정
		int min =1, max=10;
		// 랜덤 변수 설정
		int random;
		// 랜덤 정수 배열에 저장
		for(int i=0;i<arr.length;i++) {
			random=(int)(Math.random()*(max-min+1)+min);
			System.out.println("랜덤 수 : " + random);
			arr[i] = random;			
		}
		// 확인할 정수 입력
		int num = scan.nextInt();
		//방법 1
		// i변수 선언
		// i를 전역변수로 선언하여 반복문을 빠져나올때 i값으로 배열의 크기와 비교를 하여 다 반복하고 나온건지 중간에 break하고 나온건지 확인
		int i;
		for(i=0;i<arr.length;i++) {
			if(num==arr[i]) {
				break;
			}
		}
		// break로 나오면 배열의 크기보다 작을거고 아니면 배열의 크기보다 크게 나온다
		System.out.println(i<arr.length?"dd":"aa");
		
		// 방법2
		//boolean 우선 false로 만들고 있으면 true로 변경하는 방식
		boolean res = false;
		for(int tmp:arr) {
			if(tmp==num) {
				res=true;
				break;
			}
		}
		
		System.out.println(res==true?"dd":"aa");
		
		
		
		

	}

}
